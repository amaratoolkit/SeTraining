package com.vm.SeAutomationTraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class StringsPractice {
	
	//@Test
	public void reverseAString() {
		String str = "I Love Java";
		String revStr = "";
		char chr[] = str.toCharArray();
		for(int i= chr.length-1; i>0; i --) {	
			revStr= revStr + chr[i];
		}
		System.out.println("revStr ======" + revStr);
	}
	
	//@Test
	public void printDuplicatesCharsInString() {
		String str = "ILoveJava";
		char chr[] = str.toCharArray();
		
		for(int i=0; i< chr.length; i++) {

			for(int j=i+1; j<chr.length; j++) {
				if(chr[i] == chr[j]) {
					System.out.println("Duplicates ===== " + chr[j]);
				}
			}
		}		
	}

	@Test
	public void printNumberOfDuplicatesStringInString() {
		String str = "Test I Love Java I Love Java Test";
		String words[] = str.split(" ");
		Map<String, Integer> wordCOunt = new HashMap<String, Integer>();
		
		for(int i=0; i< words.length; i++) {

			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					System.out.println("Duplicates ===== " + words[j]);
				}
			}
		}	
		
		
		for(String word: words) {
			if(wordCOunt.containsKey(word)) {
				wordCOunt.put(word, wordCOunt.get(word)+1);
			}
		}
		
		Set<String> wordsInString = wordCOunt.keySet();
		
		for(String word : wordsInString) {
			if(wordCOunt.get(word) > 1) {
				System.out.println(word + " : "+ wordCOunt.get(word));
			}
		}
	}
	
	//@Test
	public void printDuplicatesStringInString() {
		String str = "Test I Love Java I Love Java Test";
		String words[] = str.split(" ");
		
		for(int i=0; i< words.length; i++) {

			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					System.out.println("Duplicates ===== " + words[j]);
				}
			}
		}		
	}
	
}
