package com.string;
public class Reverse2KthString {
	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, k));
		System.out.println(reverseStr("a", k));
		System.out.println(reverseStr(s, 3));

	}

	public static String reverseStr(String s, int k) {
		if (s.length() < k)
			return s;
		String ans = null;
		char[] arr = s.toCharArray();
		int charCount = k - 1;

		for (int i = 0; i < arr.length; i++) {
			if (i % k == 0 && i + charCount < s.length()) {
				reverseArr(i, i + charCount, arr);
				k = k + k;
			}
		}
		ans = String.valueOf(arr);
		return ans;
	}

	private static void reverseArr(int lo, int hi, char[] arr) {

		while (lo < hi) {
			char temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}

	}
}
