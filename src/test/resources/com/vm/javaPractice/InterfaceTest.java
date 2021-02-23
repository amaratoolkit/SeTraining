package com.vm.javaPractice;

public class InterfaceTest implements Interface1,Interface2{
	public static void main(String args[]) {
		InterfaceTest it = new InterfaceTest();
		it.test1();
		it.test2();
		it.test3();
		it.test4();
	}

	public void test3() {
		System.out.println("Test3 executed");
		
	}

	public void test4() {
		System.out.println("Test4 executed");
		
	}

	public void test1() {
		System.out.println("Test1 executed");
		
	}

	public void test2() {
		System.out.println("Test2 executed");
		
	}

}
