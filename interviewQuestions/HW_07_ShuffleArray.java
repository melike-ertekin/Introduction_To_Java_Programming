package interviewQuestions;

import java.util.Arrays;

public class HW_07_ShuffleArray {
	/**
	 * Given the array nums consisting of 2n elements in the form
	 * [x1,x2,...,xn,y1,y2,...,yn]
	 * 
	 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
	 * 
	 * https://leetcode.com/problems/shuffle-the-array/
	 *
	 */
	public static void main(String[] args) {

		System.out.println(Arrays.toString(shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3)));// [2,3,5,4,1,7]
		System.out.println(Arrays.toString(shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4)));// [1,4,2,3,3,2,4,1]
		System.out.println(Arrays.toString(shuffle(new int[] { 1, 1, 2, 2 }, 2)));// [1,2,1,2]

	}

	// TODO later try to solve in-place
	public static int[] shuffle(int[] nums, int n) {

		int arr[] = new int[2 * n];

		for (int i = 0, k = 0; i < nums.length; i += 2, k++) {
			arr[i] = nums[k];
			arr[i + 1] = nums[n];
			n++;
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = arr[i];
		}

		return nums;

	}

}
