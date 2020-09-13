package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s = input.nextLine();

		System.out.println(sort(s));
	}

	public static String sort(String s) {

		Character[] array = new Character[s.length()];

		for (int i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i);
		}

		Arrays.sort(array);

		return Arrays.toString(array);
	}
}
