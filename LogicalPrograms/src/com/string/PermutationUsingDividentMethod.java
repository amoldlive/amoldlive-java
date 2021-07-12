package com.string;

public class PermutationUsingDividentMethod {
	public static void main(String[] args) {
		String str = "ABC";
		printPermutation(str);
	}

	public static void printPermutation(String str) {
		// no of permutation = factorial ( lengthOfString)
		// find out factorisal
		int length = str.length();
		int f = factorial(length);

		for (int i = 0; i < f; i++) {
			int temp = i;
			StringBuilder sb = new StringBuilder(str);
			for (int div = length; div >= 1; div--) {

				int q = temp / div;
				int r = temp % div;
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				temp = q;
			}
			System.out.println();
		}

	}

	static int factorial(int val) {
		if (val == 0 || val == 1)
			return 1;
		return val * factorial(val - 1);
	}
}
