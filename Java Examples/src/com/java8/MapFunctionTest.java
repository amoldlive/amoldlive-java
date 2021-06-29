package com.java8;

import java.util.ArrayList;

public class MapFunctionTest {
	public static void main(String[] args) {

		/*Map function is use to perform some operations */
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		list1.add(i);
		list1.stream().map(i->i*2).forEach(i->System.out.print(i+" "));
	
		System.out.println();
		
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("amol");
		list2.add("dipalini");
		
		list2.stream().map(str->str.toUpperCase()).forEach(str->System.out.print(str+" "));
		
	}
	
	
}
