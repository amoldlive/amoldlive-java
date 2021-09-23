package com.dynamic.recursion;

public class ReverseString {
	public static void main(String[] args) {
		reverse("abcde");
	}
	static void reverse(String str) {
		
		if(str==null || str.equals(" "))
			System.out.println("Invalid String");
		
		int length=str.length();
		
		if(length==0)
			return;
		
		System.out.print(str.charAt(length-1));
		reverse(str.substring(0,length-1));
		
	}
}
