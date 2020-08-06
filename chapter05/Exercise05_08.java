package chapter05;

import java.util.Scanner;

public class Exercise05_08 {

	public static void main(String[] args) {
		/*
		 * (Find the highest score) Write a program that prompts the user to enter the
		 * number of students and each student’s name and score, and finally displays
		 * the name of the student with the highest score.
		 */

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int number = input.nextInt();

		int highestScore = -1;
		String highestName = "";
		while (number > 0) {

			System.out.print("Enter name of the student: ");
			String name = input.next();

			System.out.print("Enter score of the student: ");
			int score = input.nextInt();

			if (highestScore < score) {
				highestScore = score;
				highestName = name;
			}
			number--;
		}

		System.out.print("The name of the student with the highest score: " + highestName);

	}

}
