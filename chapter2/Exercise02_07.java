package chapter2;

import java.util.Scanner;

public class Exercise02_07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int minutesInAday = 24 * 60;
		
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		
		long years = minutes / (minutesInAday * 365);
		
		long days = (minutes / minutesInAday) % 365;
		System.out.print(minutes + " minutes is approximately " + years + " years and "+  days  + " days.");

	}

} 