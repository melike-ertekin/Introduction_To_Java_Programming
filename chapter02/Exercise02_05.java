package chapter02;

import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity_rate = input.nextDouble();
		
		double gratuity = subtotal * gratuity_rate / 100;
		double total = subtotal + gratuity;
		
		System.out.print("The gratuity is $" + gratuity + " and total is $" + total);

		

	}

}
