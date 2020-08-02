package chapter04;

import java.util.Scanner;

public class Exercise04_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter two characters: ");
		String userInput = input.nextLine();
		char inputDepartment = userInput.charAt(0);
		char inputYear = userInput.charAt(1);

		String dept = "";
		String year = "";

		if (inputDepartment == 'M') {
			dept = "Mathematics";
		} else if (inputDepartment == 'C') {
			dept = "Computer Science";
		} else if (inputDepartment == 'M') {
			dept = "Mathematics";
		} else {
			System.out.println("Invalid input");
			System.exit(1);
		}

		if (inputYear == '1') {
			year = "Freshman";
		} else if (inputYear == '2') {
			year = "Sophomore,";
		} else if (inputYear == '3') {
			year = "Junior";
		} else if (inputYear == '4') {
			year = "Senior";
		} else {
			System.out.println("Invalid input");
			System.exit(1);
		}

		System.out.println(dept + " " + year);

	}

}
