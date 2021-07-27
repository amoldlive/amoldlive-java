package com.arrays.twod;

public class SearchElement {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int data = 7;
		String index = searchElement(arr, data);
		System.out.println(index);
	}

	private static String searchElement(int[][] arr, int data) {
		String ans = "Not Found";

		int row = 0;
		int column = arr.length - 1; // point to the last column first element

		while (row < arr.length && column > 0) {
			if (arr[row][column] == data) {
				ans = "data " + data + " found  at : [" + row + "][" + column + "]";
				break;
			} else if (arr[row][column] < data) {
				row++;
			} else {
				column--;
			}
		}
		return ans;
	}
}
