package com.dynamic.recursion;

public class FebonacciSeriese {
	public static void main(String[] args) {
		printFebonnacci(9);
		System.out.println();
		printFebonnacciAsPerCount(10);
		System.out.println();
		
		System.out.println("Febonnacci : "+feb(8));
	}

	static void printFebonnacci(int num) {
		int low = 1, high = 1;
		int sum = 0;

		if (num == 0) {
			System.out.println("0");
			return;
		}

		if (num == 1) {
			System.out.println("1");
			return;
		}

		System.out.print(low + " " + high + " ");

		while (sum < num) {
			sum = low + high;
			if (sum < num)
				System.out.print(sum + " ");
			low = high;
			high = sum;
		}

	}

	static void printFebonnacciAsPerCount(int count) {
		int low = 1, high = 1;
		int sum = 0;

		if (count == 0) {
			System.out.println("0");
			return;
		}

		if (count == 1) {
			System.out.println("1");
			return;
		}

		System.out.print(low + " " + high + " ");
		
		int tempCount=0;
		
		while (tempCount!=(count-2)) {
			sum = low + high;
			System.out.print(sum + " ");
			low = high;
			high = sum;
			tempCount++;
		}

	}
	
	static int feb(int num)
	{
		if(num==1)return 0;
		if(num==2) return 1;
		
		return feb(num-1)+feb(num-2);
	}
}
