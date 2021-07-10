package com.codility;

import java.util.ArrayList;
import java.util.List;

public class A_BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(529));

	}

	public static int solution(int N) {
		String binaryString = Integer.toBinaryString(N);

		int longestBinaryGap = 0;
		List<Integer> onesList = new ArrayList<Integer>();

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '0')
				continue;
			onesList.add(Integer.valueOf(i));
		}

		for (int i = 0; i < onesList.size() - 1; i++) {
			// subtract 1 so that don't count 1's next to each other as having any gap
			int indicesDiff = onesList.get(i + 1) - onesList.get(i) - 1;

			longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
		}
		return longestBinaryGap;
	}
}
