package com.ds;

public class CountSort {
	public static void main(String[] args) {

		int arr[]= {3,4,5,3,4,3,6,8,7,9,7,8};
		countSort(arr, 3, 9);
		
		Sortinng.print(arr, "Sorted Array Using count sort : ");
	}
	public static void countSort(int arr[] , int min , int max) {
		int range=max-min+1;
		// 8-3 +1 == 6   there are 6 elements can be present between 3 -8
		int[] freqArr=new int[range];
		int[] sortedArr=new int[arr.length];
		
		/*add frequency*/
		for (int i = 0; i < arr.length; i++) {
			 int idx=arr[i]-min;
			 freqArr[idx]++;
		}

		/*finding locations fo the element*/
		for (int i = 1; i < freqArr.length; i++) {
			freqArr[i]=freqArr[i]+freqArr[i-1];
		}
		
		/*adding element as per new position*/
		for (int i = arr.length-1; i >=0 ; i--) {
			int val=arr[i];
			int pos=freqArr[val-min];
			int idx=pos-1;
			sortedArr[idx]=val;
			freqArr[val-min]--;
		}
		
		/*replacing arr elements with sorted element*/
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sortedArr[i];
		}
		
	}
	
}
