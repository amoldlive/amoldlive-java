package com.number;

public class HappyNumber {
		/*	3*3 + 2*2 = 13
			1*1 + 3*3 = 10
			1*1 + 0*0 = 1 */
	
	static int num1=13;
	static int num2=58;
	
	public static void main(String[] args) {
	
			//System.out.println("Calculation : "+ calculateSquareOfEachDigit(13));
		System.out.println("isHappy Number : "+isHappyNumber(num1));
		
		
	}
	static boolean isHappyNumber(int num) {
		int result=calculateSquareOfEachDigit(num);	
		
		while(result!=1 && result!=4) {
			result=calculateSquareOfEachDigit(result);	
		}
		
		if(result==1)
		return true;
		else 
		return false;
	}
	
	static int calculateSquareOfEachDigit(int num) {
		
		int sum=0;
		int rem=0;
		
		while(num!=0) {
			rem=num%10;
			sum=sum+rem*rem;		
			num=num/10;
		}
		return sum;
	}
	
}
