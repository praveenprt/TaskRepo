package Task12;

import java.util.Scanner;

public class DivisionByZero {
	
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		try {
			System.out.println("Enter divisor number");
			int divisor = s1.nextInt();
			
			System.out.println("Enter divider number");
			int divider = s1.nextInt();
			
			int result = divisor / divider;
			System.out.println("Result "+result);
			
			
		}
		
		catch (Exception e) {
			System.out.println("Erorr : " + e.getMessage());
			
		}
		
		finally {
			s1.close();
			System.out.println("Finaly block executed");
		}
	
	}

}
