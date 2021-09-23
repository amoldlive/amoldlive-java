package com.hashmap.and.heap;

import java.util.HashMap;

public class FindWordPatternOneToOneMapping {
	public static void main(String[] args) {
		String pattern = "abbcdea";
		String words[] = { "the", "pep", "pep", "on", "code", "road", "the" };
		String words2[] = { "the", "pep", "pep", "on", "code", "the", "the" };
		String words3[] = { "the", "pep", "pep", "on", "code", "the", "code" };
		String words4[] = { "the", "pep", "on", "on", "code", "road", "the" };
		// onetoOne mapping >> a-the b-pep b-pep c-on d-code e-road a-the

		System.out.println(isCorrectMapping(pattern, words));
		/* Negative test cases */
		System.out.println(isCorrectMapping(pattern, words2));
		System.out.println(isCorrectMapping(pattern, words3));
		System.out.println(isCorrectMapping(pattern, words4));
	}

	private static boolean isCorrectMapping(String pattern, String[] words) {
		boolean ans = true;
		HashMap<Character, String> chMap = new HashMap<Character, String>();
		HashMap<String, Boolean> strMap = new HashMap<String, Boolean>();
		if (pattern.length() != words.length)
			return false;
		
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];

			if (chMap.containsKey(ch)) {
				String val = chMap.get(ch);
				if (!val.equals(word)) {
					return false;
				} else {
					chMap.put(ch, word);
					strMap.put(word, true);
				}

			} else {
				if (strMap.containsKey(word)) {
					return false;
				} else {
					chMap.put(ch, word);
					strMap.put(word, true);
				}
			}
		}

		return ans;
	}
}
