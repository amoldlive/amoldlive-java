package com.arrays.search;

import java.util.Arrays;

import com.arrays.ArrayUtility;

public class BinarySearch {
	public static void main(String[] args) {

		int arr[] = { 2, 6, 4, 7, 9, 12, 22 };
		int element = 4;
		// Elements should be sorted for binary search
		Arrays.sort(arr);

		// printing sorted arrays
		ArrayUtility.print(arr);

		binarySearchElement(arr, element);

	}

	/*
	 * In binary search, best-case complexity is O(1) where the element is found at
	 * the middle index. The worst-case complexity is O(log2n).
	 */
	private static void binarySearchElement(int[] arr, int element) {
		int lo = 0;
		int hi = arr.length - 1;
		int mid = (lo + hi) / 2;

		while (lo < hi) {

			if (arr[mid] == element) {
				System.out.println("Element : " + element + " | Position : " + (mid + 1));
				break;
			} else if (arr[mid] < element) {
				lo = mid;
			} else {
				hi = mid;
			}

			mid = (lo + hi) / 2;
		}

	}
}
