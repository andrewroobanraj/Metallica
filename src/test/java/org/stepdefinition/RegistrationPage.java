package org.stepdefinition;

import org.base.BaseClass;
import org.elements.RegistrationElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPage extends BaseClass {
	
	RegistrationElements registration=new RegistrationElements();
	
	int timeoutInSeconds = 10;
	
	@When("User navigate to registration page")
	public void user_navigate_to_registration_page() {
				
		btnClick(registration.profileIcon);
		waitForPageToLoad(timeoutInSeconds);
	    btnClick(registration.createAccount);
	    
	}

	@When("User click apply button without enter values in mandatory fields")
	public void user_click_apply_button_without_enter_values_in_mandatory_fields()  {
			
		btnClick(registration.applyButton);
	    
	}

	@When("User enter values in all the fields")
	public void user_enter_values_in_all_the_fields()  {
				
		fill(registration.firstName, "Test");
		
		fill(registration.lastName, "User");
	    
	    fill(registration.userName, "TestUser1");
	    
	    fill(registration.email, "testuser2@gmail.com");
	    
	    fill(registration.confirmEmail, "testuser2@gmail.com");
	    
	    fill(registration.password, "TestUser@2");
	    
	    fill(registration.confirmPassword, "TestUser@2");
	    
	    fill(registration.dateOfbirth, "04/01/1998");
	    
	    registration.genderDropdown();
	    
	    registration.countryDropdown();
	    
	    fill(registration.zipcode, "627002");
	    
	    btnClick(registration.checkbox);
	    
	    btnClick(registration.applyButton);
	    
	}
	
	@When("User enter invalid values in the fields")
	public void user_enter_invalid_values_in_the_fields()  {
				
		registration.scrollDown();
		
		fieldClear(registration.confirmPassword);
		fill(registration.confirmPassword, "25348735jhi");
		
		fieldClear(registration.dateOfbirth);
		fill(registration.dateOfbirth, "04/01/2020");
		
		btnClick(registration.applyButton);
		waitForPageToLoad(timeoutInSeconds);
		
		registration.scrollDown();
		waitForPageToLoad(timeoutInSeconds);
		
		fieldClear(registration.zipcode);
		fill(registration.zipcode, "45445mnbjia");
		
		btnClick(registration.applyButton);
		waitForPageToLoad(timeoutInSeconds);	
		
		fieldClear(registration.email);
		fill(registration.email, "asbcd.com");
		
	}

	@When("User click apply button")
	public void user_click_apply_button() {
				
		btnClick(registration.applyButton);
		waitForPageToLoad(timeoutInSeconds);
		    
	}

	@Then("User is in registration page")
	public void user_is_in_registration_page() {
	   
		Assert.assertTrue(registration.register.isDisplayed());
		System.out.println("User is in Registration Page");
		toQuit();
		
	}

}
