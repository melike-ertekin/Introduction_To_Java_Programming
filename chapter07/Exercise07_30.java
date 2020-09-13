package chapter07;

import java.util.Scanner;

public class Exercise07_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int num = input.nextInt();

		int[] array = new int[num];

		System.out.print("Enter the values: ");
		for (int i = 0; i < num; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("The list has " + (isConsecutiveFour(array) ? "" : "no ") + "consecutive four.");
	}

	public static boolean isConsecutiveFour(int[] values) {
		int counter = 1;

		for (int i = 1; i < values.length; i++) {
			if (values[i - 1] == values[i]) {
				counter++;

				if (counter == 4) {
					return true;
				}
			} else {
				counter = 1;
			}
		}

		return false;
	}
}
