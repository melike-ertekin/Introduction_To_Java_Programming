package chapter03;

import java.util.Scanner;

public class Exercise03_12 {

	public static void main(String[] args) {
		/*
		 * (Palindrome number) Write a program that prompts the user to enter a
		 * three-digit integer and determines whether it is a palindrome number. A
		 * number is palindrome if it reads the same from right to left and from left to
		 * right. Here is a sample run of this program:
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three digit number: ");
		int num = input.nextInt();

		int digit1 = num / 100;
		int digit2 = (num % 100) / 10;
		int digit3 = (num % 10);

		int newNum = digit3 * 100 + digit2 * 10 + digit1;

		if (num == newNum) {

			System.out.println(newNum + " is a palindrome");
		} else {
			System.out.println(newNum + " is not a palindrome");
		}

	}

}
