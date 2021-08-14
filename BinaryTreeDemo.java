package com.BinarySearchTree.day15;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		Tree<Integer> tree = new BinarySearchTree<Integer>();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.add(22);
		tree.add(40);
		tree.add(11);
		tree.add(3);
		tree.add(16);
		tree.add(60);
		tree.add(95);
		tree.add(65);
		tree.add(63);
		tree.add(67);

		tree.inOrder();
		tree.preOrder();
		tree.postOrder();
		tree.bfs();

	}

}
