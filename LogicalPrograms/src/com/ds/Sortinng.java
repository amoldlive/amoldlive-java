package com.ds;

public class Sortinng {
	public static void main(String[] args) {
//		System.out.println(isSmallest(8, 6));
//		arr= {3,2,1}; //unmodifieble Array

		int[] arr = { 2, 3, 1, 7, 4, 6, 5, 9, 0 };
		print(arr, "Original");
		bubbleSort(arr);
		print(arr, "Bubble Sort");

		int[] arr2 = { 2, 3, 1, 7, 4, 6, 5, 9, 0 };
		print(arr2, "Original");
		selectionSort(arr2);
		print(arr2, "Selection Sort");

		int[] arr3 = { 2, 3, 1, 7, 4, 6, 5, 9, 0 };
		print(arr3, "Original");
		insertionSort(arr3);
		print(arr3, "Insertion Sort");

		int[] arr4 = { 1, 3, 4, 5, 9 };
		int[] arr5 = { 2, 6, 7, 8 };
		print(arr4, "Sorted array 1");
		print(arr5, "Sorted array 2");

		int[] result = mergeTwoSortedArray(arr4, arr5);
		print(result, "merged Array");

		int[] arrx = { 4, 3, 5, 2, 1 };
		int[] mArr = mergeSort(arrx, 0, arrx.length - 1);
		print(mArr, "Merge Sort");

		int[] arry = { 4, 3, 5, 2, 1 };
		print(arry, "Original");
		partitionArray(arry, 3);
		print(arry, "After Partitioning");

		int[] arrz = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		print(arrz, "Before partitioning");
		int index = partitioning(arrz, 0, arrz.length - 1);
		print(arrz, "After Partitioninig " + index + " ");

		int[] arrz2 = { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		// print(arrz, "Before Quick Sort");
		quickSort(arrz2);
		print(arrz2, "After Sorting ");
	}

	public static void quickSort(int[] arr) {
		quickSortHelper(arr, 0, arr.length - 1);
	}

	public static void quickSortHelper(int[] arr, int lo, int hi) {
		if (lo < hi) {
			int indexOfSortedElement = partitioning(arr, lo, hi);
			quickSortHelper(arr, lo, indexOfSortedElement);
			quickSortHelper(arr, indexOfSortedElement + 1, hi);
		}
	}

	public static int partitioning(int[] arr, int lo, int hi) {

		int pivot = arr[lo];
		int i = lo, j = hi;

		while (i < j) {

			while (arr[i] <= pivot)
				i++;

			while (arr[j] > pivot)
				j--;

			if (i < j)
				swap(arr, i, j);
		}
		swap(arr, lo, j);
		return j;
	}

	/**
	 * Seperate data<pivot && data>pivot
	 * 
	 * @param arr
	 * @param pivot
	 */
	public static void partitionArray(int[] arr, int pivot) {
		int i = 0;
		int j = 0;

		while (i < arr.length) {
			if (arr[i] > pivot) {
				i++;
			} else {
				swap(arr, i, j);
				i++;
				j++;
			}
		}
	}

	/**
	 * Merge Sort -> devide array into 2 then merge it into sorted order
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public static int[] mergeSort(int[] arr, int low, int high) {

		if (low == high) {
			return new int[] { low };
		}

		int mid = (low + high) / 2;

		int[] fsa = mergeSort(arr, low, mid);
		int[] ssa = mergeSort(arr, mid + 1, high);
		int[] fullsorted = mergeTwoSortedArray(fsa, ssa);
		return fullsorted;
	}

	/**
	 * Merge two sorted array
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] newArr = new int[arr1.length + arr2.length];

		// print(arr1, "Left Array");
		// print(arr2, "Right Array");

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				newArr[k] = arr1[i];
				i++;
				k++;
			} else {
				newArr[k] = arr2[j];
				j++;
				k++;
			}
		}

		/* add rest of the elements from arr1 */
		while (i < arr1.length) {
			newArr[k] = arr1[i];
			i++;
			k++;
		}

		/* add rest of the elements from arr2 */
		while (j < arr2.length) {
			newArr[k] = arr2[j];
			j++;
			k++;
		}
		return newArr;
	}

	/**
	 * insertion sort [2,1,3] - [2] -> [1,2] - > [1,2,3]
	 * 
	 * @param arr
	 */
	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (isGreater(arr, j, j + 1)) {
					swap(arr, j, j + 1);
				} else {
					break;
				}
			}
		}

	}

	/**
	 * in selection sort smallest element will be placed at first position in each
	 * iteration
	 * 
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (isSmallest(arr, j, min)) {
					min = j;
				}
			}

			swap(arr, min, i);
		}
	}

	/**
	 * o(n2) in buuble sort greatest element will be placed at last position in each
	 * iteration
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (isSmallest(arr, j + 1, j)) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	public static boolean isSmallest(int[] arr, int i, int j) {
		if (arr[i] < arr[j])
			return true;
		else
			return false;
	}

	public static boolean isGreater(int[] arr, int i, int j) {
		if (arr[i] > arr[j])
			return true;
		else
			return false;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr, String message) {
		System.out.print(message + " : ");
		printArray(arr, 0);
		System.out.println();
	}

	static void printArray(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}

		System.out.print(arr[index] + " "); // print in forward direction
		printArray(arr, index + 1);
		// System.out.print(arr[index]+" ");//print in reverse direction
	}
}
