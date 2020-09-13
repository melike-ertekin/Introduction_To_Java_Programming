package chapter07;

import java.util.Scanner;

public class Exercise07_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list: ");
		int listLength = input.nextInt();
		int[] list = new int[listLength];

		for (int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}

		partition(list);
		System.out.print("After the partition, the list is " + arrayToString(list));

	}

	public static int partition(int[] list) {

		int[] smallerList = new int[list.length];
		int[] biggerList = new int[list.length];

		int pivot = list[0];
		int pivotIndex = 0;

		int itemsNumInSmallerList = 0;
		int itemsNumInBiggerList = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i] < pivot) {
				smallerList[itemsNumInSmallerList] = list[i];
				itemsNumInSmallerList++;

			} else if (list[i] > pivot) {
				biggerList[itemsNumInBiggerList] = list[i];
				itemsNumInBiggerList++;
			}
		}

		int index;

		for (index = 0; index < itemsNumInSmallerList; index++) {
			list[index] = smallerList[index];
		}

		list[index] = pivot;
		pivotIndex = index;
		index++;

		for (int i = 0; i < itemsNumInBiggerList; i++) {
			list[index++] = biggerList[i];
		}

		return pivotIndex;
	}

	private static String arrayToString(int[] arr) {

		StringBuilder items = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			items.append(arr[i] + " ");
		}
		return items.toString();
	}

}
