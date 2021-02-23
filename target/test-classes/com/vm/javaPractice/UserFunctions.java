package com.vm.javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UserFunctions {
	AtmFunctions af;
	WebDriver driver;

	
	public static void main(String args[]) {
		UserFunctions uf = new UserFunctions();
		uf.test();
	}
	

	public void test() {
		
		af = new AtmFunctions();	
		driver = new SafariDriver();
		
		
		af.withDrawal();
		af.getStatement();
		
		driver.get("https://www.javatpoint.com/inheritance-in-java");
		driver.quit();
	}

}
