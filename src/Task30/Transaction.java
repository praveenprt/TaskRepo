package Task30;

public class Transaction {
private int accountId;
private String type;
private double amount;

public Transaction (int accountId, String type, double amount) {
	this.accountId = accountId;
	this.type = type;
	this.amount = amount;
}

public int getAccountID() {
	return accountId;
}

public String getType() {
	return type;
	
}

public double getAmount() {
	return amount;
}
}
