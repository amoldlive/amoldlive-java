package com.ds;

public class ReverseString {
	public static void main(String[] args) {
		String str="AMOL DHAWALE";
		reverse1(str);
		reverse2(str);
		System.out.println();
		reverse3(str);
	}

	public static void reverse1(String str) {
		System.out.println(new StringBuffer(str).reverse());
	}

	public static void reverse2(String str) {
		
		for (int i = (str.length()-1); i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

	/*recurrsion*/
	public static void reverse3(String str) {
		int length=str.length();
		if(str.isEmpty()){
			return;
		}
		
		System.out.print(str.substring(length-1));
		reverse3(str.substring(0,length-1));
	}
}
