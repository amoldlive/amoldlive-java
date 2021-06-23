package com.ad.java;

import java.util.regex.Pattern;

public class RegexEx {
	public static void main(String[] args) {
		//String regex="[a-zA-Z][a-zA-Z0-9]+[.]gmail.com";
		String regex="[a-zA-Z][a-zA-Z0-9]+[@][a-zA-Z]+[[.][a-z]+]+";
		
		//String input="amoldlive123@gmail.com";
		String input="amoldlive123@hotmail.com";

		boolean result=Pattern.matches(regex, input);
		System.out.println("Result  : "+result);
				
		System.out.println(10.0f/0);
		
		try {}finally {}
	}
}
