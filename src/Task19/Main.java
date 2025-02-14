package Task19;

import Task19.Rectangle.Circle;

public class Main {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20) {
			
			@Override
			public double calculateArea() {
				return width*height;
			}
			};

			System.out.println("Rectangle Area "+rectangle.calculateArea());
	Rectangle.Circle  circle =new  Rectangle.Circle(5);

	

	System.out.println("Circle Area "+circle.calculateArea());
	
	}
	
	
}
