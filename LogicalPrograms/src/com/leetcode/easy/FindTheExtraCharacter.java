package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class FindTheExtraCharacter {
	public static void main(String[] args) {
		String s = "abcd", t = "abcde";

		char ch = findTheDifference(s, t);
		System.out.println("Extra Char : " + ch);
		
		ch = findTheDifference2(s, t);
		System.out.println("Extra Char : " + ch);
	}
	public static char findTheDifference2(String s, String t) {
		char ans = '!';
			int sVal=0;
			int tVal=0;
			for (int i = 0; i < s.length(); i++) {
				sVal+=s.charAt(i);
				tVal+=t.charAt(i);
			}
		
			//System.out.println(sVal +"  " +tVal);
			tVal+=t.charAt(s.length());
			//System.out.println(sVal +"  " +tVal);
			ans=(char)(tVal-sVal);
		return ans;
	}
	public static char findTheDifference(String s, String t) {
		char ans = '!';
		ArrayList<Character> list = new ArrayList<Character>(t.length());

		for (int i = 0; i < t.length(); i++) {
			list.add(t.charAt(i));
		}

		for (int i = 0; i < s.length(); i++) {
			list.remove(Character.valueOf(s.charAt(i)));
		}
		//System.out.println(list);
		ans=list.get(0);
		return ans;
	}
}
