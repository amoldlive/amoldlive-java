package com.leetcode.easy;

public class ReverseVowels {
	public static void main(String[] args) {

		System.out.println(reverseVowels("hello"));
		System.out.println(reverseVowels("leetcode"));
		System.out.println(reverseVowels(".,"));
		System.out.println(reverseVowels("!!!"));

	}

	public static String reverseVowels(String s) {
		char[] arr = s.toCharArray();
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			boolean iVal = isVowel(arr[i]);
			boolean jVal = isVowel(arr[j]);

			if (iVal && jVal) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			} else if (!iVal) {
				i++;
			} else if (!jVal) {
				j--;
			}

		}

		return String.valueOf(arr);
	}

	private static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;
		return false;
	}
}
