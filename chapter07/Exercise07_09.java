package chapter07;

import java.util.Scanner;

public class Exercise07_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		double[] numbers = new double[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println(min(numbers));

	}

	public static double min(double[] array) {
		double min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}

		return min;
	}

}
