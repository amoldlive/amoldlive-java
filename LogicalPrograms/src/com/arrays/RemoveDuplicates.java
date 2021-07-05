package com.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,1,2,1,2,4,5,6,3};
		printArray(arr);
		int[] setArr=removeDuplicates(arr);
		printArray(setArr);
		
		sortArray(setArr);
		
		printArray(setArr);
	}

	public static int[] removeDuplicates(int arr[]) {
		
		
		int block[]=new int[arr.length];
		int count=0;
		
		for (int i = 0; i < block.length; i++) {
			block[i]=-1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && block[j]!=0) {
					block[j]=0;	
					count++;
					//System.out.println("blocking");
				}
			}
			
			//System.out.print(arr[i]+" ");
		}
		//System.out.println("count : "+count);	
		int newlength=arr.length-count;
		int newarr[]=new int[newlength];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(block[i]!=0) {
			newarr[j]=arr[i];
			j++;
			}
		}
		
				return newarr ;
		
	}
	
	public static void sortArray(int[] arr) {
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
				
			}
		}
		
	}
	
	public static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
