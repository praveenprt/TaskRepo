package Task_10;

import java.lang.reflect.Array;

public class ReverseArray {
	
	
	public static void reverseArray(int[] arr) {
		int len = arr.length;
		
		for(int i=0; i<len / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[len - 1 -i];
			arr[len - 1 - i] = temp;
		}	
	}
	
	
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6};
		
		reverseArray(arr);
		
		System.out.println(" Reversed array");
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	
	
	}
		
}
