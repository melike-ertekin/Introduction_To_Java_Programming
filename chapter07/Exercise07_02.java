package chapter07;

import java.util.Scanner;

public class Exercise07_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		int[] numbers = new int[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.print("Reverse order: ");
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

	}

}
