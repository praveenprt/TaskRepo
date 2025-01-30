package Task10;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {

		String str1 ="abcsde";
		String str2 = "edsabc";
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.equals(c1, c2));
	}

}
