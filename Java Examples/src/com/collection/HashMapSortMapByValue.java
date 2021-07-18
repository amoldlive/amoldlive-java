package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapSortMapByValue {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("A", 4);
		map.put("B", 3);
		map.put("C", 2);
		map.put("D", 1);
		map.forEach((i,j)->System.out.print(i+"-"+j +" "));
		
		ArrayList<Entry<String, Integer>> list=new ArrayList<>();
		for(Entry<String, Integer> entry : map.entrySet()) {
			list.add(entry);
		}
		
		System.out.println();
		
		list=(ArrayList<Entry<String, Integer>>) list.stream().sorted((e1,e2)->{
				return e1.getValue().compareTo(e2.getValue());
		}).collect(Collectors.toList());
		
		
		list.forEach((e1)->System.out.print(e1.getKey()+"-"+e1.getValue()+" "));
	}
}
