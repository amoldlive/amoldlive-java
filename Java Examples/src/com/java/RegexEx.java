package com.java;

import java.util.regex.Pattern;

public class RegexEx {
	public static void main(String[] args) {
		//String regex="[a-zA-Z][a-zA-Z0-9]+[.]gmail.com";
		String regex="[a-zA-Z][a-zA-Z0-9]+[@][a-zA-Z]+[[.][a-z]+]+";
		
		//String input="amoldlive123@gmail.com";
		String input="amoldlive123@hotmail.com";

		boolean result=Pattern.matches(regex, input);
		System.out.println("Result  : "+result);
				
		System.out.println(10.0f/0); //OP - Infinity 
		
		try {}finally {}
		
		/*Validating Mobile NUmber*/
		mobileNumberRegex();
	}
	public static void mobileNumberRegex() {
		
		String number="+917276466779";
		String regex="[+][9][1][0-9]{10}";
		
		System.out.println(Pattern.matches(regex, number));
	}
}
