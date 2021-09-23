package com.arraylist;

import java.util.ArrayList;

public class RemoveOddNumbers {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16};
		ArrayList<Integer> list=new ArrayList<>();
		for(int data:arr)
			list.add(data);
		
		removeOddElements(list);
		
		
	}
	private static void removeOddElements(ArrayList<Integer> list) {
		System.out.println(list);
		
		/*below code will throw concurrent modification exception*/
		/*
		for(int data:list) {
			if(data%2==1) {
				list.remove(data);
			}
		}
		*/
		
		/*below code wil give wrong list due to data shuffling after remove process*/
		/*
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)%2==1) {
				list.remove(i);
			}
		}
		*/
		
		
		for (int i = list.size()-1; i >=0; i--) {
			if(list.get(i)%2==1) {
				list.remove(i);
			}
		}
		
		
		System.out.println(list);
	}
	
}
