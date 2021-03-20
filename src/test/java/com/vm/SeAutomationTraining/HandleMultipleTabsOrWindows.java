package com.vm.SeAutomationTraining;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleMultipleTabsOrWindows extends LaunchApplication {

	 @Test
	public void switchtoTabOrWindow() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement multiWindowsLink = driver.findElement(By.cssSelector("a[href='/windows']"));
		wait.until(ExpectedConditions.elementToBeClickable(multiWindowsLink)).click();

		String parentWindowId = driver.getWindowHandle();

		System.out.println("parentWindowId ============ " + parentWindowId);

		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/windows/new']"))).click();

		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		Set<String> numberOfWindows = new HashSet<String>();

		numberOfWindows = driver.getWindowHandles();

		System.out.println("Number of windows =========== " + numberOfWindows);

		for (String window : numberOfWindows) {
			System.out.println("Windows Id =========" + window);
			driver.switchTo().window(window);
		}

		wait.until(ExpectedConditions.textToBe(By.xpath("//h3[text()='New Window']"), "New Window"));
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/windows/new']"))).click();

	}

//	@Test
	public void closeBrowserWindows() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");

		String parentWindowId = driver.getWindowHandle();
		System.out.println("parentWindowId ============ " + parentWindowId);
		
		Set<String> numberOfWindows = new HashSet<String>();

		numberOfWindows = driver.getWindowHandles();

		System.out.println("===============================================================================================");
		System.out.println("Number of windows =========== " + numberOfWindows);
		System.out.println("===============================================================================================");
		for (String window : driver.getWindowHandles()) {
			
			
			
			System.out.println("Print Window ID in the loop");
			System.out.println("===============================================================================================");
			System.out.println("Windows Id =========" + window);
			driver.switchTo().window(window);
			
			Thread.sleep(10000);
			if(window.equals(parentWindowId)){
				System.out.println("Parent window is opening ");
			} else {
				driver.close();
			}
		}
	}

}
