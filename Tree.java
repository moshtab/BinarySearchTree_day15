package com.BinarySearchTree.day15;

interface Tree<T extends Comparable<T>> {
	void add(T data);

	void preOrder();

	void postOrder();

	void inOrder();

	void bfs();

	public boolean search(T data);

	public boolean isEmpty();

}
