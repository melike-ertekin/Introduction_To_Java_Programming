package chapter05;

import java.util.Scanner;

public class Exercise05_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String s1 = input.nextLine().toUpperCase();

		int numOfVowels = 0;
		int numOfConsonants = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (Character.isLetter(s1.charAt(i))) {

				if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O'
						|| s1.charAt(i) == 'U') {
					numOfVowels++;
				} else {
					numOfConsonants++;
				}
			}
		}

		System.out.println("The number of vowels: " + numOfVowels);
		System.out.println("The number of consonants: " + numOfConsonants);

	}

}
