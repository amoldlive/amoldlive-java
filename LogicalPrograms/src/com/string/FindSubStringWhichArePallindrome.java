package com.string;

public class FindSubStringWhichArePallindrome {

	public static void main(String[] args) {

		String input = "abaabaaab";
		printPallindromicSubString(input);

	}

	public static void printPallindromicSubString(String input) {

		int i = 0;
		int j = 1;

		while (i < j && j < input.length()) {

			String str = input.substring(i, j + 1);
			boolean result = isPallindrome(str);

			if (result) {
				System.out.println(str);
				i = j;
				j++;
			} else {
				j++;
			}

		}
	}

	public static boolean isPallindrome(String str) {
		boolean ans = true;
		int i = 0;
		int j = str.length() - 1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				ans = false;
				break;

			}

			i++;
			j--;
		}

		return ans;
	}
}
