package com.string;

public class PermutationUsingRecurssion {
	public static void main(String[] args) {
		
		String str="ABC";
		String newStr="";
		permute(str, newStr);
		
	}
	static void permute(String str,String newStr) {
	
		if(str.length()==0) {
			System.out.println(newStr);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char selectChar=str.charAt(i);
			
			String lPart=str.substring(0,i);
			String rPart=str.substring(i+1);
			String ros=lPart+rPart;
			permute(ros , newStr+selectChar);
		}
		
	}
}
