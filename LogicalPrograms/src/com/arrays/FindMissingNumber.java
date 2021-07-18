package com.arrays;

public class FindMissingNumber {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5 };

		int missingNumber = findMissingNumber(arr);
		System.out.println(missingNumber);
	}

	private static int findMissingNumber(int[] arr) {

		/* find sum of 0-arrlength+1 items */
		int arrLen = arr.length + 1;
		int sumOfArrLength = arrLen * (arrLen + 1) / 2;

		/* Find sum of existing array */
		int sumOfExistingArray = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfExistingArray += arr[i];
		}

		int missingNumber = sumOfArrLength - sumOfExistingArray;

		return missingNumber;
	}

}
