package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReports {
	
	public static void generateReports(String jsonPath) {
	
	File file=new File(System.getProperty("user.dir")+"\\AllReports\\JVMReport");

	Configuration config=new Configuration(file, "METALLICA APPLICATION");
	
	config.addClassifications("JDK", "1.8");
	config.addClassifications("platform","Windows");
	
	List<String> list=new ArrayList<String>();
	
	list.add(jsonPath);
	
	ReportBuilder report=new ReportBuilder(list,config);
	report.generateReports();
	
	
	
	}
	
}
