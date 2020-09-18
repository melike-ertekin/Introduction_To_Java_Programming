package chapter08;

import java.util.ArrayList;

public class Exercise08_03 {

	public static void main(String[] args) {

		// Students' answers to the questions
		char[][] answers = { { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

		// Key to the questions
		char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		int[] studentScrores = new int[answers.length];

		// Grade all answers
		for (int i = 0; i < answers.length; i++) {
			// Grade one student
			int correctCount = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == keys[j])
					correctCount++;
			}
			studentScrores[i] = correctCount;

		}

		int[] studentNumbers = new int[answers.length];

		for (int i = 0; i < studentNumbers.length; i++) {
			studentNumbers[i] = i;
		}

		for (int i = 0; i < studentScrores.length; i++) {

			int min = studentScrores[i];
			int minIndex = i;

			for (int j = i + 1; j < studentScrores.length; j++) {
				if (studentScrores[j] < min) {
					min = studentScrores[j];
					minIndex = j;
				}

			}

			if (minIndex != i) {

				studentScrores[minIndex] = studentScrores[i];
				studentScrores[i] = min;

				int temp = studentNumbers[i];
				studentNumbers[i] = studentNumbers[minIndex];
				studentNumbers[minIndex] = temp;
			}
		}

		for (int i = 0; i < studentNumbers.length; i++) {
			System.out.println("Student " + studentNumbers[i] + "'s result is " + studentScrores[i]);
		}

	}
}
