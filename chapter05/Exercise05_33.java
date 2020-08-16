package chapter05;

public class Exercise05_33 {

	public static void main(String[] args) {

		int sum;
		for (int num = 1; num <= 10000; num++) {

			sum = 0;
			for (int k = 1; k < num; k++) {
				if (num % k == 0) {
					sum += k;
				}
			}
			if (sum == num) {
				System.out.println(num + " is a perfect number and sum of its positive divisors are " + sum);
			}
		}

	}

}
