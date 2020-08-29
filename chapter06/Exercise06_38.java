package chapter06;

public class Exercise06_38 {

	public static void main(String[] args) {

		int counter = 0;

		for (int i = 1; i <= 200; i++) {
			
			counter++;
			if (counter <= 100) {
				if (counter % 10 == 0) {
					System.err.println(getRandomUpperCaseLetter() + " ");
				} else {
					System.err.print(getRandomUpperCaseLetter() + " ");
				}

			} else {
				if (counter % 10 == 0) {
					System.err.println(getRandomDigitCharacter() + " ");
				} else {
					System.err.print(getRandomDigitCharacter() + " ");
				}

			}

		}

	}

	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

	/** Generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}

}
