package com.ds;

public class SortingTest {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 7, 6, 4, 5, 1 };

		printArray(arr, 0);

	
		quickSort(arr, 0, arr.length-1);
		printArray(arr, 0);
		
		int[] arr1 = { 1,2,3,4,5 };
		int[] arr2 = {6,7,8,9,10,11};
		
		int[] arr3=mergetwoSortedArray(arr1, arr2);
		
		printArray(arr3, 0);

		int arrIn[]= {4,6,3,2,9,1};
		int[] arr4=mergeSort(arrIn, 0, arrIn.length-1);
		printArray(arr4, 0);
	}
	
	static int[] mergeSort(int[] arr , int lo,int hi) {
		
		if(lo==hi) {
			int a[]=new int[1];
			a[0]=arr[lo];
			return a;
		}
		
		int partIndex=(lo+hi)/2;
		int arr1[]=mergeSort(arr, lo, partIndex);
		int arr2[]=mergeSort(arr, partIndex+1, hi);
		int arr3[]=mergetwoSortedArray(arr1, arr2);
		return arr3;		
	}
	static int[] mergetwoSortedArray(int[] arr1,int arr2[]) {
		
		int[] arr3=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				k++;
				i++;
			}else {
				arr3[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		
		while(i<arr1.length)
		{
			arr3[k]=arr1[i];
			k++;
			i++;
		}
		
		while(j<arr2.length)
		{
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		return arr3;
	}

	public static void quickSort(int[] arr, int lo, int hi) {

		if (lo < hi) {
			int partindex = partitioning(arr, lo, hi);
			quickSort(arr, lo, partindex);
			quickSort(arr, partindex+1, hi);
		}
	}

	public static int partitioning(int[] arr, int lo, int hi) {

		int pivot = arr[lo];
		int i = lo, j = hi;

		while (i < j) {
			while (arr[i] <= pivot)
				i++;
			while (arr[j] > pivot)
				j--;

			if (i < j)
				swap(arr, i, j);
		}

		swap(arr, lo, j);
		return j;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = 0;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void printArray(int[] arr, int index) {

		if (arr.length == index) {
			System.out.println();
			return;
		}
		System.out.print(arr[index] + " ");

		printArray(arr, index + 1);
	}

}
