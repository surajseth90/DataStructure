package com.bridgelabz.hashmapandbinarytreetest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.hashmapandbinarytree.MyLinkedHashMap;

public class MyLinkedHashMapTest {
	@Test
	public void givenSentence_WhenWordsAreAddedToList_ShouldReturnParanoidFrequency() {
		String sentence = "Paranoid are not paranoid because they are paranoid but"
				+ "beacause they keep putting themselves deliberately into" + "paranoid avoidable situations";
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		for (String word : words) {
			Integer Value = myLinkedHashMap.get(word);
			if (Value == null)
				Value = 1;
			else
				Value = Value + 1;
			myLinkedHashMap.add(word, Value);
		}
		int frequency = myLinkedHashMap.get("to");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);

	}
}
