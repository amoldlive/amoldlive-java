package com.leetcode.easy;

public class AddTwoStrings {
	public static void main(String[] args) {
		System.out.println(addStrings("11", "123"));
		System.out.println(addStrings("456", "77"));
		System.out.println(addStrings("9", "1"));
		
		System.out.println(addStrings_Optimized("11", "123"));
		System.out.println(addStrings_Optimized("456", "77"));
		System.out.println(addStrings_Optimized("9", "1"));
	}

	public static String addStrings(String num1, String num2) {
		String ans = "";

		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int sum = 0;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			sum = carry;
			if (i >= 0) {
				sum += num1.charAt(i) - '0'; // charnum -'0' = num
				i--;
			}

			if (j >= 0) {
				sum += num2.charAt(j) - '0';
				j--;
			}

			ans = (sum % 10) + ans;
			carry = sum / 10;

		}
		if (carry != 0) {
			ans = carry + ans;
		}
		return ans;
	}

	public static String addStrings_Optimized(String num1, String num2) {
		StringBuilder sb = new StringBuilder();

		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int sum = 0;
		int carry = 0;

		while (i >= 0 || j >= 0) {
			int n1 = i >= 0 ?  num1.charAt(i) - '0' : 0;
			int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
			sum = n1 + n2 + carry;
			sb.append(sum % 10);
			carry = sum / 10;
			
			i--;
			j--;
		}
		if (carry != 0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}
}
