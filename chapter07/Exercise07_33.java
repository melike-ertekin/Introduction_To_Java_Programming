package chapter07;

import java.util.Scanner;

public class Exercise07_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] chineseZodiacStrings = new String[] { "monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
				"rabbit", "dragon", "snake", "horse", "sheep" };

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.println(chineseZodiacStrings[year % 12]);

	}

}
