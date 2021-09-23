package com.codility;

import java.util.HashSet;
import java.util.Set;

public class F_PermutationMissingElement {
	public static void main(String[] args) {
			System.out.println(solution(new int[] {1,2,5,4}));
	}
	public static  int solution(int[] A) {
		int max = A.length + 1;

		// load array elements into array so would be quick to check if elements exist
		Set incompleteSet = new HashSet();
		for (int i = 0; i < A.length; i++) {
			incompleteSet.add(A[i]);
		}

		for (int i = 1; i < max + 1; i++) {
			if (!incompleteSet.contains(i)) {
				return (i);
			}
		}
		return 0;
	}

}
