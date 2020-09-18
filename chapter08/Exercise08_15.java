package chapter08;

import java.util.Scanner;

public class Exercise08_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter five points: ");

		double matrix[][] = new double[5][2];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}

		}

		String text = "";
		if (!sameLine(matrix)) {
			text = " not";
		}

		System.out.print("The five points are" + text + " on the same line.");

	}

	public static double getPosition(double x0, double y0, double x1, double y1, double x2, double y2) {

		return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0));

	}

	/**
	 * Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
	 */
	public static boolean sameLine(double[][] points) {

		for (int i = 0; i < points.length - 2; i += 3) {
			if (getPosition(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1], points[i + 2][0],
					points[i + 2][1]) != 0) {
				return false;
			}
		}
		return true;
	}

}
