package chapter06;

public class Exercise06_08 {

	public static void main(String[] args) {

		System.out.printf("%10s %15s    |   %15s %10s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		System.out.println("--------------------------------------------------------------\n");

		for (double i = 40, k = 120; i > 30; i--, k -= 10) {
			System.out.printf("%9.1f   %10.1f        |     %10.1f   %10.2f\n", i, celsiusToFahrenheit(i), k,
					fahrenheitToCelsius(k));
		}
	}

	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {

		return (5.0 / 9) * (fahrenheit - 32);
	}
}