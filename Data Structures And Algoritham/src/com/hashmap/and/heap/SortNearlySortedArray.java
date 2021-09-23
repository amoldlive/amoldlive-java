package com.hashmap.and.heap;

import java.util.PriorityQueue;

public class SortNearlySortedArray {
	public static void main(String[] args) {
		
		int[] arr= {2,3,1,4,6,7,5,8,9};
		int k=3; //space
		
		sortArray(arr, k);
		

	}
	
	private static void sortArray(int[] arr , int k) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i<k) {
				queue.add(arr[i]);
				continue;
			}
			
			System.out.print(queue.remove()+" ");
			queue.add(arr[i]);
			
		}
		while(!queue.isEmpty())
			System.out.print(queue.remove()+" ");
	}
}
