package com.number;

public class ReverseTheNumber {
	public static void main(String[] args) {
		
		int num=12345678;
		
		System.out.println(reverseNumber(num));
		
	}
	public static int reverseNumber(int num) {
		int rem=0;
		String str="";
		
		while(num!=0) {
		 rem=num%10;
		 str=str+rem;
		 num=num/10;
		}
		return Integer.parseInt(str);
	}
}
