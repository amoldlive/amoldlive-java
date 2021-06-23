package com.number.arr;

import java.util.HashSet;

public class PrintPairOfTarget {
	public static void main(String[] args) {
		
		int[] arr= {2,3,4,1};
		int target=5;
		printPair(arr, target);
		
	}
	public static void printPair(int[] arr, int target) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(!set.contains(target-arr[i])) {
				set.add(arr[i]);
			}else {
				System.out.println(target-arr[i] +"  , "+ arr[i]);
			}
			
		}
		
	}
}
