
public class QuickSort {
	public static void main(String[] args) {
			
		int[] arr= {10,5,3,7,11,2,1,15,44,33};

		quickSort(arr, 0, (arr.length-1));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	private static void quickSort(int[] arr,int lo, int hi) {
		if(lo<hi) {
			int sortedIndex=partitioning(arr, lo, hi);
			quickSort(arr, lo, sortedIndex);
			quickSort(arr, sortedIndex+1, hi);
		}
		//System.out.println("Quick Sort Done");
	}
	
	private static int partitioning(int[] arr,int lo, int hi) {
		
		int pivot=arr[lo];
		int i=lo , j=hi;
		
		while(i<j) {
			while(arr[i]<=pivot && i<hi)
				i++;
			
			while(arr[j]>pivot)
			j--;
			
			if(i<j)
			swap(arr, i, j);
		}
		
		swap(arr, j, lo);
		//System.out.println(j);
			return j;
	}
	
	private static void swap(int[] arr , int i, int j) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
}

