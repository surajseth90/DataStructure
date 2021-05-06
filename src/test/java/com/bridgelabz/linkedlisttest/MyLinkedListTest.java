package com.bridgelabz.linkedlisttest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;

public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		boolean result =  myLinkedList.head.equals(myThirdNode) &&
						  myLinkedList.head.getNext().equals(mySecondNode) &&
						  myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

}
