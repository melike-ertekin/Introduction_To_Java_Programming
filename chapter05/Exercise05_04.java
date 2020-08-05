package chapter05;

public class Exercise05_04 {

	public static void main(String[] args) {

		System.out.println("Miles        Kilometres");

		for (int mile = 1; mile <= 10; mile += 1) {
			System.out.printf("%d            %.3f ", mile, (mile * 1.609));
			System.out.println();
		}

	}

}
