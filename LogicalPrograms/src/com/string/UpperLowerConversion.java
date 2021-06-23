package com.string;

public class UpperLowerConversion {

	public static void main(String[] args) {
		String str = "gRaB";
		System.out.println(convert(str));
	}

	static String convert(String str) {
		String newStr = "";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i)))
				newStr = newStr + Character.toLowerCase(str.charAt(i));

			else if (Character.isLowerCase(str.charAt(i)))
				newStr = newStr + Character.toUpperCase(str.charAt(i));

		}

		return newStr;
	}

}
