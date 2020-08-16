package chapter03;

import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int lottery = 100 + (int) (Math.random() * 900);

		// Prompt the user to enter a three-digit number
		System.out.print("Enter a three-digit number: ");
		int guess = input.nextInt();

		int digit1 = lottery / 100;
		int digit2 = (lottery % 100) / 10;
		int digit3 = (lottery % 10);

		int guessDigit1 = guess / 100;
		int guessDigit2 = (guess % 100) / 10;
		int guessDigit3 = (guess % 10);

		System.out.println("The lottery number is " + lottery);

		if (guess == lottery) {

			System.out.println("Exact match: you win $10,000");

		} else if ((guessDigit1 == digit2 || guessDigit1 == digit3) && (guessDigit2 == digit1 || guessDigit2 == digit3)
				&& (guessDigit3 == digit1 || guessDigit3 == digit2)) {

			System.out.println("3 Match! You win: $3000");
		} else if (((guessDigit1 == digit1) || (guessDigit1 == digit2) || (guessDigit1 == digit3)
				|| (guessDigit2 == digit1) || (guessDigit2 == digit2) || (guessDigit2 == digit3)
				|| (guessDigit3 == digit1) || (guessDigit3 == digit2) || (guessDigit3 == digit3))) {

			System.out.println("1 Match! You win: $1000");
		} else {
			System.out.println("You could not win ");
		}
	}

}
