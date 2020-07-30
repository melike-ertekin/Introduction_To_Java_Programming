package chapter03;

import java.util.Scanner;

public class Exercise03_02 {

	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 10);
		int number2 = 5 + (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 5);

		int sum = number1 + number2 + number3;

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		int userSum = input.nextInt();

		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + userSum + " is " + (sum == userSum));

	}

}
