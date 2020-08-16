package chapter03;

import java.util.Scanner;

public class Exercise03_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter temperature: ");
		double temperature = input.nextDouble();

		System.out.print("Enter speed: ");
		double speed = input.nextDouble();

		if (temperature > -58 && temperature < 41 && speed >= 2) {
			double windChill = (35.74 + 0.6215 * temperature) - (35.75 * Math.pow(speed, 0.16))
					+ (0.4275 * temperature * Math.pow(speed, 0.16));

			System.out.println("Wind-Chill: " + windChill);
		} else {

			System.out.println("Invalid.");

		}

	}

}
