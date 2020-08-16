package chapter05;

public class Exercise05_40 {

	public static void main(String[] args) {
		/*
		 * (Simulation: heads or tails) Write a program that simulates flipping a coin
		 * one million times and displays the number of heads and tails.
		 */

		int flip;

		int heads = 0;
		int tails = 0;

		for (int i = 0; i < Math.pow(10, 6); i++) {

			flip = (int) (Math.random() * 2);
			if (flip == 0) {
				heads++;
			}
			if (flip == 1) {
				tails++;
			}
		}

		System.out.println("Total heads: " + heads);
		System.out.println("Total tails: " + tails);

	}

}
