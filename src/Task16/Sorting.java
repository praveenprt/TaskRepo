package Task16;

public class Sorting {

	public static void bubbleSort(int[] arr) {
		int n= arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		printArray(arr);
	}
	
	
	public static void selectionSort(int []arr) {
		int n=arr.length;
		for (int i=0; i<n-1; i++) {
			int min=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		printArray(arr);
		
	}
	
	
	public static void printArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " +arr[i]);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int[] arr = {10,1,2,4,47,48,44,11};
		bubbleSort(arr);
		selectionSort(arr);
	
	
	}
	
	
}
