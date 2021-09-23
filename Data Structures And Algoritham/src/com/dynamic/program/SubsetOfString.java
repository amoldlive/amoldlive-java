package com.dynamic.program;

public class SubsetOfString {
	public static void main(String[] args) {
		
		String str="ABC";
		printSubsetOfString(str);
		// op >>	 A	| AB | ABC | B | BC | C 
		// AC is not the subset of string ABC as it is continuous char string.
	}
	public static void printSubsetOfString(String str) {
		String subSet="";
		for (int i = 0; i < str.length(); i++) {
			subSet="";
			for (int j = i; j < str.length(); j++) {
				subSet=str.substring(i,j+1);
				System.out.println(subSet);
			}
		}
	}
	
}
