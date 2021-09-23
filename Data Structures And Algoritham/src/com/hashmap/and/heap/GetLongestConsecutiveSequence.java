package com.hashmap.and.heap;

import java.util.HashMap;

/*longest consecutive sequence*/
public class GetLongestConsecutiveSequence {
	public static void main(String[] args) {

		int[] arr = { 10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2 };
		printStartOfconsecutiveSequence(arr);
		System.out.println("\n\n");
		
		printConsecutiveSequence(arr);
	}

	private static void printStartOfconsecutiveSequence(int[] arr) {
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		for(int data:arr) {
			map.put(data,true);
		}
		
		for(int data:arr) {
			if(map.containsKey(data-1)) {
				map.put(data, false);
			}
		}
		
		for(Integer key : map.keySet()) {
			if(map.get(key)==true) {
			   System.out.println(key + " " + map.get(key));
			}
		}
	}
	
	
	private static void printConsecutiveSequence(int[] arr) {
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		
		for(int data:arr) {
			map.put(data,true);
		}
		
		for(int data:arr) {
			if(map.containsKey(data-1)) {
				map.put(data, false);
			}
		}
		
		int tl=0;
		for(int data:arr) {
			tl=1;
			if(map.get(data)==true) {
				System.out.print(data+" ");
					
					while(map.containsKey(data+tl)) {
						System.out.print(data+tl+" ");
						tl++;
					}
				
				System.out.println();
			}
			
			
		}
	}
}
