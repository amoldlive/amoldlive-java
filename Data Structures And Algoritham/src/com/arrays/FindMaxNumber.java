package com.arrays;

public class FindMaxNumber {
	public static void main(String[] args) {
		//System.out.println(getMaximumNumber(new int[] {8,6,7,9,3}));
		System.out.println(getMaximumNumber(new int[] {8,6,7,9,3,15},0));
	}

	static int getMaximumNumber(int[] arr) {
		int max = arr[0]; // oth position element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int getMaximumNumber(int[] arr,int index) {
		
		if(index==arr.length-1) {
			return arr[index];
		}
		
		int maxofArray=	getMaximumNumber(arr,index+1);
		if(arr[index]>maxofArray) {
			return arr[index];
		}else {
			return maxofArray;
		}

	}
	
	
}
