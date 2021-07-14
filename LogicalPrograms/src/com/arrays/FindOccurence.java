package com.arrays;

import java.util.HashMap;

public class FindOccurence {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 5, 6, 5, 2, 7, 6 };

		DisplayArrayUsingRecurssion.printArray(arr, 0);
		System.out.println();

		System.out.println("first index : " + findFirstIndex(arr, 0, 5));
		System.out.println("first index : " + findFirstIndex(arr, 0, 2));

		int arr2[] = { 2, 3,2, 1, 4, 3,5, 6, 5, 2, 7, 6 ,6,6};
		System.out.println("Second index : " + findSecondIndex(arr2, 2));
		System.out.println("Second index : " + findSecondIndex(arr2, 6));
		

	}

	public static int findFirstIndex(int arr[], int index, int data) {

		if (index == arr.length) {
			return index;
		}

		int firstIndex = findFirstIndex(arr, index + 1, data);
		if (arr[index] == data) {
			return index;
		} else {
			return firstIndex;
		}
	}

	public static int findSecondIndex(int arr[], int data) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data && count<2) {
				map.put(data, i);
				count++;
			}
		}
		return map.get(data);
	}

	public static int findLastIndex(int arr[], int index, int data) {
		return 0;
	}
}
