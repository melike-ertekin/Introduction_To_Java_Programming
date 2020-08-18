package chapter06;

import java.util.Scanner;

public class Exercise06_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three integers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		displaySortedNUmbers(num1, num2, num3);
	}

	public static void displaySortedNUmbers(double num1, double num2, double num3) {

		if (num1 > num2 && num1 > num3) {

			if (num2 > num3) {
				System.out.print(num3 + ", " + num2 + ", ");
			} else {
				System.out.print(num2 + ", " + num3 + ", ");
			}
			System.out.print(num1);

		} else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.print(num3 + ", " + num1 + ", ");
			} else {
				System.out.print(num1 + ", " + num3 + ", ");
			}
			System.out.print(num2);

		} else if (num3 > num1 && num3 > num2) {
			if (num1 > num2) {
				System.out.print(num2 + ", " + num1 + ", ");
			} else {
				System.out.print(num1 + ", " + num2 + ", ");
			}
			System.out.print(num3);
		}
	}

}
