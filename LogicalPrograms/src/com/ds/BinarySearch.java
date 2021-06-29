package com.ds;
import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr= {1,3,2,4,7,6};
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int search=4;
		int location=0;
		int mid=0 , low=0,high=arr.length-1;
		
		mid=low+(high-low)/2;
		
		System.out.println("\n mid >> "+mid);
		
		while(low<=high) {
			if(arr[mid]>search) {
				high=mid-1;
			}else if(arr[mid]<search) {
				low=mid+1;
			}else {
				System.out.println("Found at location : "+ mid);
				break;
			}
			
			mid=low+(high-low)/2;
		
		}
		
	}
}
