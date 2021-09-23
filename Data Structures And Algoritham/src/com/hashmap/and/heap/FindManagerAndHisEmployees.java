package com.hashmap.and.heap;

import java.util.HashMap;
import java.util.HashSet;

public class FindManagerAndHisEmployees {

	public static void main(String[] args) {
		/* Input */
		/*
		 * AC BC CF DE EF FF
		 */
		String[] str = { "AC", "BC", "CF", "DE", "EF", "FF" };

		findManagerAndHisEMployee(str);

		System.out.println("********");

		findManagerAndHisEMployeeOptimized(str);

	}

	public static void findManagerAndHisEMployeeOptimized(String[] str) {
		HashMap<Character, HashSet<Character>> map = new HashMap<Character, HashSet<Character>>();
		HashSet<Character> set = null;

		for (String emp : str) {
			Character employee = emp.charAt(0);
			Character manager = emp.charAt(1);

			if (!employee.equals(manager)) {
				if (map.containsKey(manager)) {
					set = map.get(manager);
					set.add(employee);
					map.put(manager, set);
				} else {
					set = new HashSet<>();
					set.add(employee);
					map.put(manager, set);
				}
			}
		}
		System.out.println(map);
	}

	public static void findManagerAndHisEMployee(String[] str) {

		HashMap<String, String> map = prepareMap(str);
		System.out.println(map);
		HashMap<String, HashSet<String>> outMap = new HashMap<String, HashSet<String>>();
		String ceo;
		for (String emp : map.keySet()) {

			String manager = map.get(emp);

			/* CEO manager==employee */
			if (manager.equals(emp)) {
				ceo = manager;
			} else {

				if (outMap.containsKey(manager)) {
					HashSet<String> empSet = outMap.get(manager);
					empSet.add(emp);
					outMap.put(manager, empSet);

				} else {

					HashSet<String> empSet = new HashSet<>();
					empSet.add(emp);
					outMap.put(manager, empSet);
				}
			}

		}

		System.out.println(outMap);
	}

	private static HashMap<String, String> prepareMap(String[] str) {

		HashMap<String, String> map = new HashMap<String, String>();

		for (String empManPair : str) {
			char[] ch = empManPair.toCharArray();

			map.put(ch[0] + "", ch[1] + "");
		}
		return map;
	}
}
