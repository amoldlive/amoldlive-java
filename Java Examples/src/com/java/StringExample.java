package com.java;

public class StringExample {
	
	public static void main(String[] args) {
		String s1=new String("you can not change me"); //created in heap
		String s2=new String("you can not change me"); //created in heap
		
		
		String s3="you can not change me"; //created in SCP
		String s4="you can not change me"; //refence to existing obj s3
		
		System.out.println(s1==s3); //false
		
		String s5="you can not"+" change me";
		System.out.println(s3==s5); //true
		
		String s6="you can not";
		String s7=s6+" change me";
		
		System.out.println(s7==s3); //false
		
		final String s8="you can not";
		String s9=s8+" change me";
		
		System.out.println(s9==s3); //true0
		
	}
	
}
