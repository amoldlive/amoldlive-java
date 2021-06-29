package com.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		
		List<Integer> list= List.of(1,2,3,4,6,4,3,7,2,77);
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		});
		
		//version 2
		list.forEach((t)-> System.out.print(t+" "));
		
		System.out.println("\n map data");
		
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		map.forEach((k,v) -> System.out.println(k +" "+v));
		
	}
	
}	
