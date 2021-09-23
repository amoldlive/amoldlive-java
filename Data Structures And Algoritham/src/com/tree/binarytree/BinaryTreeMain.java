package com.tree.binarytree;

/*Node class*/
class Node {
	Node left;
	Node right;
	int data;

	public Node(int data) {
		this.data = data;
	}

}
/*Binary tree*/
class BinaryTree {
	private Node root;

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node rootNode, int data) {

		if (rootNode == null) {
			Node root = new Node(data);
			return root;
		}

		if (data < rootNode.data) {
			rootNode.left = insert(rootNode.left, data);
		} else if (data > rootNode.data) {
			rootNode.right = insert(rootNode.right, data);
		}

		return rootNode;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + "  ");
			inOrder(root.right);

		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + "  ");
			preOrder(root.left);
			preOrder(root.right);

		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "  ");
		}
	}
	
	public int findMin() {
		return findMin(root);
	}
	private int findMin(Node node) {
		if(node!=null) {
			return node.left==null ? node.data : findMin(node.left);
		}else {
			return 0;
		}
	}
	
	public int findMax() {
		return findMax(root);
	}

	private int findMax(Node node) {
		if(node!=null) {
			return node.right==null ? node.data : findMax(node.right);
		}else {
			return 0;
		}
	}
}

public class BinaryTreeMain {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(6);
		tree.insert(4);
		tree.insert(8);
		tree.insert(3);
		tree.insert(5);
		tree.insert(7);
		tree.insert(9);
		System.out.println("in order");
		tree.inOrder();
		System.out.println("\nPre Order");
		tree.preOrder();
		System.out.println("\nPost Order");
		tree.postOrder();
		System.out.println("\nMin Value : "+tree.findMin());
		System.out.println("\nMax Value : "+tree.findMax());
	}
}
