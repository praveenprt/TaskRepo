package Task12;

import java.util.Scanner;

public class AgeValidator {

	public static void validAge(int age) throws InvalidAgeExeception{
		if(age <= 0) {
			throw new InvalidAgeExeception("Error : Age must be greater than 0");
					}
		else  {
			System.out.println("Age is valid : " + age);
			}
		}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		try {
			System.out.println("Enter age");
			int age = s1.nextInt();
			
			validAge(age);
			
		} catch (InvalidAgeExeception e) {
			System.out.println(e.getMessage());
			
		}
		 catch (Exception e) {
				System.out.println("Enter in numbers ");
				
			}
		
		finally {
	s1.close();
		}
		
	}
}
