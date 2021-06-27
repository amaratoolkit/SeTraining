package com.vm.SeAutomationTests;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteToLogFile {

	  public static void main(String[] args) throws IOException {
	        Logger logger = Logger.getLogger(WriteToLogFile.class.getName());

	        // Create an instance of FileHandler that write log to a file called
	        // app.log. Each new message will be appended at the at of the log file.
	        FileHandler fileHandler = new FileHandler("app.log", true);        
	        logger.addHandler(fileHandler);

	        if (logger.isLoggable(Level.INFO)) {
	            logger.info("Information message");
	        }

	        if (logger.isLoggable(Level.WARNING)) {
	            logger.warning("Warning message");
	        }

	    }
}
