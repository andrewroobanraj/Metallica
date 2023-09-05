package org.stepdefinition;

import org.base.BaseClass;
import org.elements.LoginElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	    LoginElements login=new LoginElements();


	@When("User navigate to login page")
	public void user_navigate_to_login_page() throws InterruptedException {
	    
		btnClick(login.profileIcon);
	    Thread.sleep(2000);
	}

	@When("User enter valid userName and valid Password")
	public void user_enter_valid_userName_and_valid_Password() throws InterruptedException {
		
		fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		Thread.sleep(2000);
		
	}

	@When("User click Login button")
	public void user_click_Login_button() {
		
		btnClick(login.loginButton);
	}

	@Then("User should be in a dashboard page")
	public void user_should_be_in_a_dashboard_page() {
		
		Assert.assertTrue(login.nameOfUser.isDisplayed());
		System.out.println("User is in Dashboard Page");
	}
	
	@Then("User click Logout")
	public void user_click_Logout() {
		
		btnClick(login.logoutButton);
		toClose();
	}
	
	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String userName, String password) {
		
		fill(login.userName, userName);
		fill(login.password, password);    		
	}
	

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
	   
		btnClick(login.loginButton);
		Thread.sleep(1000);
	}

	@Then("User should be in a invalid credentials page")
	public void user_should_be_in_a_invalid_credentials_page() {
		
		Assert.assertTrue(login.invalidCredentials.isDisplayed());
		System.out.println("User is in Invalid credentials Page");
		toQuit();
	    
	}

}
