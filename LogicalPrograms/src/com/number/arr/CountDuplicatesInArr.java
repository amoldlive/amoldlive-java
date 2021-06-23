package com.number.arr;

import java.util.HashMap;

public class CountDuplicatesInArr {
	public static void main(String[] args) {
			
		int[] arr= {1,2,3,1,2,3,1,2,3,5,6,7,4,5,6};
		
		getFrequencyOfArrElements(arr).forEach((k,v)->System.out.println(k+"  : "+v));
	}
	
	public static HashMap<Integer, Integer> getFrequencyOfArrElements(int arr[]){
		
		int lengthOfArr=arr.length;
		int[] frequency=new int[lengthOfArr];
		int count=1;
		HashMap<Integer, Integer> hashmap=new HashMap<>();
		
		for (int i = 0; i < frequency.length; i++) {
			frequency[i]=-1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					frequency[j]=0;
				}
					
			}
			
			if(frequency[i]!=0) {
				frequency[i]=count;
			}
						
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(frequency[i]!=0) {
				//System.out.println(arr[i] +" .... "+ frequency[i]);
				hashmap.put(arr[i], frequency[i]);
			}
		}
		
		return hashmap;
	}
	
}
