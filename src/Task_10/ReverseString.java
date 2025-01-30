package Task_10;

public class ReverseString {

	public static boolean isVowel(char ch ) {
		
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
	}
	
	
	public static String rev(String str) {

	StringBuilder s1 = new StringBuilder();
	
	for(int i =str.length()-1; i>=0; i--) {
		char ch = str.charAt(i);
		
		if(!isVowel(ch)) {
s1.append(ch);
		}
	}
	return	s1.toString();
		
	}
	
	public static void main(String[] args) {

		System.out.println(rev("Hello World"));
	}

}
