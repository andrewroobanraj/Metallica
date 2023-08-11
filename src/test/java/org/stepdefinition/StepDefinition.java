package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;

public class StepDefinition extends BaseClass{
	
	
	public WebDriver driver;
	@Given("User is in metallica home page")
	public void user_is_in_metallica_home_page() {
		
		launchBrowse();
		loadUrl("https://metallica.com/");
		maxBrowser();
		
	}

}

	