package chapter04;

import java.util.Scanner;

public class Exercise04_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();

		if (value >= 0 && value < 16) {
			String hex = Integer.toHexString(value);
			System.out.print("The hex value is " + hex.toUpperCase());
		} else {
			System.out.print(value + " is an invalid input.");
		}

	}

}
