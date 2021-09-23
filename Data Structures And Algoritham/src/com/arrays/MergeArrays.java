package com.arrays;

public class MergeArrays {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 4, 3 };
		int arr2[] = { 6, 7, 8, 5 };
		int arr3[] = mergeArray(arr1, arr2);
		printArray(arr3);
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {

		int newlength = arr1.length + arr2.length;

		int[] newArr = new int[newlength];
		int j = 0;
		int k=0;
		for (int i = 0; i < newlength; i++) {
			if (i < arr1.length) {
				newArr[i] = arr1[j];
				j++;
			}else {
				newArr[i]=arr2[k];
				k++;
			}
			
		}

		return newArr;
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
