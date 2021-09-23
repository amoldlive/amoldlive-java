package com.arrays.sort;

import com.arrays.ArrayUtility;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6 };

		int[] arr = mergeTwoSortedArray(arr1, arr2);
		ArrayUtility.print(arr);

		int[] arrIn = { 4, 3, 5, 2, 1 };
		int[] sortedArr = mergeSort(arrIn, 0, arrIn.length - 1);
		ArrayUtility.print(sortedArr);
	}

	/* The time complexity of Merge Sort is: O(n log n) */
	private static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] baseArr = new int[1];
			baseArr[0] = arr[lo];
			return baseArr;
		}

		int mid = (lo + hi) / 2;
		int[] arr1 = mergeSort(arr, lo, mid);
		int[] arr2 = mergeSort(arr, mid + 1, hi);
		int[] fullSortedArr = mergeTwoSortedArray(arr1, arr2);

		return fullSortedArr;
	}

	private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {

		int[] arr = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				k++;
				i++;
			} else {
				arr[k] = arr2[j];
				k++;
				j++;
			}
		}

		while (i < arr1.length) {
			arr[k] = arr1[i];
			k++;
			i++;
		}

		while (j < arr2.length) {
			arr[k] = arr2[j];
			k++;
			j++;
		}

		return arr;
	}
}
