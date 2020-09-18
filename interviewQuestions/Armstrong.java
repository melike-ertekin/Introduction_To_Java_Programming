package interviewQuestions;

public class Armstrong {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether the given number is armstrong number or
		 * not. Armstrong Number in Java: A positive number is called armstrong number
		 * if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370,
		 * 371, 407 etc.
		 * 
		 * 153 = (1 * 1 * 1 ) + (5 * 5 * 5) + (3 * 3 * 3) => True
		 * 
		 */

		System.out.println(isArmStrong(153));
		System.out.println(isArmStrong2(-153));
		System.out.println(isArmStrong2(-153));

	}

	public static boolean isArmStrong(int number) {
		int sum = 0;
		String numString = "" + number;

		for (int i = 0; i < numString.length(); i++) {
			sum += Math.pow(Integer.parseInt(numString.substring(i, i + 1)), 3);

		}

		return sum == number;
	}

	public static boolean isArmStrong2(int number) {
		int sum = 0;
		int myNum = number;

		while (number != 0) {
			int digit = number % 10;
			sum += digit * digit * digit;
			number = number / 10;

		}

		return sum == myNum;
	}

}
