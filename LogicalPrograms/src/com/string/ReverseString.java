package com.string;

public class ReverseString {
	public static void main(String[] args) {
		String str = "AMOL DHAWALE";
		reverse1(str);
		reverse2(str);
		System.out.println();
		reverse3(str);
	}

	public static void reverse1(String str) {
		System.out.println(new StringBuffer(str).reverse());
	}

	public static void reverse2(String str) {

		for (int i = (str.length() - 1); i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

	/* recursie approach */
	public static void reverse3(String str) {
		int length = str.length();
		if (str.isEmpty()) {
			return;
		}

		System.out.print(str.substring(length - 1));
		reverse3(str.substring(0, length - 1));
	}

	/*iterative approach*/
	public static void reverse(String str) {

		if (null == str || str.isBlank()) {
			str = "";
		}

		int i = 0;
		int j = str.length() - 1;
		char[] ch = str.toCharArray();

		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}

		System.out.println(String.valueOf(ch));
	}
}
