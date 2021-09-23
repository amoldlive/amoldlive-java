package com.arrays;

import java.util.HashMap;

public class GetFrequencyOfArrElement {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 5, 6, 7, 4, 5, 6 };

		getFrequencyOfArrElements(arr).forEach((k, v) -> System.out.println(k + "  : " + v));
	}

	public static HashMap<Integer, Integer> getFrequencyOfArrElements(int arr[]) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int data : arr) {
			map.put(data, map.getOrDefault(data, 0) + 1);
		}

		return map;
	}

}
