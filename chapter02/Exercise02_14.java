package chapter02;

import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		
		double bmi = 0.45359237 * weight / Math.pow(0.0254 * height , 2);
		System.out.print("BMI is " + Math.round(bmi * 10000) / 10000.0 );

		

	}

}
