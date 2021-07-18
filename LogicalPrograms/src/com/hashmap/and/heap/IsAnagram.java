package com.hashmap.and.heap;

import java.util.HashMap;

public class IsAnagram {
	public static void main(String[] args) {

		System.out.println(isAnagram("abbaccs", "sccaabb"));
		System.out.println(isAnagram("abbaccs", "sccaabd"));

	}

	private static boolean isAnagram(String s1, String s2) {
		boolean ans = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i))) {

				if (map.get(s2.charAt(i)) == 1) {
					map.remove(s2.charAt(i));
				} else {
					map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
				}

			}
		}

		return map.size() == 0 ? true : false;
	}
}
