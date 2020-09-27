package chapter09;

public class Exercise09_03 {

	public static void main(String[] args) {

		java.util.Date date = new java.util.Date();

		for (int i = 0; i < 8; i++) {
			date.setTime((long) (10000 * Math.pow(10, i)));
			System.out.println(date.toString());
		}
	}

}
