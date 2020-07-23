package chapter02;

import java.util.Scanner;

public class Exercise02_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		float speed = input.nextFloat();
		float acceleration = input.nextFloat();
	
		float result = speed * speed / (2 * acceleration);

		System.out.println("The minimum runway length for this airplane is "+ result);

	}

}
