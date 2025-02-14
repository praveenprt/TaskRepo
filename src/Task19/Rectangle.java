package Task19;

 abstract class Rectangle implements Shape{
	

	protected double width;
	protected double height;
	
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	public static class  Circle implements Shape{
		private double radius;
		
		public Circle (double radius) {
			this.radius = radius;
			
		}
		
		@Override
		public double calculateArea() {
			return Math.PI*radius*radius;
		}
	}
}
