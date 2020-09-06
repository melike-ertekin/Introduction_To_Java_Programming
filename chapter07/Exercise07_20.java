package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		double[] numbers = new double[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextDouble();
		}

		System.out.print("UnSorted: " + Arrays.toString(numbers));
		selectionSort(numbers);

		System.out.print("\nSorted: " + Arrays.toString(numbers));
	}

	public static void selectionSort(double[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			// Find the max in the list[i..list.length-1]
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

			// Swap list[i] with list[currentMaxIndex] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}

}
