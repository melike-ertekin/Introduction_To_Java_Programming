package chapter03;

import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int flip = (int) (Math.random() * 2);

		System.out.print("Head(0) or tail(1):");
		int guess = input.nextInt();

		if (flip == guess) {
			System.out.println("You won. It is " + flip);

		} else {
			System.out.println("You lost. It was " + flip);
		}

	}

}
