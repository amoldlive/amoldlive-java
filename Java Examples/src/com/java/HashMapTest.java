package com.java;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();

		map.put("A", 1);
		map2.put("A", 1);

		System.out.println(map == map2); // false
		System.out.println(map.equals(map2)); // true

	}
}
