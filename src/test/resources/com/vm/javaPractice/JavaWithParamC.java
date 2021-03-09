package com.vm.javaPractice;

public class JavaWithParamC {
	
	String tool;
	String mobileAtomationTool = "Appium";
	
	//default constructor
	public JavaWithParamC(String tool) {
		System.out.println("Automation is Running with help of " + tool);
		this.mobileAtomationTool = tool;
		this.tool = tool;
	}
	
	
	public static void main(String[] args) {
		//String seName = "Selenium";
		JavaWithParamC jWithParamC = new JavaWithParamC("Selenium");
		
		jWithParamC.testWebAutomation();
		jWithParamC.testMobileAutomation();
 	}
	
	public void testWebAutomation() {
		System.out.println("Automation Tool ==== " + tool);
	}
	
	public void testMobileAutomation() {
		System.out.println("Mobile Automation Tool ==== " + tool);
	}

}
