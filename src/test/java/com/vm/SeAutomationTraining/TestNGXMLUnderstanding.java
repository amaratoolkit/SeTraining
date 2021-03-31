package com.vm.SeAutomationTraining;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGXMLUnderstanding {
	
	//Smoke Test
	@Test (groups = {"smoke", "regression"})
	public void test1() {
		System.out.println("Test1 is executing");
	}
	
	//Regression Test
	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("Test2 is executing");
	}
	
	@Test(groups = {"smoke"}, dependsOnMethods = "test2")
	
	public void test3() {
		System.out.println("Test3 is executing");
	}
	
	//Regression Test
	@Test(groups = {"smoke", "regression"})
	public void test4() {
		System.out.println("Test4 is executing");
	}
	
	@Test(groups = {"sanity"}, dependsOnGroups = "smoke")
	public void test9() {
		System.out.println("Test9 is executing");
	}
}
