package chapter06;

public class Exercise06_12 {

	public static void main(String[] args) {
		printChars('1', 'Z', 10);

	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {

		int counter = 1;
		for (int i = ch1; i <= ch2; i++) {

			if (counter % numberPerLine == 0) {
				System.out.print((char) i + " \n");
			} else {
				System.out.print((char) i + " ");
			}
			counter++;
		}
	}
}
