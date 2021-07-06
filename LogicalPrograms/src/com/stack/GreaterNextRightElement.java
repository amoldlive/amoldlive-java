package com.stack;

import java.util.Iterator;
import java.util.Stack;

import com.arrays.ArrayUtility;

public class GreaterNextRightElement {
	public static void main(String[] args) {
		int[] arr= {2,5,9,3,1,12,6,8,7};
		ArrayUtility.print(arr);
		arr=getNextRightGreaterElement(arr);
		ArrayUtility.print(arr);
	}
	/*Time complexity - O(n)*/
	private static int[] getNextRightGreaterElement(int arr[]) {
		int lastElement=arr[arr.length-1];
		
		Stack<Integer> stack=new Stack<>();
		stack.push(lastElement);

		int[] result=new int[arr.length];
		result[arr.length-1]=-1;
		
		for (int i = (arr.length-2); i>=0; i--) {
			
			//POP
			while(stack.size()>0 && arr[i] > stack.peek()) {
				stack.pop();
			}
			
			//RESULT
			if(stack.size()==0) {
				result[i]=-1;
			}else {
				result[i]=stack.peek();
			}
					
			//PUSH
			stack.push(arr[i]);
		}
		
		return result;
	}
}
