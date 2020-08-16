package chapter03;

import java.util.Scanner;

public class Exercise03_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();
		double cost = 0;

		if (weight > 20) {
			System.out.println("The package can not be shipped");
			System.exit(0);
		} else if (weight > 10) {
			cost = 10.5;
		} else if (weight > 3) {
			cost = 8.5;
		} else if (weight > 1) {
			cost = 5.5;
		} else {
			cost = 3.5;
		}

		System.out.println("Cost is " + cost);

	}

}
