package chapter08;

import java.util.Scanner;

public class Exercise08_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns of the array: ");
		int rowNum = input.nextInt();
		int colNum = input.nextInt();

		double matrix[][] = new double[rowNum][colNum];
		System.out.println("Enter the array: ");

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}

		}
		int[] arr = locateLargest(matrix);
		System.out.println("The location of the largest element is at (" + arr[0] + ", " + arr[1] + ")");

	}

	public static int[] locateLargest(double[][] a) {
		int[] xy = new int[2];

		int maxRow = 0;
		int maxCol = 0;
		double maxVal = a[0][0];

		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {

				if (maxVal < a[row][column]) {
					maxVal = a[row][column];
					maxCol = column;
					maxRow = row;
				}

			}

		}

		xy[0] = maxRow;
		xy[1] = maxCol;

		return xy;
	}

}
