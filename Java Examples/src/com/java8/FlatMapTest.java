package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(8);
		a1.add(6);

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(5);
		a2.add(2);
		a2.add(3);

		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(1);
		a3.add(6);
		a3.add(2);

		//adding all 3 list into single list
		al.add(a1);
		al.add(a2);
		al.add(a3);

		System.out.println(al);

		System.out.println();
		List<Integer> al2 = al.stream().flatMap(alist -> alist.stream().sorted()).sorted().collect(Collectors.toList());
		System.out.println(al2);

		/* Applied map fuction and then it will do the flatenning */
	}
}
