package chapter06;

import java.util.Scanner;

public class Exercise06_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("The amount invested: ");
		double investment = input.nextDouble();

		System.out.print("Annual interest rate: ");
		double monthlyInterestRate = input.nextDouble() / 1200;

		System.out.print("Years	 Future Value \n");

		double futureInvestment;
		
		for (int i = 1; i <= 30; i++) {
			futureInvestment = investment * Math.pow((1 + monthlyInterestRate), i * 12);

			System.out.printf("%2d       %8.2f\n", i, (int) (futureInvestment * 100) / 100.0);
		}

	}

}
