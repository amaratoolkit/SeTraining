package com.vm.javaPractice;

public class ConsrtuctorTest {
	
	String userFirstName;
	int idNumber;
	
	//Constructor
	public ConsrtuctorTest(String userName, int id) {
		this.userFirstName = userName;
		this.idNumber = id;
		
	}
	
	public ConsrtuctorTest(String firstName, String lastName) {
		
	}
	
	public ConsrtuctorTest(int id) {
		
	}
	
	public ConsrtuctorTest(long id) {
		
	}
	
	public void test1() {
		System.out.println("My first name is " + userFirstName + " and my id number is "+ idNumber);
	}
	
	public void test2(String uname, int id) {
		System.out.println("My name ======" + uname + "  and my id is " + id);
	}
	
	
	public static void main(String[] args) {
		ConsrtuctorTest ct = new ConsrtuctorTest("Shiva", 510);
		ct.test1();
		ct.test2("Selenium", 4);
		
	}
	

}
