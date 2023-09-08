package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.EmailSender;
import org.stepdefinition.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition",tags = "@categorybrowserpage,@shoppingcartpage,@shippingpage",  plugin = {
		"html:C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\AllReports\\HTMLReports",
		"junit:C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\AllReports\\JunitReports\\met.xml",
		"json:C:\\Users\\UTIS LAPTOP 35\\eclipse-workspace\\Selenium\\Metallica\\AllReports\\JSONReports\\metallica.json" })

public class TestRunner {

	@AfterClass

	public static void report() {

		JVMReports.generateReports(System.getProperty("user.dir") + "\\AllReports\\JSONReports\\metallica.json");
	}

	/*
	   @AfterClass
	  
	   public static void mail() {
	   
	   EmailSender.main(null);
	  
	   }
	 */

}
