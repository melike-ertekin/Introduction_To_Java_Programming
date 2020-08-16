package chapter05;

import java.util.Scanner;

public class Exercise05_45 {

	public static void main(String[] args) {
		/**
		 * (Statistics: compute mean and standard deviation) In business applications,
		 * you are often asked to compute the mean and standard deviation of data. The
		 * mean is simply the average of the numbers. The standard deviation is a
		 * statistic that tells you how tightly all the various data are clustered
		 * around the mean in a set of data. For example, what is the average age of the
		 * students in a class? How close are the ages? If all the students are the same
		 * age, the deviation is 0. Write a program that prompts the user to enter ten
		 * numbers, and displays the mean and standard deviations of these numbers using
		 * the following formula:
		 */

		Scanner input = new Scanner(System.in);

		double[] arr = new double[10];

		double num;
		double mean = 0;
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextDouble();
			mean += arr[i];
		}

		mean = mean / 10;
		System.out.println("The mean is " + mean);

		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += Math.pow((arr[i] - mean), 2);

		}

		double sd = Math.sqrt(sum / 9);
		System.out.printf("The standard deviation is %.5f", sd);

	}

}
