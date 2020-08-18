package chapter06;

import java.util.Scanner;

public class Exercise06_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three sides of a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();

		if (isValid(s1, s2, s3)) {
			System.out.println("The area of the triangle is " + area(s1, s2, s3));
		} else {
			System.out.println("Invalid sides.");
		}

	}

	/**
	 * Return true if the sum of any two sides is greater than the third side.
	 */
	public static boolean isValid(double side1, double side2, double side3) {
		return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
	}

	/** Return the area of the triangle. */
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}
}
