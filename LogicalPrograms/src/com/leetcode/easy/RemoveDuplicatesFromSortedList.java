package com.leetcode.easy;

import com.arrays.ArrayUtility;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2 };
		int[] arr2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(arr));
		ArrayUtility.print(arr);
		System.out.println(removeDuplicates(arr2));
		ArrayUtility.print(arr2);
	}

	
	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0)
			return 0;

		int count = 0;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i - 1] != nums[i]) {
				count++;
				nums[count] = nums[i];
			}

		}

		return count + 1;
	}

}
