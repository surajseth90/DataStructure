package com.bridgelabz.hashmapandbinarytreetest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.hashmapandbinarytree.MyHashMap;

public class MyHashMapTest {

	@Test
	public void givenSentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer Value = myHashMap.get(word);
			if (Value == null)
				Value = 1;
			else
				Value = Value + 1;
			myHashMap.add(word, Value);
		}
		int frequency = myHashMap.get("to");
		System.out.println(myHashMap);
		Assert.assertEquals(2, frequency);
	}
}
