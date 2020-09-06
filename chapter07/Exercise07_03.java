package chapter07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise07_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");

		ArrayList<Integer> numbersArrayList = new ArrayList<>();

		int number = input.nextInt();

		while (number != 0) {

			numbersArrayList.add(number);
			number = input.nextInt();
		}
		System.out.print("Sorted Array: ");
		Collections.sort(numbersArrayList);

		for (int i = 0; i < numbersArrayList.size(); i++) {

			System.out.print(numbersArrayList.get(i) + " ");
		}

		System.out.println();

		//123
		//122
		int start = 0;
		for (int i = 1; i < numbersArrayList.size(); i++) {

			if (numbersArrayList.get(start) != numbersArrayList.get(i)) {
				int counter = i - start;

				if (counter == 1) {
					System.out.println(numbersArrayList.get(start) + " occurs " + counter + " time.");
				} else {
					System.out.println(numbersArrayList.get(start) + " occurs " + counter + " times.");
				}

				start = i;

				if (i == numbersArrayList.size() - 1) {

					System.out.println(numbersArrayList.get(i) + " occurs 1 time.");
				}

			} else if (i == numbersArrayList.size() - 1) {
				int counter = i - start + 1;

				System.out.println(numbersArrayList.get(start) + " occurs " + counter + " times.");

			}
		}

	}

}
