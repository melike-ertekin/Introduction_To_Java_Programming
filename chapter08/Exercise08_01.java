package chapter08;

import java.util.Scanner;

public class Exercise08_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row: ");

		double matrix[][] = new double[3][4];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}

		}

		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i));
		}
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}

		return sum;
	}

}
