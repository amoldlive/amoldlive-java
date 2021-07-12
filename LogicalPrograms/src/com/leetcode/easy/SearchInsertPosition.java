package com.leetcode.easy;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int target = 5;
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, target));
		target = 2;
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, target));
		target = 7;
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, target));
		target = 0;
		System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, target));
	}

	public static int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target || nums[i] > target) {
				return i;
			}
		}
		if (nums[nums.length - 1] < target) {
			return nums.length;
		}

		return 0;
	}
}
