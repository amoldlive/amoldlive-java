package com.leetcode.easy;

import java.util.HashMap;

/*Leet Code*/
public class SumOfNonContiguousSubArray {
	public static void main(String[] args) {
		int[] nums= {3,2,3};
		int target=6;
		int[] a=twoSum(nums, target);
		for(int i:a) {
			System.out.print(i+" ");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);	
		}

		return new int[] {0,0};
	}
}