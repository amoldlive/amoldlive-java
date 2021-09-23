package com.arrays.sort;

import com.arrays.ArrayUtility;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 14, 13, 15, 12, 11 };

		int sortedElementPosition = partitioning(arr, 0, arr.length - 1);
		System.out.println("SortedElementPosition : " + sortedElementPosition);

		int[] arr2 = { 14, 13, 15, 12, 11 };
		quickSort(arr2, 0, arr2.length - 1);
		ArrayUtility.print(arr2);
	}

	/*
	 * The best-case time complexity of Quicksort is: O(n log n) The worst-case time
	 * complexity of Quicksort is: O(n²)
	 */
	private static void quickSort(int[] arr, int lo, int hi) {

		if (lo < hi) {
			int sortedPosition = partitioning(arr, lo, hi);
			quickSort(arr, 0, sortedPosition);
			quickSort(arr, sortedPosition + 1, hi);
		}

	}

	/**/
	private static int partitioning(int[] arr, int lo, int hi) {

		int i = lo;
		int j = hi;
		/* pivot = first element */
		int pivot = arr[lo];

		while (i < j) {

			/* arr[i] element should be greater than pivot */
			while (arr[i] <= pivot)
				i++;

			/* searching arr[j] element smaller than pivot */
			while (arr[j] > pivot)
				j--;

			if (i < j)
				swap(arr, i, j);
		}

		swap(arr, lo, j);

		return j;
	}

	/* Swapping of two elements */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
