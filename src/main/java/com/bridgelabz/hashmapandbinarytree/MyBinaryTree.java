package com.bridgelabz.hashmapandbinarytree;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else
			current.right = addRecursively(current.right, key);

		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public MyBinaryNode<K> searchNodeRecursively(MyBinaryNode<K> current, K key) {
		if (root == null) {
			return null;
		} else {
			if (current.key == key) {
				return current;
			}
			if (current.left != null) {
				searchNodeRecursively(current.left, key);
			}
			if (current.right != null) {
				searchNodeRecursively(current.right, key);
			}
		}
		return current;
	}

	public boolean getSearchResult(K key) {
		return this.getSearchResultRecursive(root);
	}

	private boolean getSearchResultRecursive(MyBinaryNode<K> current) {
		this.getSearchResultRecursive(current.left) ;
		this.getSearchResultRecursive(current.right);
		return current == null ? false : true;
	}
}
