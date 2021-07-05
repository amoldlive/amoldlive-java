package com.arrays;

public class DisplayArrayUsingRecurssion {
	public static void main(String[] args)  {
		int arr[]= {5,4,3,5,4,6};
		printArray(arr,0);
	}
	static void printArray(int[] arr,int index)  {
		if(index==arr.length) {
			return;
		}
		
		System.out.print(arr[index]+" "); //print in forward direction
		printArray(arr,index+1);
		//System.out.print(arr[index]+" ");//print in reverse direction
	}
}
