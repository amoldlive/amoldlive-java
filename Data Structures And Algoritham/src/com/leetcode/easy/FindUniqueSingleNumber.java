package com.leetcode.easy;
import java.util.HashMap;

public class FindUniqueSingleNumber {
	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(arr));
		int[] arr2 = { 4 };
		System.out.println(singleNumber(arr2));

		int[] arr3 = {};
		System.out.println(singleNumber(arr3));

	}

	public static int singleNumber(int[] nums) {
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (int num : map.keySet()) {
			if (map.get(num) == 1)
				ans = num;
		}

		return ans;
	}

	public static int singleNumberUsingXOR(int[] nums) {
		int ans = 0;

		for (int i = 0; i < nums.length; i++) {
			ans = ans ^ nums[i];
		}

		return ans;
	}
}
