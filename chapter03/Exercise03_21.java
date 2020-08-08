package chapter03;

import java.util.Scanner;

public class Exercise03_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012):");
		int year = input.nextInt();

		System.out.print("Enter month: 1-12:");
		int month = input.nextInt();

		System.out.print("Enter the day of the month: 1-31:");
		int day = input.nextInt();

		if (month == 1 || month == 2) {
			if (month == 1) {
				month = 13;
			} else {
				month = 14;
			}

			year--;
		}

		int j = year / 100;
		int k = year % 100;

		int h = (day + (26 * (month + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		System.out.print("Day of the week is ");

		switch (h) {

		case 0:
			System.out.print("Saturday");
			break;
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.print("Monday");
			break;
		case 3:
			System.out.print("Tuesday");
			break;
		case 4:
			System.out.print("Wednesday");
			break;
		case 5:
			System.out.print("Thursday");
			break;
		case 6:
			System.out.print("Friday");
			break;

		}

	}

}
