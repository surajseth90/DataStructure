package com.bridgelabz.hashmapandbinarytree;

import com.bridgelabz.linkedlist.MyLinkedList;

public class MyHashMap<K, V> {
	MyLinkedList myLinkedList;

	public MyHashMap() {
		this.myLinkedList = new MyLinkedList();
	}

	public V get(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();

	}

	public void add(K key, V values) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, values);
			this.myLinkedList.append(myMapNode);
		} else {
			myMapNode.setValue(values);
		}

	}

}
