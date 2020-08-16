package chapter05;

import java.util.Scanner;

public class Exercise05_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double deposit = input.nextDouble();

		System.out.print("Enter annual percentage yield: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();

		double monthlyInterestRate = annualInterestRate / 1200;

		double value = deposit;
		System.out.println("Month          CD value");
		for (int i = 1; i <= months; i++) {

			value = value + (value * monthlyInterestRate);

			System.out.printf("%2d %20.2f \n", i, value);
		}

	}

}
