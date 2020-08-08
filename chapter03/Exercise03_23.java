package chapter03;

import java.util.Scanner;

public class Exercise03_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x < 0) {
			x = -1 * x;
		}
		if (y < 0) {
			y = -1 * y;
		}

		boolean in = (x <= 10 / 2 && y <= 5.0 / 2);
		System.out.println("Point (" + x + ", " + y + ") is " + ((in) ? "in " : "not in ") + "the rectangle");

	}

}
