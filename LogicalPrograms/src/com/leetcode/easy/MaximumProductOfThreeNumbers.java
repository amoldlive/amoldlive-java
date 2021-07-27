package com.leetcode.easy;

public class MaximumProductOfThreeNumbers {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int sum=maximumProduct(nums);
		System.out.println("Sum : "+sum);
		
		int[] nums2 = {1,2,3,4,5};
		sum=maximumProduct(nums2);
		System.out.println("Sum : "+sum);
	
	}

	public static int maximumProduct(int[] nums) {
		
		int sum=1;
			
		for (int i = nums.length-1; i >nums.length-4; i--) {
			sum*=nums[i];
		}
		
		return sum;
	}
}
