package com.arrays.search;

public class LinearSearch {
	public static void main(String[] args) {
		
		int arr[]= {2,6,4,7,9,12,22};
		int element=4;
		searchElement(arr, element);
		
	}
	
	/*
	 * In linear search, best-case complexity is O(1) where the element is found at
	 * the first index. Worst-case complexity is O(n) where the element is found at
	 * the last index or element is not present in the array. 
	 */
	public static void searchElement(int arr[],int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("Element : "+element +" | Position : " + (i+1));
			}
		}
	}
}

