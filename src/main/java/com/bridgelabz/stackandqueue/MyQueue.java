package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;
public class MyQueue {
	private MyLinkedList myLinkedList;
	
	public MyQueue() {
		this.myLinkedList = myLinkedList;
	}

	public void printStack() {
		myLinkedList.printMyNode();
		
	}

	public INode peak() {
	return myLinkedList.head;
		
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
		
	}

	
}
