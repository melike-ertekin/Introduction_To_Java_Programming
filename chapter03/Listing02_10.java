package chapter03;

import java.util.Scanner;

public class Listing02_10 {

	public static void main(String[] args) {

		// 100 cents = 1 dollar
		// 25 cents = 1 quarter
		// 10 cents = 1 dime
		// 5 cent = 1 nickel
		// cent = penny
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 11.56 : ");
		double amount = input.nextDouble();

		// convert to cent
		int amountInCent = (int) (amount * 100);

		int numberOfDollars = amountInCent / 100;
		amountInCent = amountInCent % 100;

		int numberOfQuarters = amountInCent / 25;
		amountInCent = amountInCent % 25;

		int numberOfDimes = amountInCent / 10;
		amountInCent = amountInCent % 10;

		int numberOfNickels = amountInCent / 5;
		amountInCent = amountInCent % 5;

		int numberOfPennies = amountInCent;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");

	}

}
