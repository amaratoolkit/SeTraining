package com.vm.SeAutomationTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class WriteToExcell {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM_dd_yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		// creating an instance of Workbook class
		Workbook wb = new HSSFWorkbook();
		// creates an excel file at the specified location
		OutputStream fileOut = new FileOutputStream(
				System.getProperty("user.dir") + "/reportlog_" + dtf.format(now) + ".xlsx");
		System.out.println("Excel File has been created successfully.");
		wb.write(fileOut);

	}

	@Test
	public void writeLogsToExcel() throws IOException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM_dd_yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));

		String excelFileName = System.getProperty("user.dir") + "/reportlog_" + dtf.format(now) + ".xls" ;// name of excel file

		
		writeXLSFile(0,0, "Testing", excelFileName);
		
		

	
		
	}
	
	public void writeXLSFile(int r, int c, String text, String excelFileName) throws IOException {
		
		
		String sheetName = "Sheet1";// name of sheet

		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet(sheetName);
		HSSFRow row = sheet.createRow(r);
		HSSFCell cell = row.createCell(c);
		String str = "Testing";
		
		
		cell.setCellValue(text);

		// iterating r number of rows
//		for (r = 0; r < 5; r++) {
//			 row = sheet.createRow(r);
//
//			// iterating c number of columns
//			for ( c = 0; c < 5; c++) {
//				 cell = row.createCell(c);
//
//				cell.setCellValue("Cell " + r + " " + c);
//			}
//		}
//
		FileOutputStream fileOut = new FileOutputStream(excelFileName);

		wb.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	public void appendDataInExcell(String fileName) {
		String excelFilePath = fileName;
        
        try {
            FileInputStream inputStream = new FileInputStream(excelFilePath);
            Workbook workbook = WorkbookFactory.create(inputStream);
 
            Sheet sheet = workbook.getSheetAt(0);
 
            Object[][] bookData = {
                    {"The Passionate Programmer", "Chad Fowler", 16},
                    {"Software Craftmanship", "Pete McBreen", 26},
                    {"The Art of Agile Development", "James Shore", 32},
                    {"Continuous Delivery", "Jez Humble", 41},
            };
 
            int rowCount = sheet.getLastRowNum();
 
            for (Object[] aBook : bookData) {
                Row row = sheet.createRow(++rowCount);
 
                int columnCount = 0;
                 
                Cell cell = row.createCell(columnCount);
                cell.setCellValue(rowCount);
                 
                for (Object field : aBook) {
                    cell = row.createCell(++columnCount);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }
 
            }
 
            inputStream.close();
 
            FileOutputStream outputStream = new FileOutputStream("JavaBooks.xls");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
             
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
	}

}
