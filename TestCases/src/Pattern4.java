
public class Pattern4 {
	public static void main(String[] args) {
		
/*		
			0
		0	0	0
	0	0	0	0	0
0	0	0	0	0	0	0

*/
	
	printPattern(4);	
		
	}

	private static void printPattern(int num) {
		
		for (int j = 1; j <= num; j++) {
			for(int k=num;k>j;k--) {
				System.out.print(" ");
			}
			
			
			for(int k=0;k<j;k++) {
				System.out.print("0 ");
			}
			
			System.out.println();
		}
		
	}
}
