package com.vm.javaPractice;

import org.testng.annotations.Test;

public class TestNGVsMain {
	static TestNGVsMain tm;
	
//	public static void main(String[] args) {
//		tm = new TestNGVsMain();
//		tm.test1();
//		tm.test2();
//		tm.test3();
//	}
	
	@Test(dependsOnMethods = "atest2")
	public void test3() {
		System.out.println("Test3 is running");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1 is running");
	}

	@Test(dependsOnMethods = "test1")
	public void atest2() {
		System.out.println("Test2 is running");
	}
	
	
}
