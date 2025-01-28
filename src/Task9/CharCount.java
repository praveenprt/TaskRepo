package Task9;

public class CharCount {
	
	public static int countChar(String str , char ch) {
		
		if(str == null) {
			return 0;
		}
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch)
				count ++;
		}
	return count;
}
	
	public static void main(String[] args) {
		String str = " This is String";
		char ch = 'i';
		
		int count = countChar(str,ch);
		System.out.println(count + " times ");
		

		
	}
}
