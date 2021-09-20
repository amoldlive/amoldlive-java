package com.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 1, 2, 4, 5, 6, 3 };
		ArrayUtility.print(arr);
		int[] setArr = removeDuplicates(arr);
		ArrayUtility.print(setArr);
		Arrays.sort(setArr);
		ArrayUtility.print(setArr);
	}

	/*iterative Approach*/
	public static int[] removeDuplicates(int arr[]) {

		int block[] = new int[arr.length];
		int count = 0;

		for (int i = 0; i < block.length; i++) {
			block[i] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && block[j] != 0) {
					block[j] = 0;
					count++;
				}
			}

			// System.out.print(arr[i]+" ");
		}
		// System.out.println("count : "+count);
		int newlength = arr.length - count;
		int newarr[] = new int[newlength];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (block[i] != 0) {
				newarr[j] = arr[i];
				j++;
			}
		}

		return newarr;

	}

}
