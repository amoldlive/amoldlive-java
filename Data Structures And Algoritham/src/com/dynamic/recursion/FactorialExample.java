package com.dynamic.recursion;

public class FactorialExample {
	public static void main(String[] args) {
		System.out.println("Factorial : " + factorial(5));
	}

	public static int factorial(int num) {
	
		if(num==0 || num==1) {
			//System.out.println("1");
			return 1;
		}
		
		return num * factorial(num-1);
		// System.out.println(num*factorial(num-1));
		 
	}

}
