package chapter05;

import java.security.Principal;
import java.util.Scanner;

public class Exercise05_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();

		System.out.print("Number of Years: ");
		int year = input.nextInt();

		System.out.print("Annual interest rate: ");
		double rate = input.nextDouble();

		double monthlyInterestRate = rate / 1200;
		double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
		double totalPayment = 12 * monthlyPayment * year;

		System.out.printf("\nMonthly Payment: %.2f  \nTotal Payment: %.2f\n\n", monthlyPayment, totalPayment);

		System.out.printf("%s %15s %15s %15s\n\n", "#Payment", "Interest", "Principlal", "Balance");

		double interest;
		double paidAmount = 0;
		double principal;
		double balance = loan;

		for (int month = 1; month <= 12; month++) {
			interest = balance * monthlyInterestRate;
			principal = monthlyPayment - interest;
			balance = balance - principal;

			System.out.printf("%d ", month);
			System.out.printf("%20.2f ", interest);
			System.out.printf("%15.2f ", principal);
			System.out.printf("%17.2f ", balance);
			System.out.println();
		}
	}

}
