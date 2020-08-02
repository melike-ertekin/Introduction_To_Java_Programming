package chapter04;

import java.util.Scanner;

public class Exercise04_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter grade:");
		char grade = Character.toUpperCase(input.next().charAt(0));

		int value = -1;
		switch (grade) {

		case 'A':
			value = 4;
			break;
		case 'B':
			value = 3;
			break;
		case 'C':
			value = 2;
			break;
		case 'D':
			value = 1;
			break;
		case 'F':
			value = 0;
			break;
		default:
			System.out.println(grade + " is an invalid grade ");
			System.exit(1);

		}

		System.out.println("The numeric value for grade " + grade + " is " + value);
	}

}
