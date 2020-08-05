package chapter05;

import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer, the input ends if it is 0: ");

		int number = -1;
		int negCount = 0;
		int posCount = 0;
		double sum = 0;

		while (number != 0) {

			number = input.nextInt();

			if (number > 0) {
				posCount++;
			} else if (number < 0) {
				negCount++;
			} else {
				break;
			}
			sum = sum + number;
		}

		int totalNum = posCount + negCount;

		if (totalNum == 0 && number == 0) {
			System.out.println("No numbers are entered except 0");
		} else {
			System.out.println("The number of positives is " + posCount);
			System.out.println("The number of negatives is " + negCount);
			System.out.println("The total is " + sum);
			System.out.println("The average(not counting zeros) is  " + sum / totalNum);
		}

	}

}
