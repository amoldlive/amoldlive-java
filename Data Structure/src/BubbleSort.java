
public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr= {5,8,4,6,1,2};
		print(arr);
		int swap=0;
		
		int count=0;
		for (int i = 1; i <= (arr.length-1); i++) {
			for (int j = 0; j < (arr.length-i); j++) {
				
				if(arr[j]>arr[j+1]) {
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
					
				}
				
			}	
		}
		
		print(arr);
		System.out.println(count);
	}
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
