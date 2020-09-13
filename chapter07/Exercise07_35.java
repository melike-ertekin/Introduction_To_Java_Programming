package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_35 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] wordsArray = new String[] { "write", "that", "happy", "class" };

		String selection = "y";

		while (selection.equals("y")) {

			char[] selectedWordLetterArray = getARamdomWord(wordsArray);
			char[] starArray = initializeStarArray(selectedWordLetterArray.length);
			String currentStatus = arrayToString(starArray);

			boolean gameOver = false;
			int lost = 0;

			while (!gameOver) {
				
				System.out.print("(Guess) Enter a letter in word " + currentStatus + " > ");
				char userInput = input.next().charAt(0);
				
				int result = checkLetter(selectedWordLetterArray, starArray, userInput);

				if (result == -1) {
					System.out.println("\t" + userInput + " is not in the word.");
					lost++;
				} else if (result == -2) {
					System.out.println("\t" + userInput + " is already in the word.");
				}

				currentStatus = arrayToString(starArray);
				if (!currentStatus.contains("*")) {

					System.out.println("The word is " + currentStatus + ". You missed " + lost
							+ (lost < 2 ? " time." : " times."));
					gameOver = true;
					break;
				}

			}

			System.out.print("Do you want to guess another word? Enter y or n > ");
			selection = input.next();
		}

		System.out.println("Bye");

	}

	public static int checkLetter(char[] selectedWordLetterArray, char[] starArray, char letter) {
		// -1 does not exist
		// -2 already found
		// -3 just found
		int result = -1;
		for (int i = 0; i < selectedWordLetterArray.length; i++) {

			if (selectedWordLetterArray[i] == letter) {

				if (starArray[i] == '*') {
					starArray[i] = letter;
					result = i;
				} else {
					return -2;
				}

			}

		}

		if (result != -1) {
			return -3;
		}

		return -1;
	}

	private static char[] getARamdomWord(String[] wordsArray) {
		int random = (int) (Math.random() * wordsArray.length);
		return wordsArray[random].toCharArray();

	}

	private static char[] initializeStarArray(int length) {

		char[] starArray = new char[length];

		for (int i = 0; i < length; i++) {
			starArray[i] = '*';
		}
		return starArray;

	}

	private static String arrayToString(char[] arr) {

		StringBuilder word = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			word.append(arr[i]);
		}
		return word.toString();
	}
}
