package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println(Arrays.toString(reverse(numbers)));
		System.out.println();
	}

	public static int[] reverse(int[] numbers) {

		int temp;

		for (int i = 0; i < numbers.length / 2; i++) {
			temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}

		return numbers;
	}

}
