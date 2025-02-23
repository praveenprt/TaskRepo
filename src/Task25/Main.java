package Task25;

public class Main {
	   public static void main(String[] args) {
	        BankAccount sharedAccount = new BankAccount(500); // Initial balance: $500

	        // Creating multiple customer threads trying to withdraw money
	        Thread customer1 = new Customer(sharedAccount, "Rohit", 200);
	        Thread customer2 = new Customer(sharedAccount, "Rahul", 300);
	        Thread customer3 = new Customer(sharedAccount, "Sachin", 100);
	        Thread customer4 = new Customer(sharedAccount, "Sahil", 150);

	        // Starting all threads
	        customer1.start();
	        customer2.start();
	        customer3.start();
	        customer4.start();
	    }
	}

