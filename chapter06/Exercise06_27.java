package chapter06;

public class Exercise06_27 {

	public static void main(String[] args) {
		int counter = 0;

		for (int number = 2;; number++) {
			if (isPrime(number) && isReversePrime(number) && !isPalindrome(number)) {
				counter++;
				if (counter % 10 == 0) {
					System.out.println(number + " ");
				} else {
					System.out.print(number + " ");
				}
				if (counter == 100) {
					break;
				}
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

	public static boolean isReversePrime(int number) {
		return isPrime(reverse(number));
	}

	public static boolean isPalindrome(int number) {
		return reverse(number) == number;
	}

	public static int reverse(int number) {

		String numString = String.valueOf(number);
		int reversedNum = 0;

		for (int i = numString.length() - 1; i >= 0; i--) {

			reversedNum += Integer.parseInt(numString.substring(i, i + 1)) * (int) Math.pow(10, i);

		}

		return reversedNum;
	}

}
