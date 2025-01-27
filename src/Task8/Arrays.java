package Task8;

public class Arrays {
	
	public static void main(String []args) {
	int[] arr = {10,20,30,40,50};
	
	double sum = 0;
	double average; 
	
	for(int i=0; i<arr.length; i++) {
		sum = sum + arr[i];
	}
	average = sum / arr.length;
	
	System.out.println("Arrays Elements ");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println("sum of arrays "+sum);
	System.out.println("Average of arrays  "+average);
	
}	}