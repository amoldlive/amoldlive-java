package com.hashmap.and.heap;

/*Find maximum consecutive 1's after flipping 0's 
 * NUmber of 0's can be flipped at most K th time
 * */
public class MaximumConsecutiveOnes {
	public static void main(String[] args) {
		String str = "1101001101011";
		int k = 2;
		int len = countMaxConsecutiveOnes(str, k);
		System.out.println("Length : " + len);
	}

	private static int countMaxConsecutiveOnes(String str, int k) {
		int ans = 0;
		int count = 0;
		int j = -1;
		for (int i = 0; i < str.length(); i++) {
			// aquire element
			if (str.charAt(i) == '0') {
				count++;
			}

			//release element
			while (count > k) {
				j++;
				if (str.charAt(j) == '0')
					count--;
			}

			int length = i - j;
			if (ans < length) {
				ans = length;
			}
		}

		return ans;
	}

}
