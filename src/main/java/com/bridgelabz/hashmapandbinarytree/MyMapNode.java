package com.bridgelabz.hashmapandbinarytree;

import com.bridgelabz.linkedlist.INode;

public class MyMapNode<K, V> implements INode {
	K key;
	V value;

	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	MyMapNode<K, V> next;

	@Override
	public K getKey() {
		return key; 
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getNext() {
		return next;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public void setNext(INode next) {
		this.next = (MyMapNode<K, V>) next;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{" + "K").append(key).append(" V ").append(value).append(" } ");
		if (next != null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();

	}
}
