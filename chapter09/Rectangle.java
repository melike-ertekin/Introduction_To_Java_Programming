package chapter09;

public class Rectangle {
	private double width = 1;
	private double height = 1;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}

}
