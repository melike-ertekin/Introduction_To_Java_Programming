package chapter05;

public class Exercise05_07 {

	public static void main(String[] args) {

		/*
		 * (Financial application: compute future tuition) Suppose that the tuition for
		 * a university is $10,000 this year and increases 5% every year. In one year,
		 * the tuition will be $10,500. Write a program that computes the tuition in ten
		 * years and the total cost of four years’ worth of tuition after the tenth
		 * year.
		 */

		double tution = 10000;
		double increaseInAYear = 1.05;

		for (int i = 0; i < 10; i++) {
			tution = tution * increaseInAYear;
			System.out.printf("Tution in " + (i + 1) + ((i + 1) > 1 ? " years" : " year") + ": %.3f \n\n", tution);
		}
		System.out.println("***** Total Cost of 4 years Education after 10 year *****\n");

		double sum = 0;
		for (int i = 0; i < 4; i++) {
			tution = tution * increaseInAYear;
			sum = sum + tution;
			System.out.printf("Tution in " + (i + 1) + ((i + 1) > 1 ? " years" : " year") + ": %.3f \n\n", tution);
		}
		System.out.printf("\nTotal cost of 4 years education after 10 years:  %.3f \n", sum);

	}

}
