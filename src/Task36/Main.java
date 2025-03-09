package Task36;

import java.util.Base64;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;


public class Main {

	public static String encodeString(String str) {
		return Base64.getEncoder().encodeToString(str.getBytes());
	}
	
	public static void main(String[] args) {
		String name ="Person";
		String password ="Per@123";
		
		String encodedPassword = encodeString(password);
		
		Person person = new Person(1, name, encodedPassword);
		System.out.println(person);
		Scanner sc = new Scanner(System.in);
		int count=0;
		boolean accessGranted = false;
		
		while (count <3) {
			System.out.println("Enter your Password");
			String pass =sc.nextLine();
			
			String decodedPassword = new String(Base64.getDecoder().decode(encodedPassword));
			
			if(pass.equals(decodedPassword)) {
				System.out.println("Access Granted");
				accessGranted = true;
				break;
				
			}
			else {
				count++;
				if(count<3) {
					System.out.println("Oops wrong password"+(3-count));
				}
				else {
					System.out.println("You are blocked for 24 hours. Try again later");
				}
			}
		}
	}
	
	
}
