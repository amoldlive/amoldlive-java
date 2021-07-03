package com.arrays;

public class BarChart {
	public static void main(String[] args) {

		int[] building = { 7, 5, 3, 8, 1, 2, 3 };
		printBarChart(building);

	}

	private static void printBarChart(int arr[]) {
		/* find Max */
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		for (int floor = max; floor > 0; floor--) {

			for (int i = 0; i < arr.length; i++) {
					if(arr[i] >= floor) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
				
			}
			System.out.println();
		}

	}

}
