package Task21;

public class AverageCalculator {

	public static double calculateAverage(double... number) {
		if(number.length == 0) {
			throw new IllegalArgumentException(" Invalid");
		}
		double sum =0;
		for (double num : number) {
			sum+= num;
		}
		return sum/number.length;
	}
	public static void main(String[] args) {
		System.out.println(calculateAverage(12,15,45,54,45,64,6));

		System.out.println(calculateAverage(4,4,54,5,4,45,4));
	}
	
}
