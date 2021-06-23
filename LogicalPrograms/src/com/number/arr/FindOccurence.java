package com.number.arr;

public class FindOccurence {
	public static void main(String[] args) {
		int arr[]= {2,3,1,4,5,6,5,2,7,6};	
		
		DisplayArrayUsingRecurssion.printArray(arr, 0);
		System.out.println();
		
		System.out.println("first index : "+ findFirstIndex(arr, 0, 5));
		System.out.println("first index : "+ findFirstIndex(arr, 0, 2));
		
	}
	public static int findFirstIndex(int arr[],int index,int data) {
		
		if(index==arr.length) {
			return index;
		}
		
		int firstIndex=findFirstIndex(arr, index+1, data);
		if(arr[index]==data) {
			return index;
		}else {
			return firstIndex;
		}
	}
	public static int findSecondIndex(int arr[],int index,int data) {
		return 0;	
	}
	public static int findLastIndex(int arr[],int index,int data) {
		return 0;
	}
}
