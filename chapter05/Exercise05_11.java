package chapter05;

public class Exercise05_11 {

	public static void main(String[] args) {
		/*
		 * (Find numbers divisible by 5 or 6, but not both) Write a program that
		 * displays all the numbers from 100 to 200, ten per line, that are divisible by
		 * 5 or 6, but not both. Numbers are separated by exactly one space.
		 */

		int count = 1;
		for (int number = 100; number <= 200; number++) {
			if ((number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0)) {
				System.out.print(number + " ");

				if (count % 10 == 0) {
					System.out.println();
				}
				count++;
			}
		}

	}

}
