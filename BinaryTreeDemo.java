package com.BinarySearchTree.day15;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		Tree<Integer> tree = new BinarySearchTree<Integer>();
		tree.add(56);
		tree.add(30);
		tree.add(70);

		tree.inOrder();
		tree.preOrder();
		tree.postOrder();
		tree.bfs();

	}

}
