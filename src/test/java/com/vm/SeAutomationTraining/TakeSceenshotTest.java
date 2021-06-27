package com.vm.SeAutomationTraining;

import java.io.File;
import java.lang.reflect.Method;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TakeSceenshotTest{
	

	public void getScreenshotWhenTestFails(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		
		String getCurrentDirectory = System.getProperty("user.dir");
		Date date = new Date();  
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy:hhmm");  
	    String strDate= formatter.format(date);  
		
		File destinationFile = new File( getCurrentDirectory + "/screenshots/"+strDate+".png");
		FileUtils.copyFile(screenshotFile, destinationFile);
		
		
		
	}
	
	@Test
	public void test(Method method) {
		System.out.println(method.getName());
		testing(method);
	}
	
	public void testing(Method method) {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println(name);
	}
	

}
