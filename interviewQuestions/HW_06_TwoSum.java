package interviewQuestions;

import java.util.Arrays;

public class HW_06_TwoSum {
	/**
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 *
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 *
	 * You can return the answer in any order
	 * 
	 * https://leetcode.com/problems/two-sum/
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
		System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
		System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));

	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {

			int num1 = nums[i];
			for (int j = i + 1; j < nums.length; j++) {

				int num2 = nums[j];

				if (num1 + num2 == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}

}
