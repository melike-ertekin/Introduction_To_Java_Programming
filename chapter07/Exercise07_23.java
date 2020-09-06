package chapter07;

import java.util.Arrays;

public class Exercise07_23 {

	public static void main(String[] args) {

		int[] lockers = new int[100];// all 0: locked

		System.out.println(Arrays.toString(lockers));
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= lockers.length; j++) {
				if (j % i == 0) {
					if (lockers[j - 1] == 0) {
						lockers[j - 1] = 1;
					} else {
						lockers[j - 1] = 0;
					}

				}
			}
			System.out.printf("%3d. student:", i);
			System.out.println(Arrays.toString(lockers));
		}
	}

}
