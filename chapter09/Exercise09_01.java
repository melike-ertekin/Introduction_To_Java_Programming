package chapter09;

public class Exercise09_01 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(4, 40);
		System.out.println("Perimeter of r1: " + r1.getPerimeter());
		System.out.println("Area of r1: " + r1.getArea());

		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("\nPerimeter of r2: " + r2.getPerimeter());
		System.out.println("Area of r2: " + r2.getArea());
	}

}
