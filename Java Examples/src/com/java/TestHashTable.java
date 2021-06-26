package com.java;

import java.util.ArrayList;
import java.util.Hashtable;

public class TestHashTable {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		//ht.put(null, "A");  // null pointer exception
		//ht.put(1, null);   // null pointer exception
		ht.put(1, "A");
		System.out.println(ht);
		
	
	}
}
