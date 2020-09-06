package chapter07;

public class Exercise07_13 {

	public static void main(String[] args) {
		
		System.out.println(getRandom(new int[] { 1, 2, 3 }));

	}

	public static int getRandom(int... numbers) {

		int random;
		boolean flag = false;

		while (true) {

			random = 1 + (int) (Math.random() * 54);

			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] == random) {
					flag = true;

				}
			}

			if (!flag) {
				return random;
			}

		}
	}

}
