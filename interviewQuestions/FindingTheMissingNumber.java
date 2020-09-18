package interviewQuestions;

import java.util.Arrays;

public class FindingTheMissingNumber {

	/*
	 * You are given 99 numbers between 1 and 100, write a function to find the
	 * missing number to have all the numbers by 100. (My interview question for
	 * 110k$ job)
	 */
	public static void main(String[] args) {

		System.out.println(missingNum(new int[] { 1, 2, 4, 5 }));
		System.out.println(missingNum(new int[] { 5, 2, 3, 7, 4, 8, 1, 9, 10 }));
		System.out.println(missingNum2(new int[] { 5, 2, 3, 7, 4, 8, 1, 9, 10 }));
	}

	public static int missingNum(int[] nums) {
		int[] arr = new int[101];

		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]] = arr[nums[i]] + 1;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				return i;
			}
		}

		return -1;
	}

	public static int missingNum2(int[] nums) {
		
		int sum = 0;
		int result = (10*11) / 2;
		
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		return (result-sum);
	}
}
