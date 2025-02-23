package Task25;

public class Customer extends Thread {
    private BankAccount account;
    private String customerName;
    private double withdrawalAmount;

    public Customer(BankAccount account, String customerName, double withdrawalAmount) {
        this.account = account;
        this.customerName = customerName;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        account.withdraw(customerName, withdrawalAmount);
    }
}
