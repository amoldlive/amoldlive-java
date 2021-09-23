package com.leetcode.easy;

public class ReverseNumber {
	public static void main(String[] args) {
		/*
		 * Example 1:
		 * 
		 * Input: x = 123 Output: 321 Example 2:
		 * 
		 * Input: x = -123 Output: -321 Example 3:
		 * 
		 * Input: x = 120 Output: 21 Example 4:
		 * 
		 * Input: x = 0 Output: 0
		 */
		System.out.println(reverse(123));
		System.out.println(reverse(120));
		System.out.println(reverse(0));
		System.out.println(reverse(-123));
		System.out.println(reverse(1534236469)); // 0
		System.out.println(reverse(-1563847412)); // 0
	}

	public static int reverse(int x) {
		long ans = 0;
		int i = 1;

		while (x != 0) {
			int rem = x % 10;
			x = x / 10;
			ans = ans * i + rem;
			i = 10;
		}

		if (ans != (int) ans) {
			ans = 0;
			return (int) ans;
		}
		return (int) ans;
	}

}