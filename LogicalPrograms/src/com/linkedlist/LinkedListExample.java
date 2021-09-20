package com.linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("D");
		list.add("E");

		
		System.out.println(list);
		System.out.println(list.size());
		int s=list.size()-3;
		int v=list.size()-2;
		ListIterator<String> iterator=(ListIterator<String>) list.iterator();
		int count=0;
		while(iterator.hasNext()) {
			String val=iterator.next();
			count++;
			if(count>=v) {
				System.out.println(val);
			}
		}
		
//		System.out.println(list.pollLast());
		
//		System.out.println(list);
		
		
		
	}
}
