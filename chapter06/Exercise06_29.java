package chapter06;

public class Exercise06_29 {

	public static void main(String[] args) {

		for (int i = 2; i <= 998; i++) {
			int num1 = i;
			int num2 = i + 2;

			if (isPrime(num1) && isPrime(num2)) {
				System.out.println("(" + num1 + "," + num2 + ")");
			}

		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
