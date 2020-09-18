package chapter08;

import java.util.Arrays;

public class Exercise08_16 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		print(arr);
		sort(arr);
		print(arr);
	}

	public static void sort(int m[][]) {

		for (int row = 0; row < m.length; row++) {

			int minX = m[row][0];
			int minRow = row;

			int minY = m[row][1];

			for (int row1 = row; row1 < m.length; row1++) {
				if (minX > m[row1][0]) {
					minX = m[row1][0];
					minRow = row1;
				}
			}

			for (int row1 = row; row1 < m.length; row1++) {
				if (minX == m[row1][0]) {

					if (minY > m[row1][1]) {
						minY = m[row1][1];
						minRow = row1;
					}

				}
			}

			if (minRow != row) {
				int tempX = m[minRow][0];
				int tempY = m[minRow][1];

				m[minRow][0] = m[row][0];
				m[minRow][1] = m[row][1];

				m[row][0] = tempX;
				m[row][1] = tempY;

			}

		}

	}

	private static void print(int[][] arr) {

		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("{");
			for (int j = 0; j < arr[0].length; j++) {
				if (j == 0) {
					System.out.print(arr[i][j] + ", ");

				} else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.print("}");
		}
		System.out.print("}");
		System.out.println();
	}
}
