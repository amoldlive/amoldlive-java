package com.leetcode.easy;

public class IsPallindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(120));
		System.out.println(isPalindrome(0));
		System.out.println(isPalindrome(-321));
	}

	public static boolean isPalindrome(int x) {
		boolean ans = false;
		int rev = 0, i = 1;
		int y = x;

		if (x < 0)
			return ans;

		while (x != 0) {
			int rem = x % 10;
			x = x / 10;
			rev = rev * i + rem;
			i = 10;
		}

		if (y == rev)
			ans = true;

		return ans;
	}
}