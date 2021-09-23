package com.arrays.sort;

import com.arrays.ArrayUtility;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 2, 6, 4, 7, 9, 22, 12 };

		/* Printing non sorted element */
		ArrayUtility.print(arr);
		/* Sorting elements */
		insertionSort(arr);
		/* Printing sorted element */
		ArrayUtility.print(arr);
	}

	/*
	 * If the elements already appear in sorted order, there is precisely one
	 * comparison in the inner loop and no swap operation at all. The best-case time
	 * complexity of Insertion Sort is: O(n) The worst-case time complexity of
	 * Insertion Sort is: O(n²)
	 */
	private static void insertionSort(int[] arr) {
		/* [ 2 ] | [ 6, 4, 7, 9, 22, 12 ] */
		/* assume 0th element is sorted by default */
		/* start first loop from 1 */
		/* compare element from non sorted element with sorted element */

		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}
}
