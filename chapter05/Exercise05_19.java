package chapter05;

public class Exercise05_19 {

	public static void main(String[] args) {

		for (int cell = 8; cell > 0; cell--) {
			int row;
			int col;

			for (row = 1; row < cell; row++) {
				System.out.printf("%4s", " ");
			}

			for (col = 0; col < 8 - (row - 1); col++) {
				System.out.printf(" %3d", (int) Math.pow(2, col));

			}
			for (int col2 = col - 2; col2 >= 0; col2--) {
				System.out.printf(" %3d", (int) Math.pow(2, col2));

			}

			System.out.println();
		}

	}

}
