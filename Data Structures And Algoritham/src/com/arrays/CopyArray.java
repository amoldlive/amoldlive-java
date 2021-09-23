package com.arrays;

public class CopyArray {
	public static void main(String[] args) {
		
		int arr[]= {2,4,7,9,1};
		int clone[]=copArray(arr);
		
		for (int i = 0; i < clone.length; i++) {
			System.out.print(clone[i] +" ");
		}
		
	}
	

	static int[] copArray(int[] arr) {
	
		int length=arr.length;
		int[] clone=new int[length];
		
		for (int i = 0; i < clone.length; i++) {
			clone[i]=arr[i];
		}
		
		return clone;
	}
	
}
