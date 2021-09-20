package com.hashmap.and.heap;

import java.util.HashMap;

import com.arrays.ArrayUtility;

public class IsAnagram {
	public static void main(String[] args) {

		System.out.println(isAnagram("abbaccs", "sccaabb"));
		System.out.println(isAnagram("abbaccs", "sccaabd"));
		System.out.println(isAnagram("a", "ab"));

		System.out.println(isAnagramWithoutHash("abbaccs", "sccaabb"));
	}
	private static boolean isAnagramWithoutHash(String s1, String s2) {
		
		  int[] aa=new int[26];
	        if(s1.length()!=s2.length())
	            return false;
	        
	        for(char ch:s1.toCharArray()) 
	            aa[ch-'a']++;
	        
	        
	        for(char ch:s2.toCharArray())
				   aa[ch-'a']--;
	        
	        for(int i=0;i<26;i++)
	            if(aa[i]!=0)
	                return false;
	        
	       
	        return true;
	}
	private static boolean isAnagram(String s1, String s2) {
		boolean ans = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}
		
		for (int i = 0; i < s2.length(); i++) {
			map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);
		}

		return map.equals(map2);
	}
}
