package Task30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankingService {

	public static void deposit(int accountId, double amount) throws SQLException{
		String updateBalance = "UPDATE accounts set balance = balance + ? where account_id = ?";
		String insertTransaction = "INSERT INTO transactions (account_id, type, amount) values(?,'DEPOSIT',?)";
		
		try(Connection conn = DatabaseConn.getConnection()){
			conn.setAutoCommit(false);
			
			try(PreparedStatement stmt1 = conn.prepareStatement(updateBalance);
					PreparedStatement stmt2 = conn.prepareStatement(insertTransaction)
					){
				stmt1.setDouble(1, amount);
				stmt1.setInt(2, accountId);
				stmt1.executeUpdate();
				
				stmt2.setInt(1, accountId);
				stmt2.setDouble(2, amount);
				stmt2.executeUpdate();
				
				conn.commit();
				
				System.out.println("Deposit Successfull");
			}
			catch (SQLException e) {
		conn.rollback();
		System.out.println(" Transaction failed");
		
			}
		}
	}
	
	
	public static void withdraw(int accountid, double amount) throws SQLException{

		String checkBalance = "SELECT balance from accounts where account_id = ?";
		String UpdateBalance ="UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
		String insertTransaction = "INSERT INTO transactions (account_id, type, amount) values (?, 'WITHDRAW', ?)";

	
		try(Connection conn = DatabaseConn.getConnection()){
			conn.setAutoCommit(false);
			
		
			try (PreparedStatement stmt1 = conn.prepareStatement(checkBalance);
				     PreparedStatement stmt2 = conn.prepareStatement(UpdateBalance);
				     PreparedStatement stmt3 = conn.prepareStatement(insertTransaction)) {
				     
				    stmt1.setInt(1, accountid);
				    try (var rs = stmt1.executeQuery()) {  
				        if (rs.next() && rs.getDouble(1) < amount) {
				            System.out.println("Insufficient funds");
				            conn.rollback();
				            return;
				        }
				    }

				    stmt2.setDouble(1, amount);
				    stmt2.setInt(2, accountid);
				    stmt2.executeUpdate();

				    stmt3.setInt(1, accountid);
				    stmt3.setString(2, "WITHDRAW");
				    stmt3.setDouble(3, amount);
				    stmt3.executeUpdate();

				    conn.commit();
				    System.out.println("Withdrawal successful");
				} catch (SQLException e) {
				    conn.rollback();
				    System.out.println("Transaction failed");
				    e.printStackTrace();
				}
			
			
		}
		
	}
	
}













