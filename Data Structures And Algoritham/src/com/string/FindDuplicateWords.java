package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateWords {
	public static void main(String[] args) {

		String str = "big black bug bit a big black bug dog on his big black nose";

		getWordCount(str).entrySet().stream().forEach(System.out::println);

	}

	static HashMap<String, List<Integer>> getWordCount(String str) {
		System.out.println(str + "\n");

		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		ArrayList<Integer> position = new ArrayList<Integer>();

		int count = 0;
		String[] arr = str.split(" ");
		int freq[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			position = new ArrayList<Integer>();
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && !arr[i].equals("0")) {
					if (count == 1) {
						position.add(i);
					}
					count++;
					arr[j] = "0";

					position.add(j);
				}
			}

			if (count > 1 && arr[i] != "0")
				map.put(arr[i], position);
				

		}

		return map;

	}
}
