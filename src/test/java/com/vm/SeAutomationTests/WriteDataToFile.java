package com.vm.SeAutomationTests;

import java.io.FileWriter;

public class WriteDataToFile {
	
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter(System.getProperty("user.dir")+ "/testWriteData.txt");    
          fw.write("Welcome to javaTpoint.");    
          fw.close();    
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }    

}
