package chapter06;

import java.util.Scanner;

public class Exercise06_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string:");
		String word = input.nextLine();
		System.out.println(countLetters(word));

	}

	public static int countLetters(String s) {
		return s.length();
	}

}
