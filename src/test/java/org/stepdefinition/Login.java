package org.stepdefinition;

import org.base.BaseClass;
import org.elements.LoginElements;
import org.elements.RegistrationElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	    LoginElements login=new LoginElements();
	    RegistrationElements registration = new RegistrationElements();
	    
	    int timeoutInSeconds = 10;


	@When("User navigate to login page")
	public void user_navigate_to_login_page() {
	    
		btnClick(login.profileIcon);
		waitForPageToLoad(timeoutInSeconds);
	}
	
	@Then("User Enter valid email id and valid password in the login page")
	public void user_Enter_valid_email_id_and_valid_password_in_the_login_page() {
		
		fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		
		btnClick(login.loginButton);
		waitForPageToLoad(timeoutInSeconds);
		
		Assert.assertTrue(login.nameOfUser.isDisplayed());
		System.out.println("Login Successfully! User is in Dashboard Page");
		
		toClose();
		
	}

	@Then("Enter invalid credentials {string} and {string}")
	public void enter_invalid_credentials_and(String username, String password) {
	    
		fill(login.userName, username);
		fill(login.password, password);  
		
		btnClick(login.loginButton);
		waitForPageToLoad(timeoutInSeconds);
		
		Assert.assertTrue(login.invalidCredentials.isDisplayed());
		System.out.println("User is in Invalid credentials Page");
		
		toClose();
		
	}
	
	@Then("Click Create Account button")
	public void click_Create_Account_button() {
		
		btnClick(registration.createAccount);	 
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@Then("User enter already existing email address in create account form and submit")
	public void user_enter_already_existing_email_address_in_create_account_form_and_submit() {
		
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
	    
	    Assert.assertTrue(login.mailAlreadyTaken.isDisplayed());
	    System.out.println("The entered Mail id is Already Taken");
	    
	    toClose();
		
	}
	
	

}
