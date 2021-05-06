package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.INode;
import com.bridgelabz.linkedlist.MyLinkedList;
public class MyStack {
	private MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = myLinkedList;
	}

	public void push (INode myNode)
	{
		myLinkedList.add(myNode);
	}

	public void printStack() {
		myLinkedList.printMyNode();
		
	}

	public INode peak() {
	return myLinkedList.head;
		
	}

	
}
