package com.java8;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		/* take String , return it length */
		Function<String, Integer> func = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};

		int len = func.apply("amol");
		System.out.println(len);

		System.out.println();

		Function<String, Integer> funcLambda=t-> t.length();
		len = func.apply("Dipalini");
		System.out.println(len);
		
		
	}
}
