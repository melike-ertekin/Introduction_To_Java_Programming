package chapter04;

import java.util.Scanner;

public class Exercise04_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
		int accii = input.nextInt();

		System.out.print("The character for ASCII code " + (char) accii);
	}

}
