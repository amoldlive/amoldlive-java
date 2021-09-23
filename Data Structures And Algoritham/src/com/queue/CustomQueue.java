package com.queue;

class Queue {

	private int[] queue;
	private int size = 0;
	private int front = 0;

	public Queue(int length) {
		queue = new int[length];
	}

	/* Add */
	public void enqueue(int data) {
		if (queue.length == size) {
			System.out.println("Queue Overflow");
		} else {
			int rear = (front + size) % queue.length;
			queue[rear] = data;
			size++;
		}
	}

	/* Remove */
	public int dequeue() {
		if (size == 0) {
			System.out.println("Queue Underflow");
			return -1;
		} else {
			int val = queue[front];
			front = (front + 1) % queue.length;
			size--;
			return val;
		}
	}

	/* Peek */
	public int peek() {
		if (size == 0) {
			System.out.println("Queue Underflow");
			return -1;
		} else {
			return queue[front];
		}
	}

	/* Size */
	public int size() {
		if (size == 0) {
			System.out.println("Queue Underflow");
			return -1;
		} else {
			return size;
		}
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % queue.length;
			str += queue[idx] + " ";
		}

		return str;
	}
}

public class CustomQueue {
	public static void main(String[] args) {
		Queue queue = new Queue(3);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(60);
		queue.enqueue(70);

		System.out.println(queue.size());
		System.out.println(queue);
		System.out.println(queue.peek());
	}
}
