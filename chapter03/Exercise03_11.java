package chapter03;

import java.util.Scanner;

public class Exercise03_11 {

	public static void main(String[] args) {
		/*
		 * (Find the number of days in a month) Write a program that prompts the user to
		 * enter the month and year and displays the number of days in the month. For
		 * example, if the user entered month 2 and year 2012, the program should
		 * display that February 2012 had 29 days. If the user entered month 3 and year
		 * 2015, the program should display that March 2015 had 31 days.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter a month: ");
		String month = input.next();

		// Note to myself
		// https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo#:~:text=It's%20because%20when%20you%20enter,buffer%20from%20the%20first%20input
		// String month = input.nextLine();

		// A year is a leap year if it is divisible by 4 but not by 100, or if it is
		// divisible by 400.
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

		int days = -1;
		String monthTitle = "";

		switch (month) {
		case "1":
			monthTitle = "January";
			days = 31;
			break;
		case "3":
			monthTitle = "March";
			days = 31;
			break;
		case "5":
			monthTitle = "May";
			days = 31;
			break;
		case "7":
			monthTitle = "July";
			days = 31;
			break;
		case "8":
			monthTitle = "August";
			days = 31;
			break;
		case "10":
			monthTitle = "September";
			days = 31;
			break;
		case "12":
			monthTitle = "December";
			days = 31;
			break;

		case "4":
			monthTitle = "April";
			days = 30;
			break;
		case "6":
			monthTitle = "June";
			days = 30;
			break;
		case "9":
			monthTitle = "October";
			days = 30;
			break;
		case "11":
			monthTitle = "November";
			days = 30;
			break;

		case "2":
			monthTitle = "February";
			if (isLeapYear) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		default:
			System.out.println("Wrong month!");
			System.exit(1);
		}
		System.out.println(monthTitle + " " + year + " has " + days + " days.");

	}

}
