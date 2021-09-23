package com.arrays;

public class InverseArray {
	public static void main(String[] args) {
		int arr[] = { 2,4,3,1,0 };
		ArrayUtility.print(arr);

		int invArr[] = inverseArray(arr);
		ArrayUtility.print(invArr);
	}

	private static int[] inverseArray(int[] arr) {

		int[] invArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int v = arr[i];
			invArr[v] = i;
		}

		return invArr;
	}

}
