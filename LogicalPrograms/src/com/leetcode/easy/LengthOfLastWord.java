package com.leetcode.easy;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s1="Hello World";
		System.out.println(lengthOfLastWord(s1));
		
		s1="Hello";
		System.out.println(lengthOfLastWord(s1));
		
		s1="";
		System.out.println(lengthOfLastWord(s1));
		
		s1=" ";
		System.out.println(lengthOfLastWord(s1));
	}

	public static int lengthOfLastWord(String s) {
		if(s.isBlank()) return 0;
		int ans=0;
		String[] str=s.split(" ");
		ans=str[str.length-1].length();
		return ans;
	}
}
