
public class SelectionSort {
	public static void main(String[] args) {
		
		int[] arr= {5,4,3,2,1};
		
		int min=0;
		int selected=0;
		for (int i = 0; i < arr.length; i++) {
			min=i;
			selected=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}	
			}
			
			int temp=arr[min];
			arr[min]=arr[selected];
			arr[selected]=temp;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
