package chapter03;

import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day:");
		int day = input.nextInt();

		System.out.println("Enter the number of days elapsed since today:");
		int addition = input.nextInt();

		int newDay = (day + addition) % 7;

		System.out.println("Today is " + getDayName(day) + " and future day is " + getDayName(newDay));

	}

	public static String getDayName(int day) {

		String dayName = "";

		switch (day) {
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

		return dayName;
	}

}
