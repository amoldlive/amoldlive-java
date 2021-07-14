package com.hashmap.and.heap;

public class ArrayPairsDivisibleByK_BrutForce {
	public static void main(String[] args) {
		int[] arr= {56,22,34,12,78,11,98,69};
		int k=10;
		findPair(arr, k);
		
	}
	private static void findPair(int[] arr , int k) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if((arr[i]+arr[j])%k==0) {
					System.out.println(arr[i] +" "+arr[j]);
				}
				
			}
		}
	}
}
