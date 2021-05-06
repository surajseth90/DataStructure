package com.bridgelabz.linkedlist;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}

	}

	public void append(INode myNode) {
		if (this.head == null) {
			this.head = myNode;

		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;

		}
	}

	public void insertBetween(INode myNode, INode nodeBetween) {
		INode tempNode = myNode.getNext();
		myNode.setNext(nodeBetween);
		nodeBetween.setNext(tempNode);
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;

	}

	public boolean search(Integer Key) {
		INode current = head;
		while (current != null) {
			if (current.getKey() == Key)
				return true;
			current = current.getNext();
		}
		return false;
	}

	public void printMyNode() {
		StringBuffer myNodes = new StringBuffer("My Nodes");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}

}
