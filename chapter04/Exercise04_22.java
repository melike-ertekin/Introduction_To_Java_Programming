package chapter04;

import java.util.Scanner;

public class Exercise04_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string s1: ");
		String s1 = input.nextLine();

		System.out.print("Enter string s2: ");
		String s2 = input.nextLine();

		System.out.println(s2 + (s1.contains(s2) ? " is " : " is not") + " a substring of " + s1);

	}

}
