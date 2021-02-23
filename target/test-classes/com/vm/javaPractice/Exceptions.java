package com.vm.javaPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Exceptions {
	WebDriver driver;
	@Test
	public void test1() {
		int a;
		int arr[] = {11,22,33,44,55,66};
		try {
			System.out.println("Try block");
			//a= 5/0;
			//int b = arr[6];
			
			driver.get("Test");
			
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception catch Block");
			e.printStackTrace();
			a = 0/5;
			System.out.println("a value is ====" + a);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayArrIndex Exception catch Block");
			e.printStackTrace();
		}catch (NullPointerException e) {
			System.out.println("NullPointer  Exception Block");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception Block");
		}finally {
			System.out.println("Finally Block");
		}
		
	}

}
