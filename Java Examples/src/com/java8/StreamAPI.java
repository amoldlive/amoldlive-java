package com.java8;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result*/
public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < 50; i++) 
			list.add(i);
		
		System.out.println("Original LIst");
		list.forEach((t)->System.out.print(t+" "));
		
		Stream<Integer> parallelStream=list.stream().parallel();
		Stream<Integer> sequentialStream=list.stream().sequential();
		
		System.out.println();
		System.out.println("SortedLIst");	
		ArrayList<Integer> sortedList=(ArrayList<Integer>) parallelStream.filter(p->p%2==0).collect(Collectors.toList());
		sortedList.forEach(t->System.out.print(t+" "));
		//once data published , streams will get emptyd
	}
}
