package com.bridgelabz.stackandqueuetest;

import com.bridgelabz.stackandqueue.MyStack;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

public class MyStackTest {
	@Test
	public void given3NumbersWhenAddedTotackShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		myStack.peak();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode, peak);

	}

	@Test
	public void given3NumbersWhenPopedFromStackShouldBeRemoved() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, pop);

		// Assert.assertEquals(myThirdNode, peak);

	}
}
