package chapter2;

import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		float water = input.nextFloat();
		
		System.out.print("Enter the initial temperature: ");
		float initialTemp = input.nextFloat();
		
		System.out.print("Enter the final temperature: ");
		float finalTemp = input.nextFloat();
		
		
		float energy = water * (finalTemp - initialTemp) * 4184;
		
		System.out.print("The energy needed is " + energy);
	

	}

}
