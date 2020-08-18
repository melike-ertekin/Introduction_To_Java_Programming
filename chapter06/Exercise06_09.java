package chapter06;

public class Exercise06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%10s %15s    |   %15s %10s\n", "Feet", "Meter", "Meter", "Feet");
		System.out.println("--------------------------------------------------------------\n");

		for (double i = 1, k = 20; i < 11; i++, k += 5) {
			System.out.printf("%9.1f   %10.3f        |     %10.1f   %10.3f\n", i, footToMeter(i), k, meterToFoot(k));
		}
	}

	/** Convert from feet to meters */
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {

		return 3.279 * meter;
	}
}
