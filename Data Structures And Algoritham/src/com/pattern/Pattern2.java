package com.pattern;

public class Pattern2 {
	public static void main(String[] args) {
		int num=6;
		
		for (int i = 0; i <num; i++) {
			for(int j=num-1;j>i;j--) {
				System.out.print(" ");
			}	
			
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}	
			
			System.out.println();
		}
		
		//int temp=num;
		for (int i = 0; i<num; i++) {
						
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			
			for(int j=i;j<num-1;j++) {
				System.out.print(" *");
			}	
				
			
			System.out.println();
		}
		
	}
}
