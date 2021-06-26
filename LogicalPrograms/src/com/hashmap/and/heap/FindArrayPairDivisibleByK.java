package com.hashmap.and.heap;

import java.util.HashMap;

public class FindArrayPairDivisibleByK {
	public static void main(String[] args) {
		int[] arr = { 9, 56, 52, 72, 44, 80, 36, 96, 71, 60 };
		int[] arr2 = { 9, 56, 52, 72, 44, 80, 36, 96, 71, 60,15 };
		int k = 8;
		System.out.println(isPairDivisibleByK(arr, k));
		System.out.println(isPairDivisibleByK(arr2, k));
	}

	private static boolean isPairDivisibleByK(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int val : arr) {
			int rem = val % k;

			int of = map.getOrDefault(rem, 0);
			map.put(rem, of + 1);
		}

		for (int val : arr) {
			int rem = val % k;

			if (rem == 0) { // case-1 rem=0
				int freq = map.get(rem);
				if (freq % 2 == 1)
					return false;
			} else if (rem * 2 == k) { // case 2 rem = k/2 (rem*2=k)
				int freq = map.get(rem);
				if (freq % 2 == 1)
					return false;
			} else { // case-3 rem + K-rem = k
				int freq = map.get(rem);
				int otherFreq = map.get(k - rem);
				if (freq != otherFreq)
					return false;
			}

		}
		return true;
	}

}
