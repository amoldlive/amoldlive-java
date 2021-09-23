package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static void main(String[] args) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		// Output: [["bat"],["nat","tan"],["ate","eat","tea"]];
		groupAnagrams(strs).forEach(i -> System.out.print(i + " "));

		System.out.println();

		groupAnagrams_Solution2(strs).forEach(i -> System.out.print(i + " "));
	}

	private static ArrayList<ArrayList<String>> groupAnagrams_Solution2(String strArr[]) {
		HashMap<HashMap<Character, Integer>, ArrayList<String>> bigMap = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();
		HashMap<Character, Integer> fmap;
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

		for (String str : strArr) {
			fmap = new HashMap<Character, Integer>();
			for (int i = 0; i < str.length(); i++) {
				fmap.put(str.charAt(i), fmap.getOrDefault(str.charAt(i), 0) + 1);
			}

			if (bigMap.containsKey(fmap)) {
				ArrayList<String> list = bigMap.get(fmap);
				list.add(str);
				bigMap.put(fmap, list);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str);
				bigMap.put(fmap, list);
			}

		}

		for (ArrayList<String> values : bigMap.values()) {
			result.add(values);
		}

		return result;
	}

	/* 89 % faster than other logics */
	private static List<List<String>> groupAnagrams(String str[]) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		List<List<String>> cList = new ArrayList<List<String>>();

		for (int i = 0; i < str.length; i++) {
			char[] ch = str[i].toCharArray();
			Arrays.sort(ch);
			String sortedString = String.valueOf(ch);

			if (map.containsKey(sortedString)) {
				ArrayList<String> list = map.get(sortedString);
				list.add(str[i]);
				map.put(sortedString, list);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(str[i]);
				map.put(sortedString, list);
			}
		}
		for (String keys : map.keySet()) {
			cList.add(map.get(keys));
		}
		return cList;
	}
}
