package com.hashmap.and.heap;

import java.util.HashMap;

public class FirstNonRepeatatingCharacter {
	public static void main(String[] args) {

		String str = "abbcaddecfab";
		char ch = findFirstNonRepeatatingCharacter(str);
		System.out.println("First Non Repeatating Char : " + ch);
	}

	private static char findFirstNonRepeatatingCharacter(String str) {

		HashMap<Character, Integer> charFreqMap = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			charFreqMap.put(str.charAt(i), charFreqMap.getOrDefault(str.charAt(i), 0) + 1);
		}

		for (int i = 0; i < str.length(); i++) {
			if (charFreqMap.get(str.charAt(i)) == 1)
				return str.charAt(i);
		}

		return '#'; // default value
	}
}
