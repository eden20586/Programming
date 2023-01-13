// Name : Eden Admoni , Number Question : Question 4 , Name file : Rectangle.java
public class Rectangle {
	private double x1Coordinate;
	private double y1Coordinate;
	private double x2Coordinate;
	private double y2Coordinate;
	//build method א סעיף
	/**
	 * @param x1Coordinate
	 * @param y1Coordinate
	 * @param x2Coordinate
	 * @param y2Coordinate
	 */
	public Rectangle(double x1Coordinate, double y1Coordinate, double x2Coordinate, double y2Coordinate) {
		this.x1Coordinate = x1Coordinate;
		this.y1Coordinate = y1Coordinate;
		this.x2Coordinate = x2Coordinate;
		this.y2Coordinate = y2Coordinate;
	}
	// height = y2 - y1
	// width = x2 - x1
	
	// return area  ב סעיף
	// area = a * b
	public double area() {
		return (x2Coordinate - x1Coordinate) * (y2Coordinate - y1Coordinate); }
	
	// return perimeter ג סעיף
	// perimeter = 2*(a+b)
	public double perimeter() {
		return 2 * ((x2Coordinate- x1Coordinate) + (y2Coordinate - y1Coordinate)); }
	
	// return diagonal ד סעיף
	//
	public double diagonal() {
		return Math.sqrt(Math.pow(x2Coordinate - x1Coordinate , 2) + Math.pow(y2Coordinate - y1Coordinate, 2));
	}

	// ה סעיף
	@Override
	public String toString() {
		return "Rectangle [x1Coordinate=" + x1Coordinate + ", y1Coordinate=" + y1Coordinate + ", x2Coordinate="
				+ x2Coordinate + ", y2Coordinate=" + y2Coordinate + ", area()=" + area() + ", perimeter()="
				+ perimeter() + ", diagonal()=" + diagonal() + "]";
	}

	
	
}