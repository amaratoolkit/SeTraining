package com.vm.SeAutomationTraining;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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

}
