package com.leetcode.easy;

import com.arrays.ArrayUtility;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1, m, nums2, n);
		ArrayUtility.print(nums1);

		int[] nums3 = { 1 };
		merge(nums3, 1, new int[] {}, 0);

		ArrayUtility.print(nums3);

		int[] nums4 = {};
		merge(nums4, 0, new int[] { 1 }, 1);

		ArrayUtility.print(nums3);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int arr[] = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {
			if (nums1[i] < nums2[j]) {
				arr[k] = nums1[i];
				i++;
				k++;
			} else {
				arr[k] = nums2[j];
				j++;
				k++;
			}
		}

		while (i < m) {
			arr[k] = nums1[i];
			i++;
			k++;
		}

		while (j < n) {
			arr[k] = nums2[j];
			j++;
			k++;
		}

		if (nums1.length > 0)
			for (int k2 = 0; k2 < arr.length; k2++) {
				nums1[k2] = arr[k2];
			}
	}
}
