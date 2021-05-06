package com.bridgelabz.stackandqueuetest;
import com.bridgelabz.stackandqueue.MyQueue;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

public class MyQueueTest {
	@Test
	public void given3NumbersWhenAddedToQueueShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyQueue myQueue = new MyQueue();
		myQueue.push(myFirstNode);
		myQueue.push(mySecondNode);
		myQueue.push(myThirdNode);
		myQueue.printStack();
		myQueue.peak();
		INode peak =myQueue.peak();
		Assert.assertEquals(myFirstNode, peak);
		
	}
}
