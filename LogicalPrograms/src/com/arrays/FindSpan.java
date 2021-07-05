package com.arrays;

public class FindSpan {
	public static void main(String[] args) {
		int[] arr = { 9, 7, 5, 6, 8, 4, 3, 2, 10 };
		findSpan(arr);
	}

	public static void findSpan(int[] arr) {

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];

			if (min > arr[i])
				min = arr[i];
		}
		
		int span=max-min;
		System.out.println("Span : "+span);

	}

}
