package com.vm.SeAutomationTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypeClickAndVerify {
	 public static WebDriver driver = null;
	 
	 //public static void main(String[] args) {
	 
	 @Test
	 public void test() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("http://the-internet.herokuapp.com/forgot_password");
		 
		 WebElement emailTextbox = driver.findElement(By.name("email"));
		 WebElement retrievePassword = driver.findElement(By.cssSelector(".icon-2x.icon-signin"));
		 
		 emailTextbox.sendKeys("selenium@yopmail.com");
		 
		 retrievePassword.click();
		 
		 WebElement internalServerErrorMessage = driver.findElement(By.xpath("//h1[text()='Internal Server Error']"));
		 
		 System.out.println("Value of isDisplayed =========" + internalServerErrorMessage.isDisplayed());
		 
		 System.out.println("Value of isDisplayed =========" + internalServerErrorMessage.getText());

		 
		// Assert.assertFalse(verifyISE());
		 
		 Assert.assertTrue(internalServerErrorMessage.isDisplayed());
		 Assert.assertEquals("Internal Server Error", internalServerErrorMessage.getText());
		 System.out.println("Test");
		 driver.quit();
		 
	 }
	 
	 public boolean verifyISE() {
		 return driver.findElement(By.xpath("//h1[text()='Internal Server Error']")).isDisplayed();
	 }
	

}
