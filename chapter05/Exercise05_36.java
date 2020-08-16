package chapter05;

import java.util.Scanner;

public class Exercise05_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn_s = input.nextLine();

		if (isbn_s.length() == 12) {
			int sum = 0;
			for (int i = 0; i < isbn_s.length(); i++) {
				if (i % 2 == 0) {
					sum += Integer.parseInt(isbn_s.substring(i, i + 1));
				} else {
					sum += 3 * Integer.parseInt(isbn_s.substring(i, i + 1));
				}
			}

			int d13 = 10 - sum % 10;

			if (d13 == 10) {
				d13 = 0;
			}
			System.out.println(isbn_s + d13);

		} else {
			System.out.println(isbn_s + " is an invalid input");
		}

	}

}
