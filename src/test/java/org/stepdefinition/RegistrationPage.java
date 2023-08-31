package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.RegistrationPojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPage extends BaseClass {
	
	RegistrationPojo r=new RegistrationPojo();
	
	@When("User navigate to registration page")
	public void user_navigate_to_registration_page() throws InterruptedException {
				
		btnClick(r.getProfileIcon());
		Thread.sleep(2000);
	    btnClick(r.getCreateAccount());
	    
	}

	@When("User click apply button without enter values in mandatory fields")
	public void user_click_apply_button_without_enter_values_in_mandatory_fields() throws InterruptedException {
		
		Thread.sleep(2000);		
		btnClick(r.getApplyButton());
	    
	}

	@When("User enter values in all the fields")
	public void user_enter_values_in_all_the_fields() throws InterruptedException {
				
		fill(r.getFirstName(), "Test");
		
		fill(r.getLastName(), "User");
	    
	    fill(r.getUserName(), "TestUser1");
	    
	    fill(r.getEmail(), "testuser2@gmail.com");
	    
	    fill(r.getConfirmEmail(), "testuser2@gmail.com");
	    
	    fill(r.getPassword(), "TestUser@2");
	    
	    fill(r.getConfirmPassword(), "TestUser@2");
	    
	    fill(r.getDateOfbirth(), "04/01/1998");
	    
	    r.genderDropdown();
	    
	    r.countryDropdown();
	    
	    fill(r.getZipcode(), "627002");
	    
	    btnClick(r.getCheckbox());
	    
	    btnClick(r.getApplyButton());
	    
	}
	
	@When("User enter invalid values in the fields")
	public void user_enter_invalid_values_in_the_fields() throws InterruptedException {
				
		r.scrollDown();
		
		fieldClear(r.getConfirmPassword());
		fill(r.getConfirmPassword(), "25348735jhi");
		
		fieldClear(r.getDateOfbirth());
		fill(r.getDateOfbirth(), "04/01/2020");
		
		btnClick(r.getApplyButton());
		Thread.sleep(2000);
		
		r.scrollDown();
		Thread.sleep(3000);
		
		fieldClear(r.getZipcode());
		fill(r.getZipcode(), "45445mnbjia");
		
		btnClick(r.getApplyButton());
		Thread.sleep(2000);	
		
		fieldClear(r.getEmail());
		fill(r.getEmail(), "asbcd.com");
		
	}

	@When("User click apply button")
	public void user_click_apply_button() throws InterruptedException {
				
		btnClick(r.getApplyButton());
		Thread.sleep(2000);
		
	    
	}

	@Then("User is in registration page")
	public void user_is_in_registration_page() {
	   
		System.out.println("Registration Page - Done");
		
		toQuit();
		
	}

}
