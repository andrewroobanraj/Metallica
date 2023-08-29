package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.LoginPojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	
	    LoginPojo l=new LoginPojo();


	@When("User navigate to login page")
	public void user_navigate_to_login_page() throws InterruptedException {
	    
		btnClick(l.getProfileIcon());
	    Thread.sleep(2000);
	}

	@When("User enter valid userName and valid Password")
	public void user_enter_valid_userName_and_valid_Password() throws InterruptedException {
		
		fill(l.getUserName(), "andrewroobanraaj@gmail.com");
		fill(l.getPassword(), "Metallica@2");
		Thread.sleep(2000);
		
	}

	@When("User click Login button")
	public void user_click_Login_button() {
		
		btnClick(l.getLoginButton());
	}

	@Then("User should be in a dashboard page")
	public void user_should_be_in_a_dashboard_page() {
		
		pageUrl();
	}
	
	@Then("User click Logout")
	public void user_click_Logout() {
		
		btnClick(l.getLogoutButton());
		toQuit();
	}
	
	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String userName, String password) {
		
		fill(l.getUserName(), userName);
		fill(l.getPassword(), password);    		
	}

	@When("User click login button")
	public void user_click_login_button() {
	   
		btnClick(l.getLoginButton());
	}

	@Then("User should be in a invalid credentials page")
	public void user_should_be_in_a_invalid_credentials_page() {
		
		pageUrl();
	    
	}

}
