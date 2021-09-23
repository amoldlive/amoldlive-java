package com.hashmap.and.heap;

import java.util.HashMap;

public class GetCommonElement {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 1, 2, 5, 6, 4 };
		int[] arr2 = { 1, 3, 2, 7, 8, 5 };
		printCommonElement(arr1, arr2);
		
		System.out.println();
			
		int[] arr3 = { 1, 1, 1, 1, 2, 2, 2, 3, 4, 5 };
		int[] arr4 = { 1, 1, 2, 2, 3, 3, 6 };
		printAllCommonElement(arr3, arr4);

	}

	/* print common element - duplicates allowed */
	private static void printAllCommonElement(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int data : arr1) {
			map.put(data, map.containsKey(data) ? map.get(data) + 1 : 1);
		}
		
		for (int data : arr2) {
			if(map.containsKey(data) && map.get(data)>0) {
				System.out.print(data +" ");
				map.put(data, map.get(data)-1);
			}
		}

	}

	/* print common element - no duplicates allowed */
	public static void printCommonElement(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int data : arr1) {
			map.put(data, map.containsKey(data) ? map.get(data) + 1 : 1);
		}

		for (int data : arr2) {
			if (map.containsKey(data)) {
				System.out.print(data + "  ");
				map.remove(data);
			}
		}
	}

}
