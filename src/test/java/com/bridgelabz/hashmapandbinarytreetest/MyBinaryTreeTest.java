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
}
 