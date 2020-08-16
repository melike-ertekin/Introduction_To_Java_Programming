package chapter05;

import java.util.Scanner;

public class Exercise05_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		String octal = "";
		int num = n;
		int digit;
		while (num != 0) {
			digit = num % 8;
			octal = digit + octal;
			num = num / 8;
		}

		System.out.println("(Decimal " + n + ") = (" + "Octal " + octal+")");

	}

}
