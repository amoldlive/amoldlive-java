package com.leetcode.easy;

public class ConvertToLowerCase {
	public static void main(String[] args) {

		String str = "LOVELY";
		System.out.println(toLowerCase(str));
		
		/*lower case*/
		char ch='C'+32;
		System.out.println(ch);
		
		/*upper case*/
		ch='c'-32;
		System.out.println(ch);

	}

	public static String toLowerCase(String s) {

		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < sb.length(); i++) {

			if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
				//sb.setCharAt(i, (char) (sb.charAt(i) -'A'+'a')); //A-65 a-97 = 32-diff of a-A
				sb.setCharAt(i, (char) (sb.charAt(i) +32));
			}

		}
		return sb.toString();
	}
}
