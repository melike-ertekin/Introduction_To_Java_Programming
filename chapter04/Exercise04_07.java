package chapter04;

import java.util.Scanner;

public class Exercise04_07 {

	public static void main(String[] args) {

		System.out.print("Enter the radius of the bounding circle:");

		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();

		double p1 = Math.PI / 10; // 18
		double p2 = Math.PI / 2; // 18 + 72 = 90
		double p3 = p2 + 2 * Math.PI / 5; // 18 + 72 + 72 = 162
		double p4 = p3 + 2 * Math.PI / 5; // 18 + 72 + 72 + 72 = 234
		double p5 = p4 + 2 * Math.PI / 5; // 18 + 72 + 72 + 72 + 72 = 306

		double x1 = r * Math.cos(p1);
		double y1 = r * Math.sin(p1);
		double x2 = r * Math.cos(p2);
		double y2 = r * Math.sin(p2);
		double x3 = r * Math.cos(p3);
		double y3 = r * Math.sin(p3);
		double x4 = r * Math.cos(p4);
		double y4 = r * Math.sin(p4);
		double x5 = r * Math.cos(p5);
		double y5 = r * Math.sin(p5);

		System.out.println("The coordinates of five points on the pentagon are: ");
		System.out.printf("(%.4f, %10.4f)\n", x1, y1);
		System.out.printf("(%.20f, %d)\n", x2, (int) y2);
		System.out.printf("(%.4f, %.4f)\n", x3, y3);
		System.out.printf("(%.4f, %.4f)\n", x4, y4);
		System.out.printf("(%.4f, %.3f)\n", x5, y5);

	}

}
