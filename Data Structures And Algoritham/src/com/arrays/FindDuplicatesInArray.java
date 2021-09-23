package com.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatesInArray {
	public static void main(String[] args) {

		findDuplicates(new int[] { 1, 4, 3, 2, 1, 3, 2, 6, 6, 7, 7, 7 })
				.forEach(t -> System.out.print(t +"  "));
		
		System.out.println();
		
		findDuplicates_v2(new int[] { 1, 4, 3, 2, 1, 3, 2, 6, 6, 7, 7, 7 })
		.forEach(t -> System.out.print(t +"  "));

	}

	/* iterative approach */
	public static HashSet<Integer> findDuplicates(int arr[]) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					set.add(arr[i]);
				}
			}
		}

		return set;
	}

	/* Optimized solution */
	public static HashSet<Integer> findDuplicates_v2(int arr[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int data : arr) {
			map.put(data, map.getOrDefault(data, 0) + 1);
		}

		for (int data : arr) {
			if(map.get(data)>1) {
				set.add(data);
			}
		}
		return set;
	}
}
