package com.ad.java8;

import java.util.List;
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
	}
	
}	
