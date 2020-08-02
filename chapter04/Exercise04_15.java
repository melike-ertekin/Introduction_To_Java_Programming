package chapter04;

import java.util.Scanner;

public class Exercise04_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char letter = Character.toUpperCase(input.next().charAt(0));

		int number = -1;

		if (letter > 86) {
			number = 9;
		} else if (letter > 83) {
			number = 8;
		} else if (letter > 79) {
			number = 7;
		} else if (letter > 76) {
			number = 6;
		} else if (letter > 73) {
			number = 5;
		} else if (letter > 70) {
			number = 4;
		} else if (letter > 67) {
			number = 3;
		} else if (letter > 64) {
			number = 2;
		} else {
			System.out.println(letter + " is an invalid input");
			System.exit(1);
		}

		System.out.println("The corresponding number is " + number);
	}

}
