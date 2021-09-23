package com.number;

public class DisariumNumber {
	static int num=17;
	
	// 1+ 7*7 + 5*5*5
	
	public static void main(String[] args) {
		System.out.println("inside Main");
		System.out.println("Length : "+calculateLength(17));
		System.out.println("Sum : "+disariumNumber(num));
		
		if(num==disariumNumber(num))
			System.out.println("Number is valid");
		else
			System.out.println("Number is invalid");
	}
	
	public static int disariumNumber(int num) {
		
		int sum=0;
		int rem=0;
		int length=calculateLength(num);
		
		while(num!=0) {
			 rem=num%10;
			 sum=sum+ (int)Math.pow(rem, length);
			 num=num/10;
			 length--;
		}
		
		return sum;
	}
	
	public static int calculateLength(int num) {
		int count=0;
		int numPart=0;
		
		while(num!=0) {
			count++;
			numPart=num/10;
			num=numPart;
		}
		
		return count;
	}
}
