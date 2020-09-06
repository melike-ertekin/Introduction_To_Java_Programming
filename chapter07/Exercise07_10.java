package chapter07;

import java.util.Scanner;

public class Exercise07_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		double[] numbers = new double[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println(indexOfSmallestElement(numbers));

	}

	public static int indexOfSmallestElement(double[] array) {
		double min = array[array.length - 1];
		int index = array.length - 1;

		for (int i = array.length - 2; i >= 0; i--) {
			if (min >= array[i]) {
				min = array[i];
				index = i;
			}
		}

		return index;
	}
}
