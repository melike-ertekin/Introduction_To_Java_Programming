package interviewQuestions;

import java.util.Arrays;

public class HW_05_RotateMatrix {
	/**
	 * Given an array, rotate the array to the right by k steps, where k is
	 * non-negative.
	 *
	 * Follow up:
	 *
	 * Try to come up as many solutions as you can, there are at least 3 different
	 * ways to solve this problem. Could you do it in-place with O(1) extra space?
	 *
	 * 
	 * https://leetcode.com/problems/rotate-array/
	 * 
	 * @author InarAcademy
	 *
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3)));// [5,6,7,1,2,3,4]
		System.out.println(Arrays.toString(rotate(new int[] { -1, -100, 5, 6, 3, 99 }, 2)));// [3,99,-1,-100,5,6]

	}

	// TODO later try to solve in-place
	public static int[] rotate(int[] nums, int k) {
		int[] newArray = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			newArray[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = newArray[i];
		}

		return nums;
	}

}
