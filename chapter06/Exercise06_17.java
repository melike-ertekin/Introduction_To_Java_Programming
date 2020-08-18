package chapter06;

import java.util.Scanner;

public class Exercise06_17 {

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = inputScanner.nextInt();
		printMatrix(num);

	}

	public static void printMatrix(int n) {
		int num;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num = (int) (Math.random() * 2);
				System.out.print(num);
			}
			System.out.println();
		}

	}
}
