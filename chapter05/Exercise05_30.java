package chapter05;

import java.util.Scanner;

public class Exercise05_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount(monthly): ");
		double deposit = input.nextDouble();

		System.out.print("Enter interest rate(annual) : ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter months: ");
		int months = input.nextInt();

		double monthlyInterestRate = annualInterestRate / 1200;

		double balance = 0;

		for (int i = 1; i <= months; i++) {

			balance = balance + deposit;
			balance = balance + (balance * monthlyInterestRate);

			System.out.println("Month " + i + " ,balance: " + balance);
		}

		System.out.println("Total money in saving account in " + months + " months : " + balance);

	}

}
