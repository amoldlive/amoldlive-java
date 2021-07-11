package com.hashmap.and.heap;

import java.util.HashMap;
import java.util.HashSet;

public class SumOfContiguousSubArray {
	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 5, 7, 1, 2, 4, 7,10,-3 }; //contiguous
		int target = 7;

		findSubArrayUsingBrutForce(arr, target); // complexity O(n2)
		findSubArrayUsingHashing(arr, target); // complexity O(n)
 
		int[] arr2 = { 3,2,3 }; //non contiguous
		target = 6;
		findSubArrayUsingHashing(arr2, target); // complexity O(n)
	}

	public static void findSubArrayUsingHashing(int[] arr, int target) {
		
		int sum=0;
		HashSet<HashSet<Integer>> subArrayset = new HashSet<HashSet<Integer>>();
		
		HashMap<Integer, HashSet<Integer>> map=new HashMap<Integer, HashSet<Integer>>();
		HashSet<Integer> firstSet =new HashSet<Integer>();
		firstSet.add(-1);
		map.put(sum,firstSet );
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
			if(map.containsKey(sum)) {
				HashSet<Integer> set=map.get(sum);
				set.add(i);
				map.put(sum, set);
			}
			
			if(map.containsKey(sum-target)) {
				HashSet<Integer> set=map.get(sum-target);
				for(Integer startIndex:set) {
					HashSet<Integer> subarray=new HashSet<Integer>();
					subarray.add(startIndex+1); // start position
					subarray.add(i); // end position
					subArrayset.add(subarray);
				}
			}
			
			HashSet<Integer> set=new HashSet<Integer>();
			set.add(i);
			map.put(sum, set);
		}
		
		System.out.println(subArrayset);
	}
	
	/* Using Brut Force */
	public static void findSubArrayUsingBrutForce(int[] arr, int target) {
		int sum = 0;
		HashSet<HashSet<Integer>> set = new HashSet<HashSet<Integer>>();

		for (int i = 0; i < arr.length; i++) {

			sum = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == target) {
					HashSet<Integer> singleSet = new HashSet<Integer>();
					singleSet.add(i);
					set.add(singleSet);
					break;
				} else {
					sum += arr[j];
					// System.out.println(sum);
					if (sum == target) {
						// System.out.println(sum + " "+i+" " + j );
						HashSet<Integer> multiSet = new HashSet<Integer>();
						multiSet.add(i);
						multiSet.add(j);
						set.add(multiSet);
						break;
					}
				}

			}

		}
		
		System.out.println(set);

	}
}
