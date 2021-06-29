package com.general;

public class SortingSearching {
	public static void main(String[] args) {
		int[] arr= {1,2,5,3,8,6};
		int data=6;
		linearSearch(arr, data);
		
		int[] arr2= {1,2,3,4,5,6,7,8};
		BinarySearch(arr2, 5);
		
		print(arr);
		BubbleSort(arr);
		print(arr);
		
		int[] arr3= {1,2,5,3,8,6};
		SelectionSort(arr3);
		print(arr3);

		int[] arr4= {1,255,5,3,83,63};
		int idx=getMax(arr4, 0);
		System.out.println("idx : "+idx);
	}

	public static int getMax(int[] arr,int index) {
		
		if(index==arr.length-1) {
			return index;
		}
		
		int idx=getMax(arr, index+1);
		if(arr[index]>arr[idx]) {
			return index;
		}else {
			return idx;
		}
	}
	
	
	public static void linearSearch(int[] arr,int data) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==data) {
				count++;
				System.out.println("Data found at location : "+ (i+1));
				break;
			}
		}
		
		if(count==0) {
			System.out.println("data not found");
		}
		
	}

	/*data should be in the sorted order*/
	public static void BinarySearch(int[] arr , int data) {
		int lo=0;
		int hi=arr.length-1;
		int mid=0;
		
		mid=(lo+hi)/2;
		while(lo<hi) {
			if(arr[mid]==data) {
				System.out.println("Data found at Location : "+(mid+1));
				break;
			}else if(arr[mid]>data) {
				hi=mid;
			}else if(arr[mid]<data) {
				lo=mid;
			}
			mid=(lo+hi)/2;
		}
	}

	public static void BubbleSort(int[] arr) {
		//int count=0;
		for (int i = 1; i <= arr.length-1; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			//count++;
		}
		
		//System.out.println("count : "+count);
		
	}
	
	
	public static void SelectionSort(int[] arr) {

		int min=0;
		for (int i = 0; i < arr.length; i++) {
			min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		/*
		 * declare first_min
		 * find min value from arr
		 * replace first_min with min
		 * */
	}
	
	public static void insertionSort() {
		
	}
	public static void mergeSort() {

	}	
	public static void quickSort() {

	}	
	public static void countSort() {

	}	
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
