package chapter05;

public class Exercise05_05 {

	public static void main(String[] args) {

		System.out.println("Kilogram \t Pounds \t | \t Pounds \t Kilogram");

		for (int kg = 1, pound = 20; kg <= 199 && pound <= 515; kg += 2, pound += 5) {
			System.out.printf("%d \t\t %.1f \t\t | \t %d \t\t %.2f", kg, (kg * 2.2), pound, (pound / 2.2));
			System.out.println();
		}

	}

}
