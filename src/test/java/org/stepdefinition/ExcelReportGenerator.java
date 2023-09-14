package org.stepdefinition;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.runner.TestRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReportGenerator {
	
	//Gson gson = new Gson();
	//JsonObject jsonReport = gson.fromJson("\\AllReports\\JSONReports\\metallica.json", JsonObject.class);

	File file =new File("C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\AllReports\\Excel");
	// Create a new Excel workbook
	Workbook workbook = new HSSFWorkbook();
	Sheet sheet = workbook.createSheet("Cucumber Test Results");

	// Add headers to the Excel sheet
	Row headerRow = sheet.createRow(0);
	
	Cell cell = headerRow.createCell(0);
	
	
	
	
	
	
	/*
		
	headerRow.createCell(1).setCellValue("Scenario");
	headerRow.createCell(2).setCellValue("Status");
	

	// Loop through your parsed JSON data and add rows to the Excel sheet
	int rowNum = 1;
	for (JsonObject testCase : testCases) {
	    Row row = sheet.createRow(rowNum++);
	    row.createCell(0).setCellValue(testCase.get("feature").getAsString());
	    row.createCell(1).setCellValue(testCase.get("scenario").getAsString());
	    row.createCell(2).setCellValue(testCase.get("status").getAsString());
	    // Add more columns as needed
	}
	
	try (FileOutputStream outputStream = new FileOutputStream("cucumber-report.xlsx")) {
	    workbook.write(outputStream);
	} catch (IOException e) {
	    e.printStackTrace();
	}


	   
		
	*/
	
}
