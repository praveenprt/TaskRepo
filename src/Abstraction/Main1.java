package Abstraction;



public class Main1 {
	public static void main(String [] args) {
	
		CreditCardPayment cp = new CreditCardPayment();
		cp.pay(250);
		cp.refund(50);

		PayPalPayment pp = new PayPalPayment();
		pp.pay(500);
		pp.refund(100);
	}

}

