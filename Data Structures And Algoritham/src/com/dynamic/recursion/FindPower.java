package com.dynamic.recursion;

public class FindPower {
		public static void main(String[] args) {
			System.out.println("power : "+power(3, 5));
		}
		
		static int power(int num , int m) {
			if(m==0)
				return 1;
			if(m==1)
				return num;
			
			return power(num, (m-1)) * num;
			
		}
}