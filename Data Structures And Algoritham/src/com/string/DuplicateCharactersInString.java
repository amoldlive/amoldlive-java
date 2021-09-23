package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateCharactersInString {
	public static void main(String[] args) {

		String str = "Great responsibility";

		getDuplicates(str).forEach(t -> System.out.print(t + " "));
		System.out.println("\nCharacter   :   Count");
		
		str="aAaAbBaaaccccd";
		getCharacterCount(str).forEach((k,v)->System.out.println(k+"  :  "+v));
		
		getCharacterCount(str).entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

	static List<Character> getDuplicates(String string) {

		char arr[] = string.toCharArray();

		int[] freq = new int[string.length()];
		int count = 0;

		for (int i = 0; i < freq.length; i++) {
			freq[i] = -1;
		}

		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freq[j] = 0;
					count++;
				}

			}

			if (count > 1 && freq[i] != 0) {
				// System.out.println("count + "+count + " : "+arr[i] + " : "+ freq[i]);
				charList.add(arr[i]);
			}
		}

		return charList;
	}
	
	
	static HashMap<Character,Integer> getCharacterCount(String string) {

		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		char arr[] = string.toCharArray();

		int[] freq = new int[string.length()];
		int count = 0;

		for (int i = 0; i < freq.length; i++) {
			freq[i] = -1;
		}

		ArrayList<Character> charList = new ArrayList<Character>();

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i]!=' ') {
					freq[j] = 0;
					count++;
				}

			}

			if (freq[i] != 0) {
				
				map.put(arr[i], count);
				 //System.out.println("count + "+count + " : "+arr[i]);
			}
		}

		return map;
	}
	
	
}
