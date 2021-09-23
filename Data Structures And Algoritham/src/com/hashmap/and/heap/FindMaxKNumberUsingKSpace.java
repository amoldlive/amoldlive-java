package com.hashmap.and.heap;

import java.util.PriorityQueue;

public class FindMaxKNumberUsingKSpace {
	public static void main(String[] args) {

		int[] arr = { 2, 10, 5, 17, 4, 3, 18, 0, 19 };
		int k = 3;
		findMaxKNumbers(arr, k);
	}

	/*prority queue provides priority to small values by default*/
	private static void findMaxKNumbers(int[] arr, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < arr.length; i++) {
			/* inserting K elements */
			if (i < k) {
				queue.add(arr[i]);
				continue;
			}
			
			if (queue.peek() < arr[i]) {
				queue.remove();
				queue.add(arr[i]);
			}

		}

		System.out.println(queue);
	}

}
