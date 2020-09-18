package chapter08;

import java.util.Scanner;

public class Exercise08_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		int number = input.nextInt();

		String binNumberString = Integer.toBinaryString(number);
		int zeros = 9 - binNumberString.length();

		StringBuilder zeroString = new StringBuilder();
		for (int i = 0; i < zeros; i++) {
			zeroString.append("0");
		}

		binNumberString = zeroString.append(binNumberString).toString();
		System.out.println(binNumberString + "\n");

		String[][] matrix = new String[3][3];

		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = binNumberString.substring(counter, counter + 1);
				counter++;
			}
		}

		
		print(matrix);

	}

	public static void print(String[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (matrix[i][j].equals("0")) {
					System.out.print("H ");
				} else {
					System.out.print("T ");
				}

			}
			System.out.println();
		}

	}

}
