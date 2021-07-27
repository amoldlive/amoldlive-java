package com.string;

public class ReverseAlphabetsOnlyFromString {
	public static void main(String[] args) {
		String str = "abc@def!gh";
		int count = countAlphabets(str);
		System.out.println(count);
		System.out.println(reverseAlphabets(str));
	}

	private static int countAlphabets(String str) {
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				ans++;
		}

		return ans;

	}

	// i->a b c @ d e f ! g h<-j
	private static String reverseAlphabets(String str) {
		int i = 0;
		int j = str.length() - 1;
		StringBuilder sb = new StringBuilder(str);

		while (i < j) {

			boolean first = isAlphabet(sb.charAt(i));

			boolean last = isAlphabet(sb.charAt(j));

			if (first && last) {
				char temp = sb.charAt(i);
				sb.setCharAt(i, sb.charAt(j));
				sb.setCharAt(j, temp);
				i++;
				j--;
			}

			if (!first) {
				i++;
			}

			if (!last) {
				j--;
			}

		}
		// System.out.println(sb.toString());
		return sb.toString();
	}

	private static boolean isAlphabet(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return true;

		return false;
	}
	// abc@def!gh
	// hgf@
}
