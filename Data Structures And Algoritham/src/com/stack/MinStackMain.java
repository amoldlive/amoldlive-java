package com.stack;

class MinStack {

	private int[] data;
	private int[] minData; // store min values

	int init = 0;
	int top = -1;
	int minTop = -1;

	public MinStack(int size) {
		data = new int[size];
		minData = new int[size];
	}

	public void push(int val) {
		data[++top] = val;

		if (minData[init] == 0) {
			System.out.println("yes");
			minData[++minTop] = val;
		} else {
			if (minData[minTop] > val) {
				minData[++minTop] = val;
			}
		}

	}

	public int size() {
		return data.length;
	}

	public int pop() {
		int val = data[top];
		top--;

		if (minData[minTop] == val) {
			minTop--;
		}

		return val;
	}

	public int peek() {
		return data[top];
	}

	public int min() {
		return minData[minTop];
	}

	
	public void display() {

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}

public class MinStackMain {
	public static void main(String[] args) {

		MinStack minStack = new MinStack(10);
		minStack.push(19);
		minStack.push(1);
		minStack.push(5);
		minStack.push(10);
		minStack.push(13);
		minStack.push(2);
		minStack.push(18);
		minStack.push(22);
		minStack.push(43);
		minStack.push(8);

		minStack.display();
		System.out.println(minStack.peek());
		System.out.println(minStack.min());
	}
}
