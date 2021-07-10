package com.hashmap.and.heap;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayPairsDivisibleByK {
	public static void main(String[] args) {
		int[] arr = { 9, 56, 52, 72, 44, 80, 36, 96, 71, 60 };
		int[] arr2 = { 9, 56, 52, 72, 44, 80, 36, 96, 71, 60, 15 };
		int k = 8;
		System.out.println(isPairDivisibleByK(arr, k));
		System.out.println(isPairDivisibleByK(arr2, k));

		// Print pairs divisible by k
		int[] arr3 = { 2, 24, 11, 3, 5, 0 };
		k = 5;
		HashSet<HashSet<Integer>> set = printPairsDivisibleByK(arr3, k);
		System.out.println(set);
	}

	private static HashSet<HashSet<Integer>> printPairsDivisibleByK(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashSet<HashSet<Integer>> set = new HashSet<HashSet<Integer>>();
		HashSet<Integer> zeroRem = new HashSet<Integer>();
		HashSet<Integer> halfRem = new HashSet<Integer>();
		HashSet<Integer> diffRem = new HashSet<Integer>();

		/* rem map */
		for (int val : arr) {
			int rem = val % k;
			map.put(val, rem);
		}

		for (int val : arr) {
			int rem = val % k;

			if (rem == 0) {
				zeroRem.add(val);
				map.remove(val);
			} else if (2 * rem == k) {
				halfRem.add(val);
				map.remove(val);
			} else {
				diffRem = new HashSet<Integer>();

				for (Integer key : map.keySet()) {
					if (map.get(key) == (k - rem)) {
						diffRem.add(val);
						diffRem.add(key);
						map.remove(val);
						map.remove(key);
						break;
					}
				}

				if (!diffRem.isEmpty())
					set.add(diffRem);
			}

		}
		if (!zeroRem.isEmpty())
			set.add(zeroRem);

		if (!halfRem.isEmpty())
			set.add(halfRem);

		return set;
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
			} else if (rem * 2 == k) { // case 2 rem = k/2 | (rem*2=k)
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
