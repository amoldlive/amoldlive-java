package com.leetcode.easy;

import com.arrays.ArrayUtility;

public class RemoveElements {
	public static void main(String[] args) {
		int[] arr= {3,2,2,3};
		int k=3;
		System.out.println(removeElement(arr, k));	
		ArrayUtility.print(arr);
		
		int[] arr2= {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(arr, k));
		ArrayUtility.print(arr2);
	}
	public static int removeElement(int[] nums, int val) {
		
		int j=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}
}
