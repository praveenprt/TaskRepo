package EncapsulationProgram;

public class BankAccount {

	private int accountNumber;
	private String accountHolder;
	private int balance;
	
	
	public BankAccount(int accountNumber, String accountHolder, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	

	public BankAccount() {
	}



	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance="
				+ balance + "]";
	}
	
	
	public void deposit(int depo) {
		balance = depo + balance;
		System.out.println(accountHolder + " Your Amount has deposited " + balance + " inr");
		
	}
	public void withdraw(int withd) {
		balance =  balance - withd;
		System.out.println(accountHolder + " Your withdrawl amount " + balance + " inr");
		}
	
	
}
