package chapter06;

public class Exercise06_28 {

	public static void main(String[] args) {

		System.out.println("p          2^p-1\n");
		for (int number = 2; number <= 31; number++) {
			if (isPrime(number)) {

				System.out.println(number + "          " + (int) (Math.pow(2, number) - 1));

			}

		}

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
