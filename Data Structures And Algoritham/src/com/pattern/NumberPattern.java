package com.pattern;

public class NumberPattern {

	
	public static void main(String[] args) {
		
		int size=5;
				
	//	printNumberPattern(size);
		
	 /*	5 4 3 2 * 
		5 4 3 * 1 
		5 4 * 2 1 
		5 * 3 2 1 
		* 4 3 2 1  */
		
		
		//printNumberPattern2(6);
	/*	
		1
		2*3
		4*5*6
		7*8*9*10
		7*8*9*10
		4*5*6
		2*3
		1
	*/	
	
		//printPrimeryNumbers(8);
	/*	
		 1 
		 222 
		33333 
		 222 
		  1  
	*/	
		
		printNumberPattern3(5);
	}
	
	static void printNumberPattern3(int n) {
		
				
		for (int i = 1; i <=n; i++) {
			
	
			
		}
		
	}
	
	static void printPrimeryNumbers(int n) {
		
		for (int i = 1; i <= n; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
		
				
	}
	
	public static boolean isPrimeNumber(int num) {
		int count=0;
		int i=1;
		
		if(num==1) return true;
		
		while(i<=num) {
		     if(num%i==0) {
		    	 count++;
		     }
		     i++;
		}
		
		if(count==2)
			return true ;
		else
			return false;
		
	}
	
	static void printNumberPattern2(int n) {
		int k=1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print(k);
				
				if(j<i) {
				System.out.print("*");
				k++;
				}
			}
			System.out.println();
			k++;
		}
		
		//k==11
		for (int i = n; i > 0; i--) {
			k=k-i;
			for (int j = 0; j < i; j++) {
				System.out.print(k);
				
				if(j<i-1)
				System.out.print("*");
				
				if(j<i) 
					k++;
				
				
			}
			System.out.println();
			k=k-i;
			//k--;
		}
		
	}
	
	static void printNumberPattern(int size) {
		
	int count=1;	
	int m;
	
		for (int j = size; j >= 1; j--) {
	
			for (int i = size; i >= 1; i--) {
			
				if(i==count) {
					System.out.print("*"+" ");
				}else {
					m=i;
					System.out.print(m+" ");
				}
				 
				
				
				
			}
			count++;
			System.out.println();
		}	
	}
}

