package Task30;

import java.sql.SQLException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try {
		BankingService.deposit(1, 500);
		BankingService.withdraw(1, 200);
		
		
		BatchTransaction.batchInsertTransaction(Arrays.asList(
				new Transaction(1,"DEPOSIT", 300),
				new Transaction(2,"WITHDRAW", 150),
				new Transaction(3,"DEPOSIT", 1000)
				));
			
		} catch (SQLException e) {
			
		}
	}
}
