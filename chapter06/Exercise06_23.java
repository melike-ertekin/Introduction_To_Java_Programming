package chapter06;

import java.util.Scanner;

public class Exercise06_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.next();
		char ch = input.next().charAt(0);

		System.out.println(str + " has " + count(str, ch) + " " + ch);

	}

	public static int count(String str, char a) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				counter++;
			}
		}
		return counter;
	}

}
