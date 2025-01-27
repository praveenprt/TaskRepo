package EncapsulationProgram;

public class Main {
	public static void main (String[] args) {
		
		BankAccount BA = new BankAccount(120,"Rahul",100);
		System.out.println(BA);
		BA.deposit(150);
		System.out.println(BA);
		BA.withdraw(150);
		System.out.println(BA);
		
		BankAccount BA1 = new BankAccount(150,"Rohit",500);
		System.out.println(BA1);
		BA1.deposit(100);
		System.out.println(BA1);
		BA1.withdraw(50);
		System.out.println(BA1);
		
		
		
	}

}
