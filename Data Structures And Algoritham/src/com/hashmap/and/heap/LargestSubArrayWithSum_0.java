package com.hashmap.and.heap;

import java.util.HashMap;

public class LargestSubArrayWithSum_0 {
	public static void main(String[] args) {
		int[] arr = { -1, 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };
		int len = findLargestSubArray(arr, 0);
		System.out.println(len);
	}

	private static int findLargestSubArray(int[] arr, int K) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int i = -1;
		int maxLen = 0;
		map.put(sum, i);

		while (i < arr.length - 1) {
			i++;
			sum += arr[i];
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			} else {
				int len = i - map.get(sum);
				if (maxLen < len) {
					maxLen = len;
				}
			}
		}

		return maxLen;
	}
}
