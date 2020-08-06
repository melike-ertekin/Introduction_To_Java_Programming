package chapter05;

import java.util.Scanner;

public class Exercise05_09 {

	public static void main(String[] args) {
		/*
		 * (Find the two highest scores) Write a program that prompts the user to enter
		 * the number of students and each student’s name and score, and finally
		 * displays the student with the highest score and the student with the
		 * second-highest score.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int number = input.nextInt();

		int highestScore1 = -1;
		String highestName1 = "";

		int highestScore2 = -1;
		String highestName2 = "";

		while (number > 0) {

			System.out.print("Enter name of the student: ");
			String name = input.next();

			System.out.print("Enter score of the student: ");
			int score = input.nextInt();

			if (highestScore1 < score) {
				highestScore2 = highestScore1;
				highestName2 = highestName1;

				highestScore1 = score;
				highestName1 = name;
			}
			number--;
		}

		System.out.println("The name of the student with the highest score: " + highestName1);
		System.out.print("The name of the second student with the highest score: " + highestName2);
	}

}
