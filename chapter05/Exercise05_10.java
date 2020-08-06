package chapter05;

public class Exercise05_10 {

	public static void main(String[] args) {
		/*
		 * (Find numbers divisible by 5 and 6) Write a program that displays all the
		 * numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
		 * Numbers are separated by exactly one space.
		 */

		int count = 1;
		for (int i = 100; i < 1000; i++) {

			if (i % 5 == 0 && i % 6 == 0) {

				System.out.print(i + " ");

				if (count % 10 == 0) {
					System.out.println();
				}
				count++;

			}

		}

	}

}
