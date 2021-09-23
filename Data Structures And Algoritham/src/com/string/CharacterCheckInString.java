package com.string;

import java.util.Arrays;

public class CharacterCheckInString {
	public static void main(String[] args) {
		System.out.println(checkCharacters("Grab", "Brag"));
	}
	static boolean checkCharacters(String str1 , String str2) {
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String s1=Arrays.toString(arr1);
		String s2=Arrays.toString(arr2);
		
		if(s1.equals(s2))
			return true;
		
		return false;
	}
	
}
