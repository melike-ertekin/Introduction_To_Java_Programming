package chapter04;

import java.util.Scanner;

public class Exercise04_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();

		for (int i = 0; i < ssn.length(); i++) {
			if ((i == 3 || i == 6) && ssn.charAt(i) == '-') {
				continue;
			}
			if (!Character.isDigit(ssn.charAt(i))) {
				System.out.println(ssn + " is an invalid social security number");
				System.exit(0);
			}
		}

		System.out.println(ssn + " is a valid social security number");

	}

}
