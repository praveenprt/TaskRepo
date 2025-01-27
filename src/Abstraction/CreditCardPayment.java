package Abstraction;


public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("you paid from credit card "+ amount);
		
	}

	@Override
	public void refund(double amount) {

		System.out.println("your refund from credit card "+ amount);
		
	}

	

}
