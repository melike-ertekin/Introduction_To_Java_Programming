package chapter07;

import java.util.Scanner;

public class Exercise07_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("Average: " + average(numbers));

	}

	public static int average(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}

	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;
	}
}
