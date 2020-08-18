package chapter06;

import java.util.Scanner;

public class Exercise06_18 {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Enter a passwoed: ");
		String password = inputScanner.nextLine();

		checkThePassword(password);
	}

	public static void checkThePassword(String password) {

		if (checkDigit(password) && checkCharacter(password) && checkDigitNumber(password)) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}

	}

	public static boolean checkDigit(String password) {
		return password.length() >= 8;
	}

	public static boolean checkCharacter(String password) {

		for (int i = 0; i < password.length(); i++) {

			if (!(Character.isDigit(password.charAt(i)) || Character.isAlphabetic(password.charAt(i)))) {
				return false;
			}

		}
		return true;
	}

	public static boolean checkDigitNumber(String password) {
		int counter = 0;
		for (int i = 0; i < password.length(); i++) {

			if (Character.isDigit(password.charAt(i))) {
				counter++;
			}

		}
		return counter == 2;
	}
}
