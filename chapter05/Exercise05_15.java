package chapter05;

public class Exercise05_15 {

	public static void main(String[] args) {
		/*
		 * (Display the ASCII character table) Write a program that prints the
		 * characters in the ASCII character table from ! to ~. Display ten characters
		 * per line. The ASCII table is shown in Appendix B. Characters are separated by
		 * exactly one space.
		 */

		int inc = 1;
		for (int i = 33; i < 127; i++) {
			System.out.print((char) i + " ");
			if (inc % 10 == 0) {
				System.out.println();
			}
			inc++;
		}
	}

}
