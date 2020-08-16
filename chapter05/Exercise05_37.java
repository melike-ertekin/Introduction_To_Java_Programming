package chapter05;

import java.util.Scanner;

public class Exercise05_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		String binary = "";
		int num = n;
		while (num != 0) {
			int digit = num % 2;
			binary = digit + binary;
			num = num / 2;
		}

		System.out.println("(Decimal " + n + ") = (" + "Binary " + binary + ")");

	}

}
