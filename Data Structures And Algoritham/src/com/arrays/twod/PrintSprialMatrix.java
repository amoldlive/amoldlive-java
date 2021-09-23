package com.arrays.twod;

public class PrintSprialMatrix {
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };

		// Function Call
		spiralPrint2(R, C, a);
	}

	private static void spiralPrint2(int r, int c, int[][] a) {
		int row = 0;
		int col = 0;
		int last_row = r - 1;
		int last_col = c - 1;
		int i = 0;
		while (col <= last_col && row <= last_row) {
			for (i = col; i <= last_col; i++)
				System.out.print(a[row][i] + " ");
			row++;

			for (i = row; i <= last_row; i++)
				System.out.print(a[i][last_col] + " ");
			last_col--;

			if (row <= last_row) {
				for (i = last_col; i >= col; i--)
					System.out.print(a[last_row][i] + " ");
				last_row--;
			}

			if (col <= last_col) {
				for (i = last_row; i >= row; i--)
					System.out.print(a[i][col] + " ");
				col++;
			}
		}
	}

	private static void spiralPrint(int r, int c, int[][] a) {
		int row = 0;
		int col = 0;
		int last_row = r - 1;
		int last_col = c - 1;
		int i = 0;
		System.out.println("inside[1]");

		while (col <= last_col && row <= last_row) {
			for (i = col; i <= last_col; i++)
				System.out.print(a[row][i] + " ");

			// shifting to 2nd row
			row++;

			for (i = row; i <= last_row; i++)
				System.out.print(a[i][last_col] + " ");

			// shifting to previous column
			last_col--;

			if (row <= last_row) {
				for (i = last_col; i >= col; i--)
					System.out.print(a[last_row][i] + " ");
				last_row--;
			}

			if (col <= last_col) {
				for (i = last_row; i >= row; i--)
					System.out.print(a[i][col] + " ");
				col++;
			}

		}
	}
}
