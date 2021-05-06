package com.bridgelabz.stackandqueuetest;

import com.bridgelabz.stackandqueue.MyDequeue;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyNode;

public class MyDequeueTest {
	@Test
	public void given3NumbersWhenAddedToDeQueueShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyDequeue myDequeue = new MyDequeue();
		myDequeue.push(myFirstNode);
		myDequeue.push(mySecondNode);
		myDequeue.push(myThirdNode);
		myDequeue.printStack();
		myDequeue.peak();
		INode peak = myDequeue.peak();
		Assert.assertEquals(myFirstNode, peak);

	}

	@Test
	public void given3NumbersWhenPopedFromDeQueueShouldBeRemoved() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyDequeue myDequeue = new MyDequeue();
		myDequeue.push(myFirstNode);
		myDequeue.push(mySecondNode);
		myDequeue.push(myThirdNode);
		INode pop = myDequeue.pop();
		myDequeue.printStack();
		Assert.assertEquals(myFirstNode, pop);

		// Assert.assertEquals(myThirdNode, peak);

	}
}
