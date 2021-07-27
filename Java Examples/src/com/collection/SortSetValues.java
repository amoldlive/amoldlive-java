package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortSetValues {
	public static void main(String[] args) {

		Set<String> numSet = new HashSet<String>();
		numSet.add("Z");
		numSet.add("C");
		numSet.add("E");
		numSet.add("A");
		numSet.add("B");
		numSet.add("M");

		// By default its unsorted
		System.out.println(numSet);

		// way-1 to sort data
		List<String> list = new ArrayList<String>(numSet);
		Collections.sort(list);
		System.out.println(list);

		// way-2 to sort data
		TreeSet<String> sortedSet = new TreeSet<>(numSet);
		System.out.println(sortedSet);
	}
}
