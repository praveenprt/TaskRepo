package Task8;

public class MaxMin {
	public static void main(String[] args) {
		int[] num = { 6, 7, 5, 4, 3, 8 };

		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length;i++ ) {
			if(num[i]> max) {
				max = num[i];
			}
			if(num[i] < min) {
				min = num[i];
			}
			
			}
		System.out.println("Arrays Elements ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
			
		}
		System.out.println("Maximum value  " +max);
		

		System.out.println("Minimum value  " +min);
		
	}

}
