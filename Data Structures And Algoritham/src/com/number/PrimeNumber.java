package com.number;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Is prime number : "+isPrimeNumber(31));
		
		System.out.println(primeNumber(30));
		
		
	}
	
	public static List<Integer> primeNumber(int num) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for (int i = 1; i <= num; i++) {
			if(isPrimeNumber(i)) {
				list.add(i);
			}
		}
		
		
		return list;
	}
	
	public static boolean isPrimeNumber(int num) {
		int i=1;
		int count=0;
		
		while(i<=num) {
			if(num%i==0) {
				count++;	
			}
					i++;
					
		}
		
		//System.out.println(count);
		
		if(count==2)
			return true;
		else
		 return false;
	}
	
}
