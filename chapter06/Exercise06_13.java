package chapter06;

public class Exercise06_13 {

	public static void main(String[] args) {

		System.out.printf("%2s %10s\n", "i", "m(i)");

		for (int i = 1; i <= 20; i++) {
			System.out.printf("%2d %10.4f\n", i, computeSeries(i));
		}
	}

	public static double computeSeries(int num) {
		double sum = 0;

		for (double i = 1; i <= num; i++) {
			sum += i / (i + 1);
		}
		return sum;

	}
}
