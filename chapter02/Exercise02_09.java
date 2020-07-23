package chapter02;

import java.util.Scanner;

public class Exercise02_09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter v0, v1, and t: ");
		float v0 = input.nextFloat();
		float v1 = input.nextFloat();
		float t = input.nextFloat();
		
		float result = (v1 - v0) / t;
		System.out.println("The average acceleration is "+ result);
		

	}

}
