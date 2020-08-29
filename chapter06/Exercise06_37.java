package chapter06;

public class Exercise06_37 {

	public static void main(String[] args) {
		System.out.println(format(34, 4));
		System.out.println(format(34, 5));
		System.out.println(format(34, 1));

	}

	public static String format(int number, int width) {

		String stringNum = number + "";
		StringBuilder zeros = new StringBuilder("");

		if (stringNum.length() < width) {

			for (int i = 1; i <= width - stringNum.length(); i++) {
				zeros = zeros.append("0");
			}
		}

		return zeros.append(stringNum).toString();
	}

}
