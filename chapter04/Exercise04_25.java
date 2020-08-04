package chapter04;

public class Exercise04_25 {

	public static void main(String[] args) {

		// MLK4444

		// [A,Z] [65,90] in ASCI
		for (int i = 0; i < 3; i++) {
			int letter = 65 + (int) (Math.random() * 26);
			System.out.print((char) letter);
		}

		// [0,9]
		for (int i = 0; i < 4; i++) {
			int number = (int) (Math.random() * 10);
			System.out.print(number);
		}

	}

}
