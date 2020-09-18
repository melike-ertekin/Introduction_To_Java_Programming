package chapter08;

import java.util.Scanner;

public class Exercise08_05 {

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

		System.out.println("The matrices are added as follows ");

		print(matrix1, matrix2, addMatrix(matrix1, matrix2));

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {

		double sum[][] = new double[3][3];

		for (int row = 0; row < a.length; row++) {

			for (int column = 0; column < sum[row].length; column++) {
				sum[row][column] = a[row][column] + b[row][column];

			}

		}
		return sum;
	}

	public static void print(double[][] matrix1, double[][] matrix2, double[][] sum) {

		for (int row = 0; row < matrix1.length; row++) {
			for (int column = 0; column < matrix1[row].length; column++) {
				System.out.print(matrix1[row][column] + " ");
			}

			if (row == 1) {
				System.out.print("  +   ");
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

				System.out.print(sum[row][column] + " ");
			}

			System.out.println();
		}

	}

}
