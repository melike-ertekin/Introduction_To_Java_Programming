package chapter08;

import java.util.Scanner;

public class Exercise08_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int cityNum = input.nextInt();

		System.out.println("Enter the coordinates of the cities: ");
		double matrix[][] = new double[5][2];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}

		}

		double[] distances = findCentralCity(matrix);

		int row = findMin(distances);
		System.out.println("The central city is at (" + matrix[row][0] + "," + matrix[row][1] + ")");
		System.out.println("The total distance to all other cities is " + distances[row]);
		for (int i = 0; i < distances.length; i++) {

		}
	}

	public static double[] findCentralCity(double[][] arr) {

		double[] cityDistance = new double[arr.length];

		for (int i = 0; i < arr.length; i++) {

			double sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += findDistance(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);

			}
			cityDistance[i] = sum;
			sum = 0;
		}

		return cityDistance;
	}

	public static double findDistance(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	public static int findMin(double[] arr) {

		double min = arr[0];
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}

		return minIndex;
	}

}
