package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.LoginPojo;
import org.pojo.MyAccountPagePojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountPage extends BaseClass{
	
	MyAccountPagePojo a=new MyAccountPagePojo();
	LoginPojo l=new LoginPojo();

	
	@When("User navigate to my account page")
	public void user_navigate_to_my_account_page() throws InterruptedException {
		
		btnClick(l.getProfileIcon());
	    Thread.sleep(2000);
	    
	    fill(l.getUserName(), "andrewroobanraaj@gmail.com");
		fill(l.getPassword(), "Metallica@2");
		Thread.sleep(2000);
		
		btnClick(l.getLoginButton());	
	    
	}

	@When("User click all the links in my account page")
	public void user_click_all_the_links_in_my_account_page() throws InterruptedException {
		
		
		btnClick(a.getPersonalInfo());
	    Thread.sleep(1000);
		
	    btnClick(a.getMyAccount());
	    
	    btnClick(a.getAddresses());
	    Thread.sleep(1000);
	    
	    btnClick(a.getMyAccount());

	    btnClick(a.getOrderHis());
	    Thread.sleep(1000);
	    
	    btnClick(a.getMyAccount());

	    btnClick(a.getPaySetting());
	    Thread.sleep(1000);
	    
	    btnClick(a.getMyAccount());

	    btnClick(a.getPresaleCodes());
	    Thread.sleep(1000);
	    
	    btnClick(a.getMyAccount());

	    btnClick(a.getFreeDownload());
	    Thread.sleep(1000);
	    
	    btnClick(a.getMyAccount());

	    btnClick(a.getContests());
	    Thread.sleep(1000);
	    
	    btnClick(a.getMyAccount());

	    btnClick(a.getVinylClub());
	    Thread.sleep(1000);
	    	    
	}

	@Then("User back to My Account page")
	public void user_back_to_My_Account_page() {
		
		btnClick(a.getMyAccount());
		System.out.println("My Account Page - Done");
		
		toQuit();
			
	}

}
