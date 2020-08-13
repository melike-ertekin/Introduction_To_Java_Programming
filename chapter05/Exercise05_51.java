package chapter05;

import java.util.Scanner;

public class Exercise05_51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();

		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();

		int pointer = 0;

		int length = s1.length();

		if (s1.length() > s2.length()) {
			length = s2.length();
		}

		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
				pointer = i;
			} else {
				break;
			}
		}

		if (pointer == 0) {
			System.out.print(s1 + " and " + s2 + " have no common prefix.");
		} else {
			System.out.print("The common prefix " + s1.substring(0, pointer + 1));
		}
	}

}
