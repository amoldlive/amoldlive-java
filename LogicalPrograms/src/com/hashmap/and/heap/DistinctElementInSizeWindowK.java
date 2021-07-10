package com.hashmap.and.heap;

import java.util.HashMap;

public class DistinctElementInSizeWindowK {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 5, 6 }; // 1,2 | 2,3 | 2,3,4 | 3,4,5 | 4 5 6
		int k = 3;
		printDistinctElementInSizeWindowK(arr, k);
	}

	private static void printDistinctElementInSizeWindowK(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = 0, j = -1;

		while (i <= k - 2) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			i++;
		}

		while (i <= arr.length - 1) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // aquire element
			System.out.println(map.keySet());
			i++;
			j++;
			if (map.get(arr[j]) == 1) { /* release element */
				map.remove(arr[j]);
			} else {
				map.put(arr[j], map.get(arr[j]) - 1);
			}
		}

	}
}
