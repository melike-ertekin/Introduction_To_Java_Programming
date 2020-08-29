package chapter06;

public class Exercise06_32 {

	static int dice1;
	static int dice2;

	public static void main(String[] args) {
		int counter = 0;
		int i;
		for (i = 0; i < 10000; i++) {

			int sum = rollDice();

			System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + sum);

			if (sum == 2 || sum == 3 || sum == 12) {

				System.out.println("You lose.");

			} else if (sum == 7 || sum == 11) {

				System.out.println("You win.");
				counter++;
			} else {
				System.out.println("Point is " + sum);
				do {

					int prev = dice1 + dice2;
					int sum2 = rollDice();

					System.out.println("You rolled " + dice1 + "+" + dice2 + "=" + sum2);
					System.out.println("Point is " + sum2);

					if (sum2 == 7) {
						System.out.println("You lose.");
						break;
					} else {
						if (sum2 == prev) {
							System.out.println("You win.");
							counter++;
							break;
						}

					}

				} while (true);

			}

		}

		System.out.println("You won " + counter + " times in " + i + " rounds");
	}

	public static int rollDice() {
		dice1 = 1 + (int) (Math.random() * 6);
		dice2 = 1 + (int) (Math.random() * 6);
		return dice1 + dice2;
	}
}
