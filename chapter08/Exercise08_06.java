package chapter08;

import java.util.Scanner;

public class Exercise08_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix1: ");

		double matrix1[][] = new double[3][3];

		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				matrix1[row][column] = input.nextDouble();
			}

		}

		System.out.print("Enter matrix2: ");
		double matrix2[][] = new double[3][3];

		for (int row = 0; row < matrix2.length; row++) {
			for (int column = 0; column < matrix2[row].length; column++) {
				matrix2[row][column] = input.nextDouble();
			}

		}

		System.out.println("The multiplication of the matrices is ");

		print(matrix1, matrix2, multiplyMatrix(matrix1, matrix2));

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] result = new double[3][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[0].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	public static void print(double[][] matrix1, double[][] matrix2, double[][] sum) {

		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				System.out.print(matrix1[row][column] + " ");
			}

			if (row == 1) {
				System.out.print("  *   ");
			} else {
				System.out.print("      ");
			}

			for (int column = 0; column < matrix2[row].length; column++) {
				System.out.print(matrix2[row][column] + " ");
			}

			if (row == 1) {
				System.out.print("  =   ");
			} else {
				System.out.print("      ");
			}

			for (int column = 0; column < sum[row].length; column++) {

				System.out.printf("%.1f  ", sum[row][column]);
			}

			System.out.println();
		}
	}
}
