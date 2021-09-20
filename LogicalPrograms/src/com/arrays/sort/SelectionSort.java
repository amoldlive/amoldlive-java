package com.arrays.sort;

import com.arrays.ArrayUtility;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 8, 7, 6, 5, 4, 3, 2 };

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
		int N=arr.length;
		
		int min = 0;
		for (int i = 0; i < N; i++) {
			min = i;
			for (int j = i + 1; j < N; j++) {
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
