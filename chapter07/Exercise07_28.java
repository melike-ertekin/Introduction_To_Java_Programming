package chapter07;

import java.util.Scanner;

public class Exercise07_28 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 10 numbers ");

		int[] list = new int[10];

		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		printCombinations(list);
	}

	public static void printCombinations(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				System.out.println("(" + array[i] + "," + array[j] + ")");
			}
		}
	}

}
