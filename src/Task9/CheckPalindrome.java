package Task9;

public class CheckPalindrome {

	public static boolean checkPalindrome(String str) {
		int i=0 ,j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return  false;
			}
			i++;
			j--;
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		boolean s1 = checkPalindrome("Abcsdfsea");
		boolean s2 = checkPalindrome("MADAM");
		boolean s3 = checkPalindrome("Random");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
