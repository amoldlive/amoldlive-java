package com.arrays;

/*rotate array in forward or reverse direction*/
public class RotateArray {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		ArrayUtility.print(arr);
		int k = -9;
		rotateArray(arr, k);
		ArrayUtility.print(arr);
	}

	private static void rotateArray(char[] arr, int k) {
		int length = arr.length - 1;

		/* Handle Base Cases */
		/* if k > array.length */
		k = k % arr.length;
	
		/* if k = -ve */
		/* convert it into +ve | k=k+arr.length */
		if (k < 0)
			k = k + arr.length;
	
		/* Split Array into 2 parts [0 - length-k ] , [length-k - length] */
		int splitMid = length - k;
		/* reverse part-1 */
		reverseArray(arr, 0, splitMid);
		/* reverse part-2 */
		reverseArray(arr, splitMid + 1, length);
		/* reverse part-1+part2 */
		reverseArray(arr, 0, length);
	}

	private static void reverseArray(char[] arr, int i, int j) {

		while (i < j) {
			char temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;

			i++;
			j--;
		}

	}
}