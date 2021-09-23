package com.string;

import java.util.ArrayList;
import java.util.List;

public class DivideString {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";

		divideString(str, 4).forEach(i->System.out.println(i));;
	}

	static List<String> divideString(String str, int len) {
		String strPart = "";
		ArrayList<String> aList=new ArrayList<String>();
		
		while (!str.isEmpty()) {
			strPart = str.substring(0, len);
			//System.out.println(strPart);
			aList.add(strPart);
			str = str.substring(len, str.length());
		}

		return aList;
	}

}
