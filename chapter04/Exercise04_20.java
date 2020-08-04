package chapter04;

import java.util.Scanner;

public class Exercise04_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();

		System.out.println("Length: " + s.length());
		System.out.println("First character: " + s.charAt(0));

	}

}
