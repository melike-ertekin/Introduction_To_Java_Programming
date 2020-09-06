package chapter07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise07_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 integers: ");

		int[] numbers = new int[10];

		for (int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(eliminateDuplicates(numbers)));
	}

	public static int[] eliminateDuplicates(int[] list) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < list.length; i++) {
			set.add(list[i]);
		}

		int[] arr = new int[set.size()];

		int i = 0;
		for (Integer s : set)
			arr[i++] = s;

		return arr;
	}
}
