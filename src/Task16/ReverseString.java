package Task16;

public class ReverseString {

	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else {
			return reverse(str.substring(1))+str.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		String str = "Hello world";
		String reversed =  reverse(str);
		System.out.println("Reversed String : " + reversed);
	}
	
}
