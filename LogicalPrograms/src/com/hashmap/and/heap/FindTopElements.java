package com.hashmap.and.heap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.PriorityBlockingQueue;

public class FindTopElements {
	public static void main(String[] args) {
		
		int arr[]= {6,4,7,1,22,87,9,54,65,21};
		int k=3;
		
		PriorityBlockingQueue<Integer> pb=new PriorityBlockingQueue<>(k);
		
		for (int i = 0; i < arr.length; i++) {
			if(i<k) {
			  pb.add(arr[i]);
			}
			else {
				if(pb.peek()<arr[i]) {
					pb.remove();
					pb.add(arr[i]);
				}
			}
		}
		
		//System.out.println(pb);
		ArrayList<Integer> list=new ArrayList<Integer>(pb);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
