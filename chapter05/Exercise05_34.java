package chapter05;

import java.util.Scanner;

public class Exercise05_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int wonComp = 0;
		int wonHuman = 0;
		int computer;
		int number;

		while (wonHuman <= 2 && wonComp <= 2) {
			computer = (int) (Math.random() * 2);
			System.out.print("\nEnter a number for scissor (0), rock (1), paper (2) :");
			number = input.nextInt();

			// it is a draw
			if (number == 0 && computer == 0) {

				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			} else if (number == 1 && computer == 1) {

				System.out.println("The computer is rock. You are rock too. It is a draw");
			} else if (number == 2 && computer == 2) {

				System.out.println("The computer is papier. You are  papier too. It is a draw");
			}

			// you won
			else if (number == 0 && computer == 2) {
				wonHuman++;
				System.out.println("The computer is papier. You are scissor. You won");
			} else if (number == 1 && computer == 0) {
				wonHuman++;
				System.out.println("The computer is scissor. You are rock. You won");
			} else if (number == 2 && computer == 1) {
				wonHuman++;
				System.out.println("The computer is rock. You are papier. You won");
			}

			// computer won
			else if (number == 0 && computer == 1) {
				wonComp++;
				System.out.println("The computer is rock. You are scissor. Computer won");
			} else if (number == 1 && computer == 2) {
				System.out.println("The computer is papier. You are rock. Computer won");
				wonComp++;
			} else if (number == 2 && computer == 0) {
				wonComp++;
				System.out.println("The computer is scissor. You are papier. Computer won");
			}
		}

		System.out.println("\nGame is over!");
		if (wonComp > wonHuman) {
			System.out.println("Computer won " + wonComp + " times.");
		} else {
			System.out.println("You won " + wonHuman + " times.");
		}
	}

}
