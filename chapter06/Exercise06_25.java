package chapter06;

public class Exercise06_25 {

	public static void main(String[] args) {
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));

	}

	public static String convertMillis(long millis) {

		long totalSec = (millis / 1000);

		long currentHour = totalSec / (60 * 60);
		long currentMin = (totalSec / 60) % 60;
		long curretSec = totalSec % 60;

		String timeString = currentHour + ":" + currentMin + ":" + curretSec;

		return timeString;
	}

}
