package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.TreeSet;

public class CollectionsExample {

	public static void main(String[] args) {
		
		/*Now string buffer also implements comparable*/
		TreeSet<StringBuffer> sortedSet=new TreeSet<>();
		sortedSet.add(new StringBuffer("E")); 
		sortedSet.add(new StringBuffer("D"));
		
		sortedSet.add(new StringBuffer("F"));
		sortedSet.add(new StringBuffer("D"));
		sortedSet.add(new StringBuffer("a"));
		sortedSet.add(new StringBuffer("1"));
		sortedSet.add(new StringBuffer("16"));
		sortedSet.add(new StringBuffer("100g"));
		//sortedSet.add("sdsd");
		System.out.println(sortedSet);
		
		
		
		
		
		ArrayList<String> aList=new ArrayList<>();
		aList.add("A");
		aList.add("B");
		aList.add("C");
		aList.add("D");
		
		aList.set(2, "**"); //replace the value
		aList.add(2, "__"); // add new value
		
		System.out.println(aList);
		
		
		HashMap<String, String> map=new HashMap<>();
		map.put(null, "sss");
		
		System.out.println(map);
		
		Map<Integer, String> map2=new HashMap<Integer, String>();
		map2.put(new Integer(10), "A");
		map2.put(new Integer(10), "B");
		
		System.out.println(map2);
		
		map2=new IdentityHashMap();
		map2.put(new Integer(10), "A");
		map2.put(new Integer(10), "B");
		
		System.out.println(map2);
		
		
		//array to arraylisy
		Integer[] arr= {1,2,3,4};
		
		ArrayList<Object> intList=new ArrayList<>(Arrays.asList(arr));
	
		//arrayList to Array
		Integer[] arr2=new Integer[intList.size()];
		
		arr2=intList.toArray(arr);
		
		
		Integer i=Integer.parseInt("22");
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("a");
		System.out.println(l.hashCode());
	}
	
	class Student implements Comparable<Integer>{
		int id;
		String name;
		
		@Override
		public int compareTo(Integer o) {
			return 0;
		}
		
	}
	
}
