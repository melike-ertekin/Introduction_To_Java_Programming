package chapter05;

public class Exercise05_18 {

	public static void main(String[] args) {
		/*
		 * (Display four patterns using loops) Use nested loops that display the
		 * following patterns in four separate programs: Pattern A Pattern B Pattern C
		 * Pattern D
		 */

		// A
		for (int row = 1; row <= 6; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("\n************\n");
		
		// B
		for (int row = 6; row >= 1; row--) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("\n************\n");

		// C
		int lines = 6;
		for (int row = 1; row <= lines; row++) {

			for (int space = lines; space > row; space--) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("\n************\n");

		// D
		for (int row = 1; row <= 6; row++) {

			for (int space = row; space > 1; space--) {
				System.out.print("  ");
			}
			for (int num = 1; num <= lines; num++) {
				System.out.print(num + " ");
			}
			lines--;

			System.out.println();
		}

	}

}
