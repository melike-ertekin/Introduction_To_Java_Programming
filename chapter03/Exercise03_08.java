package chapter03;

import java.util.Scanner;

public class Exercise03_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		System.out.println("Unsorted: " + num1 + " " + num2 + " " + num3);
		if (num1 > num2 || num1 > num3) {
			if (num1 > num2 || num1 > num3) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			if (num1 > num3) {
				int temp = num1;
				num1 = num3;
				num3 = temp;
			}
		}
		if (num2 > num3) {

			int temp = num2;
			num2 = num3;
			num3 = temp;

		}

		System.out.print("Sorted: " + num1 + " " + num2 + " " + num3);

		/*
		 * //Solution with insertion sort
		 * 
		 * int[] arr = { num1, num2, num3 };
		 * 
		 * System.out.print("Unsorted: "); printArray(arr);
		 * 
		 * int temp;
		 * 
		 * for (int i = 1; i < arr.length; i++) { for (int j = i; j > 0; j--) {
		 * 
		 * if (arr[j - 1] > arr[j]) { temp = arr[j - 1]; arr[j - 1] = arr[j]; arr[j] =
		 * temp; } } }
		 * 
		 * System.out.print("Sorted: "); printArray(arr);
		 * 
		 */
	}

	public static void printArray(int[] arr) {

		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
