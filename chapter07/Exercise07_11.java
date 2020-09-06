package chapter07;

import java.util.Scanner;

public class Exercise07_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] arr = new double[10];

		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = input.nextDouble();

		}

		System.out.printf("The mean is %.2f\n", mean(arr));

		System.out.printf("The standard deviation is %.5f", deviation(arr));

	}

	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		double sum = 0;
		double mean = mean(x);

		for (int i = 0; i < 10; i++) {
			sum += Math.pow((x[i] - mean), 2);

		}

		double sd = Math.sqrt(sum / 9);

		return sd;
	}

	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		double mean = 0;

		for (int i = 0; i < 10; i++) {
			mean += x[i];
		}

		return mean / x.length;
	}

}
