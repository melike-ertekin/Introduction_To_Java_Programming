package chapter06;

import java.util.Scanner;

public class Exercise06_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer:");
		int num = input.nextInt();

		System.out.println(num + (isPalindrome(num) ? " is " : " is not ") + "a palindrome");

	}

	public static int reverse(int number) {

		String numString = String.valueOf(number);
		int reversedNum = 0;

		for (int i = numString.length() - 1; i >= 0; i--) {

			reversedNum += Integer.parseInt(numString.substring(i, i + 1)) * (int) Math.pow(10, i);

		}

		return reversedNum;
	}

	public static boolean isPalindrome(int number) {
		return reverse(number) == number;
	}

}
