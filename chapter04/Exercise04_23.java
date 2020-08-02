package chapter04;

import java.util.Scanner;

public class Exercise04_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		int hours = input.nextInt();
		
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateRate = input.nextDouble();
		
		double grossPay = hours * rate;
		double federalWithholding = grossPay * federalRate;
		double stateWithholding = grossPay * stateRate;
		double totalDeduction = federalWithholding + stateWithholding;
		System.out.println("\nEmployee Name: " + name +
				"\nHours Worked: " + hours +
				"\nPay Rate: $" + rate + 
				"\nGross Pay: $" + grossPay +
				"\nDeductions: \n" +
				"	Federal Withholding (" + federalRate * 100 + "%): $" + federalWithholding + "\n" +
				"	State Withholding (" + stateRate * 100 + "%): $" + stateWithholding + "\n" +
				"	Total Deduction: $" + totalDeduction +
				"\nNet Pay: $" + (grossPay - totalDeduction));
	}

}
