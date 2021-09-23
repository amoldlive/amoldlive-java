package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

/*Program to find the first non repeating character in a string*/
public class FirstNonRepeatatingChar {
	
	/*
		char  count
		
		map 
		
		if char not present add char default value 1
		if char is present add 1 into value
	*/
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,2,3,2,3,4,5,3,1};
		
		String str="swirpssw";
		String str2 = "Hickory dickory dock. The mouse went up the clock " + 
				"The clock struck one. The mouse went down " + 
				"Hickory dickory dock";
		System.out.println(countCHaracterFromString(str));
		System.out.println(countWordsFromString(str2));
		
		lastRepeatatingNUmber(arr);
	}
	
	public static void lastRepeatatingNUmber(int[] arr) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		
			for (int i = 0; i < arr.length; i++) {
				map.put(arr[i], map.containsKey(arr[i]) ? map.get(arr[i])+1 : 1 );
			}
			
			System.out.println(map);
			
			int key=0;
			int maxval=0;
			
			for(Entry<Integer, Integer> entry : map.entrySet()) {
				if(entry.getValue()>maxval) {
					maxval=entry.getValue();
					key=entry.getKey();
				}
			}
			System.out.println("Key : "+key +"  Val : "+maxval);

			
	}
	
	public static HashMap<Character, Integer> countCHaracterFromString(String str) {
			
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		int defaultValue=1;
		
		for(Character c:str.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
		}
		
		for(Character c:str.toCharArray()) {
			if(map.get(c)==defaultValue) {
				System.out.println(c +" " + map.get(c));
				break;
			}
		}
		
		return map;
	}
	
	public static HashMap<String, Integer> countWordsFromString(String str) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		int defaultValue=1;
		String arr[]=str.split(" ");
		for(String c:arr) {
			map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
		}
		
		/*Max occuring Character*/		
		int max=printMaxOccuringWord(map);
		
		for(String c:arr) {
			//map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
			if(map.get(c)==max) {
				System.out.println("Max count : "+c);
				break;
			}
		}
		return map;
	}
	
	public static int printMaxOccuringWord(HashMap<String, Integer> map) {
		ArrayList<Integer> list=new ArrayList<Integer>(map.values());
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		return list.get(0);
	}

}
