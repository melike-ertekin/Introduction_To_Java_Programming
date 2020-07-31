package chapter04;

public class Exercise04_03 {

	public static void main(String[] args) {

		// Atlanta
		double x1 = 51.5138505182;
		double y1 = -0.15690922737098845;

		// Orlando
		double x2 = 28.5383355;
		double y2 = -81.37923649999999;

		// Savannah
		double x3 = 32.0835407;
		double y3 = -81.09983419999998;

		// Charlotte
		double x4 = 35.2270869;
		double y4 = -80.84312669999997;

		// Calculating 1st triangle; p1, p2 and, p3
		double side1_1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2_1 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3_1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		double s1 = (side1_1 + side2_1 + side3_1) / 2;
		double area1 = Math.sqrt(s1 * (s1 - side1_1) * (s1 - side2_1) * (s1 - side3_1));

		// Calculating 2nd triangle; p1, p3 and, p4
		double side1_2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double side2_2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		double side3_2 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));

		double s2 = (side1_2 + side2_2 + side3_2) / 2;
		double area2 = Math.sqrt(s2 * (s2 - side1_2) * (s2 - side2_2) * (s2 - side3_2));

		System.out.println("Total area is " + (area1 + area2));
	}

}
