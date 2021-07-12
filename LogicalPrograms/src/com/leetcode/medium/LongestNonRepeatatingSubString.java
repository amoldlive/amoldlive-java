package com.leetcode.medium;
import java.util.HashSet;

public class LongestNonRepeatatingSubString {
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
		s = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s));
		s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

		s = "au";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {

		HashSet<Character> set = new HashSet<Character>();
		int max = 0, j = 0;
		for (int i = 0; i < s.length(); i++) {
			
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(j++)); //release
			}
			set.add(s.charAt(i));
			max=Math.max(max, i-j+1);
		}

		return max;
	}
}
