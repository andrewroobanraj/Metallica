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

	
	@When("User navigate to my account page")
	public void user_navigate_to_my_account_page() throws InterruptedException {
		
		btnClick(login.profileIcon);
	    Thread.sleep(2000);
	    
	    fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		Thread.sleep(2000);
		
		btnClick(login.loginButton);	
	    
	}

	@When("User click all the links in my account page")
	public void user_click_all_the_links_in_my_account_page() throws InterruptedException {
		
		
		btnClick(myAccount.personalInfo);
	    Thread.sleep(1000);
		
	    btnClick(myAccount.myAccount);
	    
	    btnClick(myAccount.addresses);
	    Thread.sleep(1000);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.orderHis);
	    Thread.sleep(1000);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.paySetting);
	    Thread.sleep(1000);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.presaleCodes);
	    Thread.sleep(1000);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.freeDownload);
	    Thread.sleep(1000);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.contests);
	    Thread.sleep(1000);
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.vinylClub);
	    Thread.sleep(1000);
	    	    
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
