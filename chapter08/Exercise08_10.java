package chapter08;

public class Exercise08_10 {

	public static void main(String[] args) {

		int matrix[][] = new int[4][4];

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {

				matrix[row][column] = (int) (Math.random() * 2);
				System.out.print(matrix[row][column] + " ");

			}

			System.out.println();
		}

		maxRow(matrix);
		maxColumn(matrix);
	}

	public static void maxRow(int[][] matrix) {
		int rowCounter = 0;
		int rowMax = 0;
		int rowMaxIndex = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {

				if (matrix[row][column] == 1) {
					rowCounter++;
				}
			}

			if (rowCounter > rowMax) {
				rowMax = rowCounter;
				rowMaxIndex = row;
			}
			rowCounter = 0;

		}

		System.out.println("\nThe largest row index: " + rowMaxIndex);
	}

	public static void maxColumn(int[][] matrix) {
		int colCounter = 0;
		int colMax = 0;
		int colMaxIndex = 0;

		for (int column = 0; column < matrix[0].length; column++) {
			for (int row = 0; row < matrix.length; row++) {

				if (matrix[row][column] == 1) {
					colCounter++;
				}
			}

			if (colCounter > colMax) {
				colMax = colCounter;
				colMaxIndex = column;
			}
			colCounter = 0;

		}

		System.out.println("\nThe largest column index: " + colMaxIndex);
	}

}
