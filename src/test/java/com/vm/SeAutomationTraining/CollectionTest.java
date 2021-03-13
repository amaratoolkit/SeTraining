package com.vm.SeAutomationTraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;

public class CollectionTest {
	
	@Test
	public void arrayListTest() {
		
		List<String> arrayList = new ArrayList<String>();
		
		//ArrayList arrayList = new ArrayList();
		
		arrayList.add("Selenium");
		//arrayList.add(3.141);
		arrayList.add("Appium");
		//arrayList.add(2);
		arrayList.add("Protractor");
		arrayList.add("RestAssured");
		arrayList.add("PostMan");
		arrayList.add("JMeter");
		arrayList.add("Selenium");
		
		System.out.println("arrayList data =====" + arrayList);
		arrayList.remove("PostMan");
		arrayList.add(0, "Appium");
		System.out.println("arrayList data =====" + arrayList);
		
		String[] strArray = {"Selenium", "Appium"};
		int[] intArray = {1,2,3,4,5};
		
//		System.out.println("My String array =====" + strArray[1]);
//		System.out.println("My Integre array=====" + intArray[1]);
		System.out.println("======================================================================");
}
	
	
	@Test (dependsOnMethods = "arrayListTest")
	public void linkedListTest() {
		List<String> linkedListArray = new LinkedList<String>();
		
		linkedListArray.add("Selenium");
		//arrayList.add(3.141);
		linkedListArray.add("Appium");
		//arrayList.add(2);
		linkedListArray.add("Protractor");
		linkedListArray.add("RestAssured");
		linkedListArray.add("PostMan");
		linkedListArray.add("JMeter");
		linkedListArray.add("Selenium");
		
		//System.out.println("linkedListArray data =====" + linkedListArray);
		
		//linkedListArray.remove("PostMan");
		
		System.out.println("linkedListArray data =====" + linkedListArray);
//		linkedListArray.add(0, "Appium");
//		System.out.println("linkedListArray data =====" + linkedListArray);
		
		System.out.println("======================================================================");
		
		
		
		List<String> linkedListArray1 = new LinkedList<String>();
		
		linkedListArray1.add("Selenium");
		//arrayList.add(3.141);
		linkedListArray1.add("Appium");
		//arrayList.add(2);
		linkedListArray1.add("Protractor");
		linkedListArray1.add("RestAssured");
		linkedListArray1.add("PostMan");
		linkedListArray1.add("JMeter");
		linkedListArray1.add("Selenium");
		
		System.out.println("linkedListArray1 data =====" + linkedListArray1);
		
		Assert.assertTrue(linkedListArray.equals(linkedListArray1));
		
	}
	
	@Test (dependsOnMethods = "linkedListTest")
	public void hashSetTest() {
		
		Set<String> hashSetArray = new HashSet<String>();
		
		hashSetArray.add("Selenium");
		//arrayList.add(3.141);
		hashSetArray.add("Appium");
		//arrayList.add(2);
		hashSetArray.add("Protractor");
		hashSetArray.add("RestAssured");
		hashSetArray.add("PostMan");
		hashSetArray.add("JMeter");
		hashSetArray.add("Selenium");
		
		System.out.println("hashSetArray data =====" + hashSetArray);
		
		hashSetArray.remove("PostMan");
		//hashSetArray.add(0, "Appium");
		System.out.println("hashSetArray data =====" + hashSetArray);
		
		System.out.println("======================================================================");
	}
	
	@Test(dependsOnMethods = "hashSetTest")
	public void linkedHashSet() {
		Set<String> linkedHashSetArray = new LinkedHashSet<String>();
		
		linkedHashSetArray.add("Selenium");
		//arrayList.add(3.141);
		linkedHashSetArray.add("Appium");
		//arrayList.add(2);
		linkedHashSetArray.add("Protractor");
		linkedHashSetArray.add("RestAssured");
		linkedHashSetArray.add("PostMan");
		linkedHashSetArray.add("JMeter");
		linkedHashSetArray.add("Selenium");
		
		System.out.println("linkedHashSetArray data =====" + linkedHashSetArray);
		
		linkedHashSetArray.remove("PostMan");
		//hashSetArray.add(0, "Appium");
		System.out.println("linkedHashSetArray data =====" + linkedHashSetArray);
		
		System.out.println("======================================================================");
	}
	
	@Test(dependsOnMethods = "linkedHashSet")
	public void hashMap() {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "Selenium");
		hashMap.put(2, "Appium");
		hashMap.put(3, "RestAssured");
		hashMap.put(1, "Selenium");
		hashMap.put(null, null);
		
		System.out.println("hashMap data ======" + hashMap);
	}
	
	@Test(dependsOnMethods = "hashMap")
	public void hashTableTest() {
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
		
		
		hashTable.put(1, "Selenium");
		hashTable.put(2, "Appium");
		hashTable.put(3, "RestAssured");
		hashTable.put(1, "Selenium");
		//hashTable.put(null, null);
		
		System.out.println("hashTable data ======" + hashTable);
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
