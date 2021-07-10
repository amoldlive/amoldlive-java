package com.codility;

public class E_Frog_Jump {
	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}
	 public static int solution(int X, int Y, int D) {
		 
		 int delta = Y - X;
	        if(delta == 0)
	            return 0;
	        
	        int steps = (delta % D == 0) ? delta / D : (delta / D) + 1 ;
	        
	        return steps;
	  }
}
