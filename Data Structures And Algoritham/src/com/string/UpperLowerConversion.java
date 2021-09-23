package com.string;

public class UpperLowerConversion {

	public static void main(String[] args) {
		String str = "gRaB";
		System.out.println(convert(str) );
		
		System.out.println();
		
		
		str = "PEPCodinG";
		System.out.println("Original >> "+str);
		ConvertWithoutUsingInBuildFunction(str);
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

	private static void ConvertWithoutUsingInBuildFunction(String str) {
		StringBuilder sb=new StringBuilder(str);
		
		for (int i = 0; i <sb.length(); i++) {
				char ch=sb.charAt(i);
				if(ch>='a' && ch<='z') {
					//lower case character
					char upperCaseCh=(char) (ch - 'a' + 'A');
					sb.setCharAt(i, upperCaseCh);
					
				}else if (ch>='A' && ch<='Z') {
					//upper case character
					char lowerCaseCh= (char) (ch -'A' + 'a');
					sb.setCharAt(i, lowerCaseCh);
				}
				
		}
		System.out.println("Modified >> "+sb.toString());
	}
	
}
