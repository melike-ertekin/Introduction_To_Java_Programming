package chapter03;

import java.util.Scanner;

public class Exercise03_32 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		String text = "";

		if (position > 0) {
			text = "left side of the";
		}

		else if (position < 0) {
			text = "right side of the";
		} else {
			text = "same";
		}

		System.out.print("(" + x2 + ", " + y2 + ") is on the " + text + " line from (" + x0 + ", " + y0 + ") to ("
				+ x1 + ", " + y1 + ")");

	}

}
