package chapter07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 5 integers: ");

		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();

		}

		System.out.println(gcd(numbers));

	}

//12 4 |2*
//6  2 |2*
//3  1 |3	
//1  - |
	public static int gcd(int... numbers) {

		Arrays.sort(numbers);
		int gcd = 1;

		boolean flag;
		for (int i = 2; i <= numbers[0]; i++) {

			flag = true;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j] % i != 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				gcd = i;
			}
		}
		return gcd;
	}

}
