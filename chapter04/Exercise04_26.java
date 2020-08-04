package chapter04;

import java.util.Scanner;
/*Notes for myself to avoid loss of accuracy: 
 * 
 * Don’t use float and double on monetary calculation.
 * Use BigDecimal, long or int for monetary calculation.
 * Use BigDecimal with String constructor and avoid double one.
 */

//For this question I won't use BigDecimal since question wants me to use indexOf(.)
public class Exercise04_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 100 cents = 1 dollar
		// 25 cents = 1 quarter
		// 10 cents = 1 dime
		// 5 cent = 1 nickel
		// cent = penny

		System.out.print("Enter an amount in double, for example 11.56 :  ");
		String amountString = input.nextLine();

		int decimalPosition = amountString.indexOf('.');

		int amountInCent;

		if (decimalPosition == -1) {
			amountInCent = Integer.parseInt(amountString);
		} else {
			String fractionPart = amountString.substring(decimalPosition + 1);

			if (fractionPart.length() >= 2) {
				fractionPart = fractionPart.substring(0, 2);
			} else if (fractionPart.length() == 1) {
				fractionPart = fractionPart + "0";
			} else {
				fractionPart = fractionPart + "00";
			}

			amountInCent = Integer.parseInt(amountString.substring(0, decimalPosition) + fractionPart);
		}

		// Find the number of one dollars
		int numberOfDollars = amountInCent / 100;
		amountInCent = amountInCent % 100;

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = amountInCent / 25;
		amountInCent = amountInCent % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = amountInCent / 10;
		amountInCent = amountInCent % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = amountInCent / 5;
		amountInCent = amountInCent % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = amountInCent;

		// Display results
		System.out.println("Your amount " + amountString + " consists of");
		System.out.println(" " + numberOfDollars + " dollars");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes");
		System.out.println(" " + numberOfNickels + " nickels");
		System.out.println(" " + numberOfPennies + " pennies");
	}

}
