package com.vm.SeAutomationTraining;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGXMLUnderstanding2 {
	
	//Smoke Test
	@Test (groups = {"smoke", "regression"})
	public void test5() {
		System.out.println("Test5 is executing");
	}
	
	//Regression Test
	@Test(groups = {"regression"})
	public void test6() {
		System.out.println("Test6 is executing");
	}
	
	@Test(groups = {"smoke"})
	public void test7() {
		System.out.println("Test7 is executing");
	}
	
	//Regression Test
	@Test(groups = {"smoke", "regression"})
	public void test8() {
		System.out.println("Test8 is executing");
	}
}
