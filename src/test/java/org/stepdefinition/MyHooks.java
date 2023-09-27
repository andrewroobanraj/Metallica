package org.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class MyHooks {

	@After
	public static void afterScenario(Scenario scenario) throws IOException, InvalidFormatException  {
	
		if (scenario != null) {
		String scenarioName = scenario.getName();
		String scenarioStatus = scenario.getStatus().toString();

		System.out.println("Scenario: " + scenarioName);
		System.out.println("Status: " + scenarioStatus);
		
		String result = scenarioStatus.substring(0, 4).toLowerCase();
		
		//File file=new File("C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\Excel\\Met_Regression_Automation.xlsx");
		
		FileInputStream file = new FileInputStream("C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\Excel\\Met_Regression_Automation.xlsx");
		
		Workbook book =new XSSFWorkbook(file);
		
		Sheet sheet = book.getSheet("Sheet1");
				
				for (Row row : sheet) {
		            Cell scenarioCell = row.getCell(2);
		            if (scenarioCell != null && scenarioCell.getStringCellValue().equals(scenarioName)) {
		                Cell resultCell = row.createCell(4); 
		                resultCell.setCellValue(result);
		                break;
		            }
				}
				
		FileOutputStream output = new FileOutputStream("C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\Excel\\Met_Regression_Automation.xlsx");
		book.write(output);
		
		System.out.println("Status Updated in Excel");
			}
	}
	
}

