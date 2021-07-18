package com.string;

public class StringToInteger {
	public static void main(String[] args) {

		String s = "4";
		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			num += n;
			if (i < s.length() - 1)
				num = num * 10;
		}
		
		System.out.println(num);
	}
}
