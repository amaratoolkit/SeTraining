package com.vm.javaPractice;

public class ChildClass extends ParentClass{
	
	public void test3() {
		System.out.println("Test 1 Executed");
	}
	
	public void test2() {
		String s = "Pass";
		System.out.println("Child Test 2 Executed" + s);
	}

	public void car() {
		System.out.println("Parent Car Executed");
	}
	
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		ParentClass pp = new ChildClass();
		cc.withDrawal();
		cc.getStatement();
		System.out.println("call some string === " + cc.r);
	}

}
