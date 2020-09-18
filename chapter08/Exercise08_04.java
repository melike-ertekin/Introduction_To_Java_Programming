package chapter08;

public class Exercise08_04 {

	public static void main(String[] args) {

		double[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		int[] weeklyHours = new int[workHours.length];

		for (int i = 0; i < workHours.length; i++) {

			int sum = 0;
			for (int j = 0; j < workHours[i].length; j++) {
				sum += workHours[i][j];
			}
			weeklyHours[i] = sum;
		}

		int[] employeeNumber = new int[weeklyHours.length];

		for (int i = 0; i < employeeNumber.length; i++) {
			employeeNumber[i] = i;
		}

		for (int i = 0; i < weeklyHours.length; i++) {

			int max = weeklyHours[i];
			int maxIndex = i;

			for (int j = i + 1; j < weeklyHours.length; j++) {
				if (weeklyHours[j] > max) {
					max = weeklyHours[j];
					maxIndex = j;
				}

			}

			if (maxIndex != i) {

				weeklyHours[maxIndex] = weeklyHours[i];
				weeklyHours[i] = max;

				int temp = employeeNumber[i];
				employeeNumber[i] = employeeNumber[maxIndex];
				employeeNumber[maxIndex] = temp;
			}
		}

		for (int i = 0; i < employeeNumber.length; i++) {
			System.out.println("Employee " + employeeNumber[i] + "'s weekly hour is " + weeklyHours[i]);
		}

	}

}
