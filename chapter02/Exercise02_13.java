package chapter02;

import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double totalValue = 0;
		
		System.out.print("Enter the monthly saving amount: ");
		double monthlySaving = input.nextDouble();
		
		
		for(int i = 0; i < 6 ; i++) {
			totalValue = (totalValue + monthlySaving) * ( 1 + 0.00417 );
		}
		System.out.print("After the sixth month, the account value is $" + (int) (totalValue * 100) / 100.0 );
		

	}

}
