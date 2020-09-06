package chapter07;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07_04 {

	public static void main(String[] args) {
		// Read n num
		// find ave.
		// find number of numbers above, below, equal ave.
		// enter neg to end reading
		
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers: ");
		double input_num = input.nextDouble();

		if (input_num < 0) {
			System.out.println("Exit");
			System.exit(0);
			
		} else {
			
			ArrayList<Double> numbers = new ArrayList<>();

			double sum = 0;
			while (input_num >= 0) {

				numbers.add(input_num);
				sum += input_num;
				input_num = input.nextDouble();
			}

			int above = 0, below = 0, equal = 0;

			for (int i = 0; i < numbers.size(); i++) {
				if (numbers.get(i) < sum / numbers.size()) {
					below++;
				} else if (numbers.get(i) > sum / numbers.size()) {
					above++;
				} else if (numbers.get(i) == sum / numbers.size()) {
					equal++;
				}

			}
			System.out.println(sum / numbers.size() + " is average.");
			System.out.println(above + " numbers above average.");
			System.out.println(below + " numbers below average.");
			System.out.println(equal + " numbers equal average.");
		}

	}

}
