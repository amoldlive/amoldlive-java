package com.pattern;

public class PrintZ {
	public static void main(String[] args) {
		printZ(5);
	}
	public static void printZ(int num) {
		
		for (int i = num; i >0; i--) {
			for (int j = 1; j <= num; j++) {
				if(i==1 || i==num)
				System.out.print("*");
				else {
					if(i==j)
					System.out.print("*");
					else
					System.out.print(" ");	
				}
					
			}
			System.out.println();
		}
		
		
	}
}
