package PolymorphismProgram;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum1 =	cal.add(10, 20);
		int sum2 =	cal.add(25, 10, 40);
		String d =	cal.detail("Hello", " World");

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(d);
	
	}

}
