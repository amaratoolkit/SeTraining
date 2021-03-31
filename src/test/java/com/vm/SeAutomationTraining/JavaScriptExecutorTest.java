package com.vm.SeAutomationTraining;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends LaunchApplication{
	
	@Test
	public void doActionsUsingJS() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//jse.executeScript("document.getElementById('email').value='siva8kolli@gmail.com'");
		//
		//jse.executeScript("document.getElementsById('SubmitLogin').click()");
		
		jse.executeScript("alert('I lOve Automation')");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Test");
		
		WebElement emailbox = driver.findElement(By.id("email"));
		WebElement signInButton = driver.findElement(By.id("SubmitLogin"));
		List<WebElement> button = driver.findElements(By.cssSelector(".submit"));
		
		jse.executeScript("arguments[0].value='siva8kolli@gmail.com'", emailbox);
		
		
		jse.executeScript("arguments[0].click()", driver.findElement(By.id("SubmitCreate")));
		//jse.executeScript("arguments[0].click()", signInButton);
		
		
		driver.get("https://www.goibibo.com/flights/");
		
		WebElement ele = driver.findElement(By.id("departureCalendar"));
		jse.executeScript("arguments[0].value='Fri, 40 AAAA'", ele);
		

		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		WebElement link = driver.findElement(By.xpath("//*[text()='Click Here']"));
		jse.executeScript("arguments[0].target='_self'", link);
		
		link.click();
		
		
		

		
		
		
	}

}
