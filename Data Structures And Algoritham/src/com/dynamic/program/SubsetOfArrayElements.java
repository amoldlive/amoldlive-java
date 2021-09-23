package com.dynamic.program;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArrayElements {

	public static void main(String[] args) {

		char[] arr = { 'A', 'B', 'C' };
		// printSubsetUsingBinary(arr);

		String str = "123";
		String curr = "";
		int index = 0;
		// printSubsetUsingRecursion(str, index, curr);
		// findBinaryNumber(6);

		// char cur=' ';
		// printSubsetUsingRecursionForArray(arr, index, curr);

		ArrayList<Character> subset = new ArrayList<Character>();
		ArrayList<ArrayList<Character>> result = new ArrayList<ArrayList<Character>>();

		printSubsetUsingbacktracking(arr, index, subset, result);

		System.out.println(result);
	}

	private static void printSubsetUsingbacktracking(char[] arr, int index, ArrayList<Character> subset,
			ArrayList<ArrayList<Character>> result) {

		result.add(new ArrayList<>(subset));

		for (int i = index; i < arr.length; i++) {
			subset.add(arr[i]);
			printSubsetUsingbacktracking(arr, i + 1, subset, result);
			subset.remove(subset.size() - 1);
		}

		// System.out.println(result);
	}

	static void printSubsetUsingBinary(char[] arr) {

		int noOfSubset = (int) Math.pow(2, arr.length);
		int rem = 0;
		int temp = 0;
		String subset = "";

		for (int i = 0; i < noOfSubset; i++) {
			// convert i into binary and use 0's & 1's
			temp = i;
			subset = "";
			for (int j = arr.length - 1; j >= 0; j--) {

				rem = temp % 2;
				temp = temp / 2; // for i=1 >> 001 >> _ _ C

				if (rem == 0) {
					subset = "_ " + subset;
				} else {
					subset = arr[j] + " " + subset;
				}
			}
			System.out.println(subset);
		}

	}

	static void printSubsetUsingRecursion(String str, int index, String curr) {

		int strLen = str.length();

		if (index == strLen) {
			System.out.println(curr);
			return;
		}

		printSubsetUsingRecursion(str, index + 1, curr + str.charAt(index) + " ");
		printSubsetUsingRecursion(str, index + 1, curr);

	}

	static void printSubsetUsingRecursionForArray(char[] ch, int index, String curr) {

		int charLen = ch.length;

		if (index == charLen) {
			System.out.println(curr);
			return;
		}

		printSubsetUsingRecursionForArray(ch, index + 1, curr + ch[index]);
		printSubsetUsingRecursionForArray(ch, index + 1, curr);

	}

	static void findBinaryNumber(int num) {

		// num=10;
		int rem;
		String binary = "";
		while (num > 0) {
			rem = num % 2;
			binary = rem + binary;
			// System.out.print(rem);
			num = num / 2;
		}
		System.out.println("Binary : " + binary);
	}

}
