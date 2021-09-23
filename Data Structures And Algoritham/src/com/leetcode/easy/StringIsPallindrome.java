package com.leetcode.easy;

public class StringIsPallindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

		System.out.println(checkPalindrome("a"));
		System.out.println(checkPalindrome("ab"));
		System.out.println(checkPalindrome(""));
		System.out.println(checkPalindrome(" "));
	}

	public static boolean isPalindrome(String s) {
		boolean ans = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					|| (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {

				sb.append(String.valueOf(s.charAt(i)).toLowerCase());

			}
		}

		return checkPalindrome(sb.toString());
	}

	public static boolean checkPalindrome(String s) {
		// boolean ans=false;
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}

		return true;
	}
}
