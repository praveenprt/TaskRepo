package Abstraction;

public class Main {
	public static void main(String [] args) {
		
		Circle c1 = new Circle(5);
		System.out.println("Circle radius " + 	c1.calculateArea());
		Rectangle r1 = new Rectangle(5,15);
		System.out.println("Rectangle area " + 	r1.calculateArea());
	
		
	}
}
