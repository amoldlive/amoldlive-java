package com.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDataAsPerLength {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "mango", "apple", "guava", "pineapple", "guava", "apple");
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
}
