
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 7, 4, 6, 5, 9, 0 };
		// print(arr,"Original");
		quickSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void quickSort(int[] arr) {
		quickSortHelper(arr, 0, arr.length-1);
	}
	private static void quickSortHelper(int[] arr,int lo ,int hi) {
			if(lo<hi) {
				int i=partitioning(arr, lo, hi);
				quickSortHelper(arr, lo, i);
				quickSortHelper(arr, i+1, hi);
		
			}
	}

	private static int partitioning(int[] arr,int lo ,int hi) {
		int i = lo;
		int j = hi;
		int pivot = arr[lo];
		
		while (i < j) {
			while (arr[i] <= pivot)
				i++;

			while (arr[j] > pivot)
				j--;

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[lo];
		arr[lo] = arr[j];
		arr[j] = temp;
		
		return j;
	}
}
