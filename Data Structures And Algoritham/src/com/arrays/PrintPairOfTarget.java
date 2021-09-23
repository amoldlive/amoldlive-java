package com.arrays;

import java.util.HashSet;

public class PrintPairOfTarget {
	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 1 };
		int target = 5;
		printPair(arr, target);
		System.out.println();
		
		printPairOptimized(arr, target);
	}

	public static void printPairOptimized(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			
			if(set.contains(target-arr[i])) {
				System.out.print(target-arr[i] +" , "+ arr[i] +" \n");
			}
						
			set.add(arr[i]);
		}

	}

	public static void printPair(int[] arr, int target) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(target - arr[i])) {
				set.add(arr[i]);
			} else {
				System.out.println(target - arr[i] + "  , " + arr[i]);
			}

		}

	}
}
