package com.linkedlist;

import java.util.LinkedList;

public class MergeTwoSortedLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(60);
		list.add(80);
		list.add(90);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(5);
		list2.add(20);
		list2.add(50);
		list2.add(70);

		LinkedList<Integer> sortedList = getMergeSortedLinkedList(list, list2);
		System.out.println("Sorted List : "+sortedList);
	}

	private static LinkedList<Integer> getMergeSortedLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> sortedList = new LinkedList<>();

		while (!list1.isEmpty() && !list2.isEmpty()) {
			if (list1.getFirst() < list2.getFirst()) {
				sortedList.add(list1.getFirst());
				list1.remove(list1.getFirst());
			} else {
				sortedList.add(list2.getFirst());
				list2.remove(list2.getFirst());
			}
		}

		while(!list1.isEmpty()) {
			sortedList.add(list1.getFirst());
			list1.remove(list1.getFirst());
		}
		
		while(!list2.isEmpty()) {
			sortedList.add(list2.getFirst());
			list2.remove(list2.getFirst());
		}
		return sortedList;
	}
}
