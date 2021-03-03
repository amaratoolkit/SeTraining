package com.vm.SeAutomationTraining;

import org.testng.annotations.*;

public class TestNGBasics {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite Execution");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest Execution");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass Execution");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod Execution");
	}

	@Test
	public void testB() {
		System.out.println("TestB Execution");
	}
	
	@Test
	public void testA() {
		System.out.println("TestA Execution");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod Execution");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass Execution");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest Execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite Execution");
	}
	
}
