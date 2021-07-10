package com.codility;

import java.util.HashSet;

public class H_PermutationCheck {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,4}));
		System.out.println(solution(new int[] {1,3,2}));
	}
	public static int solution(int[] a) {
		HashSet<Integer> set=new HashSet<Integer>();
		
		for (int i = 1; i <= a.length; i++) {
			set.add(i);
		}
		
		for (int i = 0; i < a.length; i++) {
			set.remove(a[i]);
		}
	
		return set.isEmpty()?1:0;
	}
}
