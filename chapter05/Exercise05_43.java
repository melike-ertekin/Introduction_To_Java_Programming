package chapter05;

public class Exercise05_43 {

	public static void main(String[] args) {

		int comb = 0;
		for (int i = 1; i < 8; i++) {
			for (int k = i + 1; k < 8; k++) {

				System.out.println(i + " " + k);
				comb++;

			}
		}
		System.out.println("The total number of all combinations is" + comb);

	}

}
