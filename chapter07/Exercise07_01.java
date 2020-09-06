package chapter07;

import java.util.Scanner;

public class Exercise07_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numOfStudent = input.nextInt();

		System.out.print("Enter " + numOfStudent + " scores: ");

		int[] scores = new int[numOfStudent];
		int maxScore = 0;

		for (int i = 0; i < numOfStudent; i++) {
			scores[i] = input.nextInt();
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}

		for (int i = 0; i < scores.length; i++) {
			System.out.println(
					"Student " + i + " score is " + scores[i] + " and grade is " + getLetterGrade(maxScore, scores[i]));
		}

	}

	public static String getLetterGrade(int maxScore, int studentScore) {

		if (studentScore >= maxScore - 10) {
			return "A";

		} else if (studentScore >= maxScore - 20) {
			return "B";

		} else if (studentScore >= maxScore - 30) {
			return "C";

		} else if (studentScore >= maxScore - 40) {
			return "D";
		}

		return "F";
	}

}
