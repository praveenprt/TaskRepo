package Task17;

import java.util.Stack;

public class ReverseString {

	public static String reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		StringBuilder reversed = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			reversed.append(stack.pop());
		}
		return reversed.toString();
		
	}
	
	public static void main(String[] args) {
		String input ="Hello world";
		
	 String reversed= 	reverseString(input);
	
	 System.out.println(" Reversed String :- "+ reversed);
	}
	
}
