package chapter09;

import java.util.Scanner;

public class Exercise09_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();

		double[][] array = new double[rows][columns];
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		Location location = locateLargest(array);

		System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", "
				+ location.column + ")");
	}

	/** locateLargest returns an instance of Location */
	public static Location locateLargest(double[][] a) {
		return new Location(a);
	}

}
