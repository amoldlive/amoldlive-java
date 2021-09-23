package com.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		ArrayUtility.print(arr);
		reverseArray(arr);
		ArrayUtility.print(arr);

	}

	private static void reverseArray(int[] arr) {
		int i = 0;
		int j = arr.length-1;

		while (i < j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
			i++;
			j--;
		}

	}
}
