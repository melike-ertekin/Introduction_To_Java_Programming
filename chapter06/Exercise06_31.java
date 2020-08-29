package chapter06;

import java.util.Scanner;

public class Exercise06_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a credit card number as a long integer:");
		long creditNum = input.nextLong();

		System.out.println(creditNum + " is " + (isValid(creditNum) ? "valid" : "invalid"));

	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {

		return (getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
						|| prefixMatched(number, 6))

				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		long digit = 0;

		while (number != 0) {

			number = number / 10;

			digit = number % 10;

			sum += getDigit((int) digit * 2);

			number = number / 10;
		}
		// System.out.println(sum);
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the
	 * two digits
	 */
	public static int getDigit(int number) {
		if (number < 9) {
			return number;
		} else {
			return (number % 10 + number / 10);
		}
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		long digit = 0;

		while (number != 0) {

			digit = number % 10;
			number = number / 100;
			sum += digit;

		}
		// System.out.println(sum);
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		String dString = String.valueOf(d);
		return dString.length();
	}

	/**
	 * Return the first k number of digits from number. If the number of digits in
	 * number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {

		if (getSize(number) > k) {

			String numString = number + "";
			return Long.parseLong(numString.substring(0, k));
		}

		return number;

	}
}
