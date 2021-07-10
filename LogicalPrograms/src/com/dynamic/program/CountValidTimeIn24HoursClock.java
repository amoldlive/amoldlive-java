package com.dynamic.program;

import java.util.HashSet;

public class CountValidTimeIn24HoursClock {

	public static void main(String[] args) {
		/*Calculate number of valid times  generated using 4 input numbers in the clock of 24 hours*/
		
		/*Bruit Force*/
		System.out.println(solution(1, 8, 3, 2));
		System.out.println(solution(6, 2, 4, 7));
		System.out.println(solution(2, 3, 3, 2));

		//#My-Solution
		System.out.println(solution2(1, 8, 3, 2));
		System.out.println(solution2(6, 2, 4, 7));
		System.out.println(solution2(2, 3, 3, 2));
		
	
		
	}

	public static int solution2(int A, int B, int C, int D) {
		int count = 0;
		String newStr = "";
		String str = String.valueOf(A) + String.valueOf(B) + String.valueOf(C) + String.valueOf(D);

		HashSet<String> set = new HashSet<>();
		HashSet<String> set2 = permute(str, newStr, set);
		
		for (String data : set2) {
			if (Integer.valueOf(data) < 2359) {

				String strdata = String.valueOf(data);
				String lpart = strdata.substring(0, 2);
				String rpart = strdata.substring(2);

				if (Integer.valueOf(lpart) <= 23 && Integer.valueOf(rpart) <= 59) {
					count++;
				}
			}
		}

		return count;
	}

	public static HashSet<String> permute(String str, String newStr, HashSet<String> set) {

		if (str.length() == 0) {
			set.add(newStr);
			return set;
		}

		for (int i = 0; i < str.length(); i++) {
			char selectChar = str.charAt(i);
			String lpart = str.substring(0, i);
			String rpart = str.substring(i + 1);
			String newPart = lpart + rpart;
			permute(newPart, newStr + selectChar, set);

		}
		return set;
	}

	public static int solution(int A, int B, int C, int D) {

		int[] availableNumbers = new int[] { A, B, C, D };
		int numLength = availableNumbers.length;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < numLength; ++i) {
			for (int j = 0; j < numLength; ++j) {
				if (j != i) {
					for (int k = 0; k < numLength; ++k) {

						if (k != i && k != j) {

							int l = 6 - i - j - k;

							int hours = 10 * availableNumbers[i] + availableNumbers[j];
							int Minutes = 10 * availableNumbers[k] + availableNumbers[l];

							if (hours < 24 && Minutes < 60 && !set.contains(hours * 100 + Minutes)) {
								set.add(hours * 100 + Minutes);
							}
						}

					}
				}

			}
		}

		return set.size();
	}
}
