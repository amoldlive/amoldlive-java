package com.number;

public class Find_GCD_LCM {
	public static void main(String[] args) {
			
		findGcdAndLcm(24, 60);
		
		findGCD_Euclids_algoritham(24, 60);
	}
	
	private static void findGCD_Euclids_algoritham(int a, int b) {
			System.out.println("Euclids Algoritham Steps");
			int result=findGcd(a,b);
			System.out.println("GCD using Euclid's Algoritham : "+result);
	}

	private static int findGcd(int a, int b) {
		if(b==0) { 
			return a;
		}
		System.out.println(b+"   ,   "+(a%b));
		return findGcd(b, a%b);
		
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
