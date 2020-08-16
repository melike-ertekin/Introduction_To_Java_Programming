package chapter05;

import java.util.Scanner;

public class Exercise05_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = -1;
		int max = -1;
		int count = 0;

		System.out.print("Enter numbers: ");

		while (num != 0) {

			num = input.nextInt();
			if (num > max) {
				max = num;
				count = 1;
			} else if (num == max) {
				count++;
			}
		}

		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + count);

	}

}
