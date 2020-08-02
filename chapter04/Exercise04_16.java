package chapter04;

public class Exercise04_16 {

	public static void main(String[] args) {

		// [65,90] A..Z
		int randomNum = 65 + (int) (Math.random() * 26); // or (Math.random() * 26 + 'A');
		System.out.println((char) randomNum);
	}

}
