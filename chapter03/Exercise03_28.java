package chapter03;

import java.util.Scanner;

public class Exercise03_28 {

	/*
	 * (Geometry: two rectangles) Write a program that prompts the user to enter the
	 * center x-, y-coordinates, width, and height of two rectangles and determines
	 * whether the second rectangle is inside the first or overlaps with the first.
	 * 
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();

		System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();

		double topRx1 = x1 + w1 / 2;
		double topRy1 = y1 + h1 / 2;

		double bottomLx1 = x1 - w1 / 2;
		double bottomLy1 = y2 - h1 / 2;

		double topRx2 = x2 + w2 / 2;
		double topRy2 = y2 + h2 / 2;

		double bottomLx2 = x2 - w2 / 2;
		double bottomLy2 = y2 - h2 / 2;

		if (isInside(topRx1, topRy1, bottomLx1, bottomLy1, topRx2, topRy2, bottomLx2, bottomLy2)) {
			System.out.println("r2 is inside r1");
		} else if (isOverlapping(topRx1, topRy1, bottomLx1, bottomLy1, topRx2, topRy2, bottomLx2, bottomLy2)) {
			System.out.println("r2 overlaps r1");
		} else {
			System.out.println("r2 does not overlap r1");
		}
	}

	public static boolean isInside(double topRx1, double topRy1, double bottomLx1, double bottomLy1, double topRx2,
			double topRy2, double bottomLx2, double bottomLy2) {

		return topRx2 <= topRx1 && topRy2 <= topRy1 && bottomLx2 >= bottomLx1 && bottomLy2 >= bottomLy1;
	}

	public static boolean isOverlapping(double topRx1, double topRy1, double bottomLx1, double bottomLy1, double topRx2,
			double topRy2, double bottomLx2, double bottomLy2) {

		return topRx2 > bottomLx1 && topRy2 > bottomLy1 && bottomLx2 < topRx1 && bottomLy2 < topRy1;
	}

}
