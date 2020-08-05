package chapter05;

public class Exercise05_03 {

	public static void main(String[] args) {
		
		System.out.println("Kilogram        Pounds");

		for (int kg = 1; kg <= 199; kg += 2) {
			System.out.printf("%d               %.1f ", kg, (kg * 2.2));
			System.out.println();
		}

	}

}
