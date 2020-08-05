package chapter05;

//Minimizing Numeric Errors
public class Listing05_08 {

	public static void main(String[] args) {

		// Initialize sum
		float sum = 0;

		// Add 0.01, 0.02, ..., 0.99, 1 to sum
		for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
			sum += i;

		// Display result
		System.out.println("The sum is(float) " + sum);

		// ***************************************************
		// Initialize sum
		double sum2 = 0;

		// Add 0.01, 0.02, ..., 0.99, 1 to sum
		for (double i = 0.01; i <= 1.0; i = i + 0.01)
			sum2 += i;

		// Display result
		System.out.println("The sum is(double) " + sum2);

		// ***************************************************

		double sum3 = 0;
		double currentValue = 0.01;
		for (int count = 0; count < 100; count++) {
			sum3 += currentValue;
			currentValue += 0.01;
		}

		// Display result
		System.out.println("The sum is(double) " + sum3);

		// *****************************************************8

	}

}
