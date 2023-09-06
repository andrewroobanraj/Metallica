package org.stepdefinition;

import org.base.BaseClass;
import org.elements.LoginElements;
import org.elements.MyAccountPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountPage extends BaseClass{
	
	MyAccountPageElements myAccount=new MyAccountPageElements();
	LoginElements login=new LoginElements();
	
	int timeoutInSeconds = 10;

	
	@When("User navigate to my account page")
	public void user_navigate_to_my_account_page()  {
		
		btnClick(login.profileIcon);
		waitForPageToLoad(timeoutInSeconds);
	    
	    fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(login.loginButton);	
	    
	}

	@When("User click all the links in my account page")
	public void user_click_all_the_links_in_my_account_page()  {
		
		
		btnClick(myAccount.personalInfo);
		waitForPageToLoad(timeoutInSeconds);
		
	    btnClick(myAccount.myAccount);
	    
	    btnClick(myAccount.addresses);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.orderHis);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.paySetting);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.presaleCodes);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.freeDownload);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.contests);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.vinylClub);
	    waitForPageToLoad(timeoutInSeconds);
	    	    
	}

	@Then("User back to My Account page")
	public void user_back_to_My_Account_page() {
		
		btnClick(myAccount.myAccount);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the URL", url.contains("https://www.metallica.com/account/"));
		System.out.println("User is in My Account Page");
		toQuit();
			
	}

}
