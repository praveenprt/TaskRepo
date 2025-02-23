package Task25;

public class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public synchronized void withdraw(String customerName, double amount) {
	        if (amount > balance) {
	            System.out.println(customerName + " tried to withdraw Rs " + amount + " - Insufficient funds! Current balance: Rs " + balance);
	        } else {
	            System.out.println(customerName + " is withdrawing Rs " + amount);
	            balance -= amount;
	            System.out.println("New balance after " + customerName + "'s withdrawal: Rs " + balance);
	        }
	    }
	}

	class BankCustomer extends Thread {
	    private BankAccount account;
	    private String customerName;
	    private double withdrawalAmount;

	    public BankCustomer(BankAccount account, String customerName, double withdrawalAmount) {
	        this.account = account;
	        this.customerName = customerName;
	        this.withdrawalAmount = withdrawalAmount;
	    }

	    @Override
	    public void run() {
	        account.withdraw(customerName, withdrawalAmount);
	    }
	}

	