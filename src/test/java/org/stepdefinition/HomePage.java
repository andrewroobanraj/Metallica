package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.HomePagePojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass{
	
	@When("User click all the links in home page")
	public void user_click_all_the_links_in_home_page()  throws InterruptedException{
		
		HomePagePojo h=new HomePagePojo();
		
		btnClick(h.getCartIcon());
		
		Thread.sleep(2000);
		
		btnClick(h.getHomePage());
		
		btnClick(h.getSearchMenu());
		
		Thread.sleep(2000);
		
		btnClick(h.getCloseSearch());
		
		btnClick(h.getMetStore());
       
		Thread.sleep(2000);
		
		btnClick(h.getHomePage());
		
		btnClick(h.getHelplink());
        
        Thread.sleep(2000);
        
        btnClick(h.getHomePage());
		
		scrollDown();
		
		btnClick(h.getCreditsLink());
		
	    Thread.sleep(2000);
	    
	    btnClick(h.getHomePage());
	    
	    scrollDown();
        
	    btnClick(h.getTermsOfuseLink());
	  
        Thread.sleep(2000);
		
        btnClick(h.getHomePage());
		
		scrollDown();
		
		btnClick(h.getPrivacyPolicylink());
		
	    Thread.sleep(2000);
	    
	    btnClick(h.getHomePage());
		
		scrollDown();
		
        btnClick(h.getAWMH());
		
		windowsHandling();
   
	    btnClick(h.getFifthMember());
	    
		Thread.sleep(2000);
		
		btnClick(h.getHomePage());
				
		btnClick(h.getTourDates());
		
	    Thread.sleep(2000);
	    
	    btnClick(h.getHomePage());
		
		btnClick(h.getPhotos());
		
	    Thread.sleep(2000);
	    
	    btnClick(h.getVideos());
	    
	    Thread.sleep(2000);
	    
	    btnClick(h.getInstagram());
		
		windowsHandling();
        		
		btnClick(h.getProduct());
		
		Thread.sleep(2000);
		
		btnClick(h.getHomePage());
		
	}

	@Then("User back to home page")
	public void user_back_to_home_page() {
		
		System.out.println("Home Page - Done");
		
		toQuit();
	}

}

