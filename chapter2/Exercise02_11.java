package chapter2;

import java.util.Scanner;

public class Exercise02_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int currentPop = 312032486;
		int changeOfPop = (365*24*60*60/7) - (365*24*60*60/13) + (365*24*60*60/45);
		
		System.out.print("Enter the number of years: ");
		int year = input.nextInt();

		System.out.println("The population in "+ year + " years is " + (year * changeOfPop + currentPop));
		
	}

}
