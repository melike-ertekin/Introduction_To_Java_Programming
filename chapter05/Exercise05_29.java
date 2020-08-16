package chapter05;

import java.util.Scanner;

public class Exercise05_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter the first day of the year: ");
		int firstDay = input.nextInt();

		int days = 0;

		String monthNameString = "";
		for (int month = 1; month <= 12; month++) {

			switch (month) {
			case 1:
				monthNameString = "January";
				days = 31;
				break;
			case 2:
				monthNameString = "February";

				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					days = 29;
				else
					days = 28;
				break;
			case 3:
				monthNameString = "March";
				days = 31;
				break;
			case 4:
				monthNameString = "April";
				days = 30;
				break;
			case 5:
				monthNameString = "May";
				days = 31;
				break;
			case 6:
				monthNameString = "June";
				days = 30;
				break;
			case 7:
				monthNameString = "July";
				days = 31;
				break;
			case 8:
				monthNameString = "August";
				days = 31;
				break;
			case 9:
				monthNameString = "September";
				days = 30;
				break;
			case 10:
				monthNameString = "October";
				days = 31;
				break;
			case 11:
				monthNameString = "November";
				days = 30;
				break;
			case 12:
				monthNameString = "December";
				days = 31;
				break;
			}

			System.out.print(monthNameString + " 1, " + year + " is ");

			String dayName = "";
			switch (firstDay) {
			case 0:
				dayName = "Sunday";
				break;
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			}
			System.out.println(dayName);
			firstDay = (firstDay + days) % 7;

		}

	}

}
