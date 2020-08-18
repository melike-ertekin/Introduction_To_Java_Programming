package chapter06;

public class Exercise06_11 {

	public static void main(String[] args) {

		System.out.printf("%10s %15s\n", "Sales Amount", "Commission");

		for (int i = 10000; i <= 100000; i += 5000) {
			System.out.printf("%6d  %18.1f\n", i, computeCommission(i));
		}

	}

	public static double computeCommission(double salesAmount) {
		double commission;

		if (salesAmount > 10001) {
			commission = 900 + (salesAmount - 10000) * 0.12;
		} else if (salesAmount > 5001) {
			commission = 400 + (salesAmount - 5000) * 0.1;
		} else if (salesAmount > 0) {
			commission = (salesAmount) * 0.08;
		} else {
			commission = 0;
		}

		return commission;
	}

}
