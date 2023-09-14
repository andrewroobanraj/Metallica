package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.EmailSender;
import org.stepdefinition.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition",dryRun = false,tags={"@MyAccount"}) 
public class TestRunner {

	
}
