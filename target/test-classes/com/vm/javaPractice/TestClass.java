package com.vm.javaPractice;

public class TestClass{
	
	
	
	public static void main() {
		TestClass tc = null;
		ChildClass tc1 = null;
		
		tc = new TestClass();
		//tc1 = new TestClass();
		
		TestClass tc3 = new TestClass();
		//tc3.test3();
		
		ChildClass cClass = new ChildClass();
		cClass.test2();
		
	}

}
