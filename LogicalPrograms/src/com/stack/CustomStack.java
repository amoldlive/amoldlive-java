package com.stack;
/*Dynamic Growable Array*/
class Stack {

	int length = 0;
	int[] arr;
	int top = -1;

	public Stack(int inLength) {
		this.length = inLength;
		arr = new int[length];
	}

	public void push(int data) {

		if (top == length - 1) {
			// System.out.println("Stack OVerflow");
			
			/*start : Growable Array*/
			int[] newArr=new int[2*length];
			for (int i = 0; i < arr.length; i++) {
				newArr[i]=arr[i];
			}
			arr=newArr;

			top++;
			arr[top] = data;

			/*End  : Growable Array*/
			
		} else {
			top++;
			arr[top] = data;
		}

	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		} else {
			arr[top] = 0;
			top--;
		}
	}

	public int peek() {
		return arr[top];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i <= top; i++)
			sb.append(arr[i] + "  ");

		sb.append("]");

		return sb.toString();
	}

}

public class CustomStack {
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(1);
		System.out.println(stack);
		System.out.println(" PEEK : " + stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
		
	}
}
