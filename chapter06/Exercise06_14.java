package chapter06;

public class Exercise06_14 {

	public static void main(String[] args) {
		System.out.printf("%2s %10s\n", "i", "m(i)");

		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%3d %10.4f\n", i, computeSeries(i));
		}
	}

	public static double computeSeries(int num) {
		double sum = 0;

		for (double i = 1; i <= num; i++) {
			sum += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		return 4 * sum;

	}
}
