package com.arrays.sort;

import com.arrays.ArrayUtility;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 8, 7,6, 5, 4, 3, 2 };

		/* Printing non sorted element */
		ArrayUtility.print(arr);
		/* Sorting elements */
		bubbleSort(arr);
		/* Printing sorted element */
		ArrayUtility.print(arr);
	}

	/**
	 * Best Case : If the numbers are already sorted in ascending order, the
	 * algorithm will determine in the first iteration that no number pairs need to
	 * be swapped and will then terminate immediately. The algorithm must perform
	 * n-1 comparisons; therefore: The best-case time complexity of Bubble Sort is:
	 * O(n) The worst-case time complexity of Bubble Sort is: O(n²)
	 */
	public static void bubbleSort(int arr[]) {

		/* N-1 (arr.length-1) elements needs to be sorted , Nt element will be sorted automatically */
		int N = arr.length - 1;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
