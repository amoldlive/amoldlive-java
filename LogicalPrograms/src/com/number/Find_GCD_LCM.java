package com.number;

public class Find_GCD_LCM {
	public static void main(String[] args) {
			
		findGcdAndLcm(24, 60);
	}
	
	public static void findGcdAndLcm(int num1 , int num2) {
		
			System.out.println("Original Numbers : "+num1 +" , "+ num2);
			
			int onum1=num1;
			int onum2=num2;
			
			while(num1%num2!=0) {
				int rem=num1%num2;
				num1=num2;
				num2=rem;
			}
			int gcd=num2;
			System.out.println("GCD : "+gcd);
			
			int lcm= onum1*onum2/gcd;
			
			System.out.println("LCM : "+lcm);
	}
}
