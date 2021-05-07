package com.bridgelabz.hashmapandbinarytreetest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.hashmapandbinarytree.MyBinaryTree;

public class MyBinaryTreeTest {

	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size =myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}

	@Test
	public void givenNNumbersWhenAddedToBinaryTreeShouldReturnSizeN() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
		int n = 10;
		for (int i = 0; i < n; i++) {
			myBinaryTree.add(i+1);
		}
		int size =myBinaryTree.getSize();
		Assert.assertEquals(n, size);
	}
}
 