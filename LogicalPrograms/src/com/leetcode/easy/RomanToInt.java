package com.leetcode.easy;

import java.util.HashMap;

public class RomanToInt {
	/*
	 * Example 1: Input: s = "III" Output: 3 Example 2: Input: s = "IV" Output: 4
	 * Example 3: Input: s = "IX" Output: 9 Example 4: Input: s = "LVIII" Output: 58
	 * Explanation: L = 50, V= 5, III = 3. Example 5: Input: s = "MCMXCIV" Output:
	 * 1994 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	 */
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int ans = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		ans = map.get(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
				ans -= map.get(s.charAt(i));
			} else {
				ans += map.get(s.charAt(i));
			}
		}
		return ans;
	}

	/* faster than above */
	public static int romanToInt2(String s) {
		int ans = 0;

		ans = getVal(s.charAt(s.length() - 1));

		for (int i = s.length() - 2; i >= 0; i--) {
			if (getVal(s.charAt(i)) < getVal(s.charAt(i + 1))) {
				ans -= getVal(s.charAt(i));
			} else {
				ans += getVal(s.charAt(i));
			}
		}
		return ans;
	}

	private static int getVal(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;

		default:
			return 0;
		}
	}

}