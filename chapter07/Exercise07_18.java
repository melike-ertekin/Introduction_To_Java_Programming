package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}

		System.out.print("UnSorted: " + Arrays.toString(numbers));
		bubbleSort(numbers);

		System.out.print("\nSorted: " + Arrays.toString(numbers));
	}

	public static void bubbleSort(double[] array) {

		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - 1 - i; j++)
				if (array[j] > array[j + 1]) {

					double temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

	}
}
