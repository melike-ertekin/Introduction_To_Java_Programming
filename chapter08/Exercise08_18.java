package chapter08;

public class Exercise08_18 {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };
		print(arr);
		shuffle(arr);
		print(arr);
	}

	public static void shuffle(int[][] m) {

		for (int i = 0; i < m.length; i++) {

			int random = (int) (Math.random() * m.length);

			int temp = m[i][0];
			m[i][0] = m[random][0];
			m[random][0] = temp;

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
