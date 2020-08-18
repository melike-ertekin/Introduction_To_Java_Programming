package chapter06;

public class Exercise06_02 {

	public static void main(String[] args) {
		System.out.println(sumDigits(234));
	}

	public static int sumDigits(long n) {
		int digitSum = 0;
		int digit;
		while (n != 0) {

			digit = (int) n % 10;
			digitSum += digit;
			n = n / 10;
		}
		return digitSum;
	}

}
