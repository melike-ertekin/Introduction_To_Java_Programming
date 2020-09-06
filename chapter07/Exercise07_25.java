package chapter07;

import java.util.Scanner;

public class Exercise07_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// ax2 + bx + c = 0
		System.out.print("Enter a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		double[] eqn = new double[] { a, b, c };
		double[] roots = new double[2];

		solveQuadratic(eqn, roots);

		System.out.print("The equation has ");

		if (solveQuadratic(eqn, roots) == 2) {

			System.out.println("two roots " + roots[0] + " and " + roots[1]);

		} else if (solveQuadratic(eqn, roots) == 1) {

			System.out.println("one root " + roots[0]);

		} else {

			System.out.println("no real roots.");
		}
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {
		/*
		 * b2 - 4ac is called the discriminant of the quadratic equation. If it is
		 * positive, the equation has two real roots. If it is zero, the equation has
		 * one root. If it is negative, the equation has no real roots.
		 */

		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];

		int numberOfRoots;

		double discriminant = Math.pow(b, 2) - (4 * a * c);

		if (discriminant > 0) {
			numberOfRoots = 2;
			roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
			roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);

		} else if (discriminant == 0) {
			numberOfRoots = 1;
			roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);

		} else {
			numberOfRoots = -1;

		}

		return numberOfRoots;
	}

}
