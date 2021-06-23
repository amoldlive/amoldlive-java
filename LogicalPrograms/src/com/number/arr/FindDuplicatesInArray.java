package com.number.arr;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {
	public static void main(String[] args) {
		
		findDuplicates(new int[] {1,4,3,2,1,3,2,6,6,7,7,7}).forEach(t->System.out.println("Duplicate id : "+t));
		
	}

	public static List<Integer> findDuplicates(int arr[]) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					list.add(arr[i]);
				}
			}
		}

		return list;
	}
}
