package chapter05;

import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Loan Amount: ");
		double loan = input.nextDouble();

		System.out.print("Number of Years: ");
		int year = input.nextInt();

		double monthlyInterestRate;
		double monthlyPayment;
		double totalPayment;
		System.out.printf("%s %20s %20s\n\n", "Interest rate", "Monthly Payment", "TotalPayment");

		for (double rate = 5; rate <= 8; rate += 1 / 8.0) {

			monthlyInterestRate = rate / 1200;
			monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
			totalPayment = 12 * monthlyPayment * year;
			System.out.printf("%.03f%%  %17.2f  %24.2f\n", rate, monthlyPayment, totalPayment);
		}

	}

}
