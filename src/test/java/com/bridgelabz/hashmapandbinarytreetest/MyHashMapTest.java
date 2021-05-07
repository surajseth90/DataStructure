package com.bridgelabz.hashmapandbinarytreetest;

import com.bridgelabz.hashmapandbinarytree.MyHashMap;

public class MyHashMapTest {

	public void givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		String [] words = sentence.toLowerCase().split(" ");
		for(String word : words) {
			Integer Value =myHashMap.get(word);
			if(Value==null) Value=1;
			else Value = Value +1;
			myHashMap.add(word , Value);
		}
	}
}
