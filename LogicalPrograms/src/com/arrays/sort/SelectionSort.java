package com.arrays.sort;

import com.arrays.ArrayUtility;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 2, 6, 4, 7, 9, 22, 12 };

		/* Printing non sorted element */
		ArrayUtility.print(arr);
		/* Sorting elements */
		selectionSort(arr);
		/* Printing sorted element */
		ArrayUtility.print(arr);
	}

	/*
	 * Bes/Worst case complexity is O(n²)
	 */
	private static void selectionSort(int[] arr) {

		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					/* find min value */
					min = j;
				}
				/* swap min element with 1st element */
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

	}
}
