package Task30;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class BatchTransaction {

	public static void batchInsertTransaction(List<Transaction> transactions) throws SQLException {
		String insertTransactionString = "INSERT INTO transactions(account_id,type,amount) VALUES(?,?,?)";
		try(Connection conn = DatabaseConn.getConnection();
				PreparedStatement stmt = conn.prepareStatement(insertTransactionString)
				){
			conn.setAutoCommit(false);
			
			try {
				for(Transaction tx : transactions ) {
					stmt.setInt(1, tx.getAccountID());
					stmt.setString(2, tx.getType());
					stmt.setDouble(3,tx.getAmount());
					stmt.addBatch();
				}
				stmt.executeBatch();
				conn.commit();
				
				System.out.println("Batch insert successfull. ");
				
				
			} catch (SQLException e) {
			
				conn.rollback();
				System.out.println("Batch insert failed");
			}
		}
		
	}
}
