package chapter02;

import java.util.Scanner;

public class Exercise02_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investment = input.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterestRate = input.nextDouble() / 100 / 12;
		
		System.out.print("Enter number of years: ");
		double years = input.nextDouble();
		
		double futureInvestment = investment * Math.pow(( 1 + monthlyInterestRate ), years * 12);
		
		System.out.print("Accumulated value is $" +  (int)(futureInvestment * 100) / 100.0 );

	}

}
