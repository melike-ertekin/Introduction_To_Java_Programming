package chapter04;

import java.util.Scanner;

public class Exercise04_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a hex digit: ");
		String hexValue = input.nextLine().toUpperCase();

		if ((hexValue.charAt(0) >= 'A' && hexValue.charAt(0) <= 'F')
				|| (hexValue.charAt(0) >= '0' && hexValue.charAt(0) <= '9')) {

			// HEX TO DEC
			int decimalValue = Integer.parseInt(hexValue, 16);
			String binary = Integer.toBinaryString(decimalValue);
			System.out.print("The binary value is " + binary);

		} else {

			System.out.print(hexValue + " is an invalid input.");
		}

	}

}
