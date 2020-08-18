package chapter06;

public class Exercise06_10 {

	public static void main(String[] args) {
		int counter = 0;
		for (int j = 2; j < 10000; j++) {
			if (isPrime(j)) {
				counter++;
				System.out.println(j);
			}

		}
		System.out.print("Total prime numbers: " + counter);

	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime
	}

}
