package chapter05;

import java.util.Scanner;

public class Exercise05_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		for (int year = 101; year <= 2100; year++) {

			// Check if the year is a leap year
			boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

			if (isLeapYear) {
				counter++;
				if (counter % 10 == 0) {
					System.out.println(year);
				} else {
					System.out.print(year + " ");
				}

			}
		}

		System.out.println("\n\nTotal leap year: " + counter);
	}

}
