package chapter05;

import java.util.Scanner;

public class Exercise05_16 {

	public static void main(String[] args) {
		/*
		 * (Find the factors of an integer) Write a program that reads an integer and
		 * displays all its smallest factors in increasing order. For example, if the
		 * input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int inc = 2;
		while (inc <= number) {
			if (number % inc == 0) {
				System.out.print(inc + " ");
				number = number / inc;
			} else {
				inc++;
			}
		}
	}

}
