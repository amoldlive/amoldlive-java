package com.dynamic.recursion;

public class Pallindrom {
	public static void main(String[] args) {
		String str1="kalank";
		String str2="racecar";
		String str3="abba";
		
		int l_index=0;
		
		System.out.println("KALANK : "+isPallindrom(str1,l_index,str1.length()-1));
		l_index=0;
		System.out.println("racecar : "+isPallindrom(str2,l_index,str2.length()-1));
		l_index=0;
		System.out.println("abba : "+isPallindrom(str3,l_index,str3.length()-1));
	}
	
	static boolean isPallindrom(String str,int l_index,int r_index) {
		if(l_index>=r_index)
			return true;
		
		if(str.charAt(l_index) != str.charAt(r_index))
			return false;
		
		return isPallindrom(str, l_index+1, r_index-1);
	}
	
	// a     b         b           a
	//l     (l+1)    (r-1)         r

	// a     b    	C         b           a
	//l     (l+!)   (L==R) 	(r-1)         r

}
