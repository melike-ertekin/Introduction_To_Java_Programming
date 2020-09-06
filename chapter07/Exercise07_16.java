package chapter07;

import java.util.Arrays;

public class Exercise07_16 {

	public static void main(String[] args) {

		int[] array = new int[100000];
		int key = (int) (Math.random() * 100000);
		setup(array);

		long startTime = System.currentTimeMillis();
		linearSearch(array, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Lineer search takes " + executionTime);

		Arrays.sort(array);

		startTime = System.currentTimeMillis();
		binarySearch(array, key);
		endTime = System.currentTimeMillis();
		System.out.println("Binary search takes " + executionTime);

	}

	public static void setup(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100000);

		}

	}

	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}

		return -low - 1; // Now high < low, key not found
	}

}
