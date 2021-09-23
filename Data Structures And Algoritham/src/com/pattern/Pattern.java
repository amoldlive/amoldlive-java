package com.pattern;

public class Pattern {
	public static void main(String[] args) {

		int num = 5;
		printPattern_1(num);
		printPattern_2(num);
		System.out.println();
		printPattern_3(num);
		System.out.println();
		printPattern_4(num);
	}

	private static void printPattern_4(int num) {
		for (int i = 1; i <= num; i++) {
			
			for (int k = 0; k <i-1; k++) {
				System.out.print("  ");
			}
			for (int j = i; j <=num; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	private static void printPattern_3(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = i; j <=num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void printPattern_2(int num) {
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = num; j>i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}

	private static void printPattern_1(int num) {
		for (int i = 1; i <= num; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
