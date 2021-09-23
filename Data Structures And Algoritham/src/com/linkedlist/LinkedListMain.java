package com.linkedlist;

import java.util.Stack;

class Node {

	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
		next = null;
	}
}

class SinglyLinkedList {
	Node head;

	public void add(int data) {
		Node node = new Node(data);
		if (head == null) {
			// Node node=new Node(data);
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = node;
		}
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(" NULL ");
		System.out.println();
	}

	public void reverse() {
		Node current = head;
		Node prev = null;
		Node fwd = null;

		while (current != null) {
			fwd = current.next;
			current.next = prev;
			prev = current;
			current = fwd;
		}
		head = prev;
		// return node;
	}
}

class CustomLinkedList {

	Node head;

	public void add(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {

			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void remove(int data) {
		Node temp = head;

		if (temp.data == data) {
			head = temp.next;
			return;
		}

		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			}
			if (temp.next != null)
				temp = temp.next;
		}
	}

	public void removeFromEnd() {
		Node temp = head;

		if (temp.next == null) {
			head = null;
			return;
		}

		while (temp.next != null) {
			if (temp.next.next == null) {
				temp.next = null;
			}
			if (temp.next != null)
				temp = temp.next;
		}
	}

	public void printList() {

		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " \n");
	}

	public int findMin() {

		Node temp = head;
		int min = 0;

		if (temp.next == null) {
			min = temp.data;
			return min;
		} else {
			min = temp.data;
		}

		while (temp.next != null) {

			if (min > temp.data) {
				min = temp.data;
			}

			temp = temp.next;
		}

		return min;
	}

	public int findMax() {

		Node temp = head;
		int max = 0;

		if (temp.next == null) {
			max = temp.data;
			return max;
		} else {
			max = temp.data;
		}

		while (temp.next != null) {

			if (max < temp.data) {
				max = temp.data;
			}

			temp = temp.next;
		}

		return max;
	}

	public void printReverse() {
		Node temp = head;
		printReverse(temp);
	}

	private void printReverse(Node node) {

		if (node.next == null) {
			System.out.print(node.data + " ");
			return;
		}

		printReverse(node.next);
		System.out.print(node.data + " ");

	}

	public void swapFirstNodeWithLastNode() {
		Node tempHead = head;
		if (tempHead.next == null) {
			return;
		}

		Node temp = head;

		while (temp.next.next != null) {
			System.out.print(temp.next.data + " ");
			temp = temp.next;
		}

		if (temp.next.next == null) {
			head = temp.next;
			head.next = tempHead.next;
			temp.next = tempHead;
			tempHead.next = null;
		}

	}

	Node pleft;

	public boolean isPallindrom() {
		Node temp = head;
		pleft = head;
		return isPallindromHelper(temp);
	}

	public boolean isPallindromHelper(Node right) {
		if (right == null) {
			return true;
		}

		boolean result = isPallindromHelper(right.next);
		if (result == false) {
			return false;
		} else if (pleft.data != right.data) {
			return false;
		} else {
			pleft = pleft.next;
			return true;
		}

	}

	public boolean isPallindromUsingStack() {

		Node temp = head;
		Stack<Integer> st = new Stack<>();

		while (temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}

		temp = head;
		while (temp != null) {
			if (temp.data != st.pop()) {
				return false;
			}
			temp = temp.next;
		}

		return true;
	}

	/*
	 * public void printUsingRecursion() { Node temp=head; printReverse(temp); }
	 * private void printUsingRecursion(Node node) {
	 * 
	 * if(node.next==null) { System.out.print(node.data+" "); return ; }
	 * System.out.print(node.data+" "); printReverse(node.next);
	 * 
	 * 
	 * 
	 * }
	 */

}

public class LinkedListMain {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		list.print();
		list.reverse();
		list.print();
	}

	private static void linkedListTEst() {
		CustomLinkedList list = new CustomLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.remove(10);
		list.removeFromEnd();
		list.removeFromEnd();
		list.add(80);
		list.add(90);
		list.add(70);
		list.add(60);
		list.printList();
		System.out.println("min Node data : " + list.findMin());
		System.out.println("max Node data : " + list.findMax());

		System.out.println("in reverse order : ");
		list.printReverse();

		System.out.println("\nBefore swapping");
		list.printList();

		System.out.println("interchanging nodes");
		list.swapFirstNodeWithLastNode();

		System.out.println("\nAfter Sapping");
		list.printList();

		CustomLinkedList list2 = new CustomLinkedList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(20);
		list2.add(10);
		System.out.println("is Pallindrom : " + list2.isPallindrom());
		System.out.println("is Pallindrom using stack: " + list2.isPallindromUsingStack());

		CustomLinkedList list3 = new CustomLinkedList();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		System.out.println("is Pallindrom : " + list3.isPallindrom());
		System.out.println("is Pallindrom using stack: " + list3.isPallindromUsingStack());

	}

}
