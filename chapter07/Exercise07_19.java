package chapter07;

import java.util.Scanner;

public class Exercise07_19 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter list(First number is size): ");
		int size = inputScanner.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = inputScanner.nextInt();
		}

		System.out.print("The list is ");
		if (isSorted(array)) {
			System.out.print("sorted. ");
		} else {
			System.out.print("not sorted. ");
		}

	}

	public static boolean isSorted(int[] list) {
		for (int i = 1; i < list.length; i++) {
			if (list[i - 1] > list[i]) {
				return false;
			}
		}
		return true;
	}
}
