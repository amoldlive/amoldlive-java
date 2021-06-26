package com.ad;

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
					HashSet<String> empSet=outMap.get(manager);
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
