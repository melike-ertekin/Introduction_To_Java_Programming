package chapter05;

public class Exercise05_23 {

	public static void main(String[] args) {

		double sum1 = 1;
		for (double i = 1; i <= 50000; i++) {
			sum1 += 1 / i;
		}
		double sum2 = 0;

		for (double i = 50000; i >= 1; i--) {
			sum2 += 1 / i;
		}

		System.out.println("left to righ " + sum1);
		System.out.println("right to left " + sum2 + 1);

	}

}
