// Name : Eden Admoni , Number Question : Question 3 , Name file : Circle.java
public class Circle {
	private double xCoordinate;
	private double yCoordinate;
	private double radius;
	
	// build method א סעיף
	/**
	 * @param xCoordinate
	 * @param yCoordinate
	 * @param radius
	 */
	public Circle(double xCoordinate, double yCoordinate, double radius) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.radius = radius;
	}
	
	// circumference method ב סעיף
	public double circumference() {
		return 2*Math.PI*radius;}
	// area method ג סעיף
	public double area() {
		return Math.PI*Math.pow(radius, 2); }

	// toString method ד סעיף
	@Override
	public String toString() {
		return "Circle [xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate + ", radius=" + radius
				+ ", circumference()=" + circumference() + ", area()=" + area() + "]";
	}


	
}
