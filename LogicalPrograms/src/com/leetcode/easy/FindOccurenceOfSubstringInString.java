package com.leetcode.easy;

public class FindOccurenceOfSubstringInString {
	public static void main(String[] args) {
		String haystack = "hello", needle = "ll";
		System.out.println(strStr(haystack, needle));

		haystack = "hello";
		needle = "";
		System.out.println(strStr(haystack, needle));
		
		haystack = "aaaaa";
		needle = "bba";
		System.out.println(strStr(haystack, needle));
				
		haystack = "";
		needle = "a";
		System.out.println(strStr(haystack, needle));
		
		haystack = "aaa";
		needle = "a";
		System.out.println(strStr(haystack, needle));
		
	}

	public static int strStr(String haystack, String needle) {
			return 0;
	}
}
