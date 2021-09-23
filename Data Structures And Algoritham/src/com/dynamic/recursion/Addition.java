package com.dynamic.recursion;

public class Addition {
	public static void main(String[] args) {
		System.out.println(" Addition : "+addition(4));
	}
	
	private static int addition(int num) {
		// TODO Auto-generated method stub

		if(num==0) {
			return 0;
		}
		
		if(num==1) {
			return 1;
		}
		
		return num + addition(num-1);
		
	}
}
