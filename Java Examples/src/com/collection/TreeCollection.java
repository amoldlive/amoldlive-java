package com.collection;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeCollection {
	public static void main(String[] args) {
		
		testTreeSet();
			//testTreeMap();
	}
	
	public static void testTreeSet() {
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("A");
		ts.add("A");  // no duplicates allowed
		ts.add("Z");
		ts.add("C");
		ts.add("B");
		ts.add("M");
		ts.add("N");
		ts.add("a");
		
		System.out.println(ts);
		int x='a'; //97
		int X='A'; //65
		System.out.println(x);
		
		System.out.println(ts.tailSet("C"));
		System.out.println(ts.headSet("C"));
		
		TreeSet<String> ts2=new TreeSet<>();
		//ts2.add(null); //null -- null pointer exception
		ts2.add(""); //null
		
		System.out.println(ts2);
		
		
		
	}
	
	public static void testTreeMap() {
		TreeMap<Integer, String> tmap=new TreeMap<>();
			//tmap.put(null, "A"); // null poinuter exception
		tmap.put(1, null);
		tmap.put(1, null);
		tmap.put(1, null);
		tmap.put(2, null);
		tmap.put(3, null); // no duplicates allowed  // multiple null valies allowed
		System.out.println(tmap);
		
		tmap.put(8, "A");
		tmap.put(4, "B");
		tmap.put(6, "C");
		System.out.println(tmap);
	}
}
