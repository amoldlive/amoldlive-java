package com.leetcode.easy;

public class AddBinary {
	public static void main(String[] args) {
		// Input: a = "11", b = "1"
		// Output: "100"
		String a = "11";
		String b = "1";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		int i = a.length() - 1, j = b.length() - 1;
		int carry = 0, sum = 0;
		StringBuilder sb = new StringBuilder();

		while (i >= 0 || j >= 0) {
			//sum = carry;

			if (i >= 0)
				sum += a.charAt(i) - '0'; // to get actual number (otherwise will get ascii value)

			if (j >= 0)
				sum += b.charAt(j) - '0';

			sb.append((sum+carry) % 2);
			carry = sum / 2;

			i--;
			j--;
		}

		if (carry != 0)
			sb.append(carry);

		return sb.reverse().toString();
	}
}
