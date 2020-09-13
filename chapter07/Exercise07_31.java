package chapter07;

import java.util.Scanner;

public class Exercise07_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1: ");
		int list1Length = input.nextInt();
		int[] list1 = new int[list1Length];

		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		System.out.print("Enter list2: ");
		int list2Length = input.nextInt();
		int[] list2 = new int[list2Length];

		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		int[] mergedArr = merge(list1, list2);

		System.out.print("The merged list is ");
		for (int i = 0; i < mergedArr.length; i++) {
			System.out.print(mergedArr[i] + " ");
		}
	}

	public static int[] merge(int[] list1, int[] list2) {

		int[] mergedArr = new int[list1.length + list2.length];

		int list1Index = 0;
		int list2Index = 0;

		for (int i = 0; i < mergedArr.length; i++) {

			if (((list1Index < list1.length && list2Index < list2.length) && (list1[list1Index] <= list2[list2Index]))
					|| list2Index == list2.length) {
				mergedArr[i] = list1[list1Index];
				list1Index++;
			} else {
				mergedArr[i] = list2[list2Index];
				list2Index++;
			}
		}
		return mergedArr;
	}
}
