package com.BinarySearchTree.day15;

import java.util.LinkedList;
import java.util.Queue;

class Node<T extends Comparable<T>> {
	T data;
	Node<T> left, right;

	Node(T data) {
		this.data = data;
		left = right = null;
	}
}

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	Node<T> root;

	BinarySearchTree() {
		this.root = null;
	}

	public void add(T data) {
		root = addElementsToNode(root, data);
	}

	public Node<T> addElementsToNode(Node<T> root, T data) {
		if (root == null) {
			root = new Node<T>(data);
			return root;

		} else if (data.compareTo(root.data) > 0) {
			root.right = addElementsToNode(root.right, data);

		} else {
			root.left = addElementsToNode(root.left, data);

		}
		return root;
	}

	public void inOrder() {
		System.out.println("inOrder :");
		inOrderTraverse(root);
		System.out.println();
	}

	public void inOrderTraverse(Node<T> root) {
		if (root == null)
			return;
		inOrderTraverse(root.left);
		System.out.println(root.data + " ");
		inOrderTraverse(root.right);

	}

	public void postOrder() {
		System.out.println("PostOrder :");
		postOrderTraverse(root);
		System.out.println();
	}

	public void postOrderTraverse(Node<T> root) {
		if (root == null)
			return;
		postOrderTraverse(root.left);
		postOrderTraverse(root.right);
		System.out.println(root.data + " ");

	}

	public void preOrder() {
		System.out.println("PreOrder :");
		preOrderTraverse(root);
		System.out.println();
	}

	public void preOrderTraverse(Node<T> root) {
		if (root == null)
			return;
		System.out.println(root.data + " ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);

	}

	public void bfs() {
		System.out.println("bfs");
		Queue<Node<T>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node<T> node = queue.poll();
			System.out.println(node.data + " ");
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);

		}
		System.out.println();
	}

	public boolean isEmpty() {
		return root == null;
	}

}
