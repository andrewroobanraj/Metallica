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
		
		btnClick(login.loginButton);	
		waitForPageToLoad(timeoutInSeconds);
	    
	}

	
	@When("User click all the links in my account page")
	public void user_click_all_the_links_in_my_account_page()  {
		
		
		btnClick(myAccount.personalInfo);
		waitForPageToLoad(timeoutInSeconds);
		System.out.println("The personal information is viewed");
		
	    btnClick(myAccount.myAccount);
	    
	    btnClick(myAccount.addresses);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(myAccount.addNewAddress);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    fill(myAccount.addressName, "Palayamkottai");
	    fill(myAccount.address1, "46,South Street");
	    fill(myAccount.firstName, "Andrew");
	    fill(myAccount.lastName, "Raj");
	    fill(myAccount.city, "Tirunelveli");
	    fill(myAccount.zipcode, "627002");
	    myAccount.country();
	    fill(myAccount.state, "TamilNadu");
	    fill(myAccount.phone, "7010537032");
	    
	    btnClick(myAccount.applyButton);
	    waitForPageToLoad(timeoutInSeconds);
	    System.out.println("New Address is added");
	    
	    btnClick(myAccount.deleteAddress);
	    
	    alert();
	    
	    waitForPageToLoad(timeoutInSeconds);
	    System.out.println("Address Deleted");
	    	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.orderHis);
	    waitForPageToLoad(timeoutInSeconds);
	    System.out.println("User is navigated to Order details page");	    
	    
	    btnClick(myAccount.myAccount);

	    btnClick(myAccount.paySetting);
	    waitForPageToLoad(timeoutInSeconds);
	    System.out.println("User is navigated to Payment details page");
	    
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
	    
	    btnClick(myAccount.myAccount);
	    	    
	} 
	
	
	@Then("User click download my data button")
	public void user_click_download_my_data_button() {
		
		btnClick(myAccount.downloadMyData);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/account/"));
		System.out.println("User is in My Accound Page");
		
		myAccount.downloadResult();
		
		toClose();	
		
	}	
	

}
