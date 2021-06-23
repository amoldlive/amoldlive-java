package com.number.arr;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {
	public static void main(String[] args) {
		
		
		int[] arr=sort(new int[] {1,7,3,5,2,6});
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] sort(int[] arr) {
		int count=0;
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				count++;
				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		
		System.out.println("Count : "+count);
		
		return arr;
	}
}
