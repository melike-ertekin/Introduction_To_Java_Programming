package chapter02;

import java.util.Scanner;

public class Exercise02_16 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
		double formula = 3 * Math.sqrt(3) / 2 * Math.pow(side, 2);
		System.out.println("The area of the hexagon is "+ formula);
		

	}

}
