package com.vm.SeAutomationTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleFrames extends LaunchApplication{
	
	//@Test
	public void switchToFrameTest() {
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		
		// switch frame using id
		//driver.switchTo().frame("mce_0_ifr");
		
		//using webelemnt 
		driver.switchTo().frame(driver.findElement(By.cssSelector("#mce_0_ifr")));
		
		
		WebElement textArea = driver.findElement(By.id("tinymce"));
		textArea.clear();
		textArea.sendKeys("An iFrame containing the TinyMCE WYSIWYG Editor");
		System.out.println("Test");
		
	}
	
	@Test
	public void switchToNestedFramesTest() {
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.cssSelector("frame[name='frame-top']"))));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.cssSelector("frame[name='frame-left']"))));

		//Moving back to parent frame
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.cssSelector("frame[name='frame-top']"))));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.cssSelector("frame[name='frame-middle']"))));
		
		
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.cssSelector("frame[name='frame-bottom']"))));
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame-left")));
		//frame[name='frame-left']
		
		//boolean test = driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText().equals("LEF");
		
		
		List<WebElement> test = driver.findElements(By.xpath("//body[normalize-space()='BOTTOM']"));
		System.out.println("boolean output =========="  + test.size());
		
		
	}
	

}
