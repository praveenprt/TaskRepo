package Abstraction;

public class PayPalPayment implements Payment {

	
	@Override
	public void pay(double amount) {
		System.out.println("you paid from PayPal "+ amount);
		
	}

	@Override
	public void refund(double amount) {

		System.out.println("your refund from Paypal "+ amount);
		
	}
}
