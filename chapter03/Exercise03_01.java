package chapter03;

import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// ax2 + bx + c = 0
		System.out.print("Enter a, b, c:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		/*
		 * b2 - 4ac is called the discriminant of the quadratic equation. If it is
		 * positive, the equation has two real roots. If it is zero, the equation has
		 * one root. If it is negative, the equation has no real roots.
		 */

		double discriminant = Math.pow(b, 2) - (4 * a * c);

		System.out.print("The equation has ");

		if (discriminant > 0) {

			double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("two roots " + r1 + " and " + r2);

		} else if (discriminant == 0) {

			double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			System.out.println("one root " + r1);

		} else {
			System.out.println("no real roots.");
		}

	}

}
