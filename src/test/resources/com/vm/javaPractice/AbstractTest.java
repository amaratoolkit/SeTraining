package com.vm.javaPractice;

public class AbstractTest extends AbstractClass{

	public void test3() {
		System.out.println("Test 3 is executing");
		
	}
	

	public void test4() {
		System.out.println("Test 4 is executing");
		
	}
	
	public static void main(String[] args) {
		AbstractTest abs = new AbstractTest();
		abs.test1();
		abs.test2();
		
		abs.test3();
		abs.test4();
	}
}
