package chapter04;

import java.util.Scanner;

public class Exercise04_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.print("Enter a month: ");
		String month = input.next();
		
		//Note to myself
		//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo#:~:text=It's%20because%20when%20you%20enter,buffer%20from%20the%20first%20input
		//String month = input.nextLine();
	
		//A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
		boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

		int days = -1;

		switch (month) {
			case "Jan":
			case "Mar":
			case "May":
			case "July":
			case "Aug":
			case "Oct":
			case "Dec":
				days = 31;
				break;
	
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				days = 30;
				break;
	
			case "Feb":
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
		System.out.println(month + " " + year + " has " + days + " days");
	}

}
