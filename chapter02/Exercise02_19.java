package chapter02;

import java.util.Scanner;

public class Exercise02_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double s1 = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
		double s2 = Math.sqrt(Math.pow((x3 - x2) , 2) + Math.pow((y3 - y2) , 2));
		double s3 = Math.sqrt(Math.pow((x3 - x1) , 2) + Math.pow((y3 - y1) , 2));
		
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt( s * (s - s1) * (s - s2) * (s - s3));
		
		System.out.print("The area of the triangle is " + (int) (area * 10) / 10.0);
	}

}
