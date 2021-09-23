package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortDataAsPerLength {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "mango", "apple", "guava", "pineapple", "guava", "apple");
		solution1(fruits);

		System.out.println();

		solution2(fruits);
	}

	private static void solution1(List<String> fruits) {
		Collections.sort(fruits, (o1, o2) -> {
			if (o1.length() > o2.length()) {
				return 1;
			} else if (o1.length() < o2.length()) {
				return -1;
			} else {
				return 0;
			}

		});

		fruits.forEach(str -> System.out.print(str + " "));
	}

	private static void solution2(List<String> fruits) {
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

		for (String fruit : fruits) {
			if (map.containsKey(fruit.length())) {
				ArrayList<String> list = map.get(fruit.length());
				list.add(fruit);
				map.put(fruit.length(), list);
			} else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(fruit);
				map.put(fruit.length(), list);
			}

		}

		Set<Integer> set = map.keySet();
		set = set.stream().sorted().collect(Collectors.toSet());

		for (Integer key : set) {
			System.out.print(map.get(key) + " ");
		}
	}
}
