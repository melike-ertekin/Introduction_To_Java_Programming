package chapter05;

public class Exercise05_06 {

	public static void main(String[] args) {
		System.out.printf("%s   %10s    |     %s %9s\n", "Miles", "Kilometers","Kilometers", "Miles");

		for (int miles = 1, km = 20; miles <= 10 && km <= 65; miles += 1, km += 5) {
			System.out.printf("%2d  %10.3f        |   %4d    %15.3f", miles, (miles * 1.609), km, (km / 1.609));
			System.out.println();
		}

	}

}
