package org.stepdefinition;

import org.base.BaseClass;
import org.elements.HomePageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	
	@When("User click all the links in home page")
	public void user_click_all_the_links_in_home_page()  throws InterruptedException{
				
		btnClick(home.cartIcon);
		
		Thread.sleep(2000);
		
		btnClick(home.homePage);
		
		btnClick(home.searchMenu);
		
		Thread.sleep(2000);
		
		btnClick(home.closeSearch);
		
		btnClick(home.metStore);
       
		Thread.sleep(2000);
		
		btnClick(home.homePage);
		
		btnClick(home.helplink);
        
        Thread.sleep(2000);
        
        btnClick(home.homePage);
		
		scrollDown();
		
		btnClick(home.creditsLink);
		
	    Thread.sleep(2000);
	    
	    btnClick(home.homePage);
	    
	    scrollDown();
        
	    btnClick(home.termsOfuseLink);
	  
        Thread.sleep(2000);
		
        btnClick(home.homePage);
		
		scrollDown();
		
		btnClick(home.privacyPolicylink);
		
	    Thread.sleep(2000);
	    
	    btnClick(home.homePage);
		
		scrollDown();
		
        btnClick(home.AWMH);
		
		windowsHandling();
   
	    btnClick(home.fifthMember);
	    
		Thread.sleep(2000);
		
		btnClick(home.homePage);
				
		btnClick(home.tourDates);
		
	    Thread.sleep(2000);
	    
	    btnClick(home.homePage);
		
		btnClick(home.photos);
		
	    Thread.sleep(2000);
	    
	    btnClick(home.videos);
	    
	    Thread.sleep(2000);
	    
	    btnClick(home.instagram);
		
		windowsHandling();
        		
		btnClick(home.product);
		
		Thread.sleep(2000);
		
		btnClick(home.homePage);
		
	}

	@Then("User back to home page")
	public void user_back_to_home_page() {
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the URL", url.contains("https://www.metallica.com/"));
		System.out.println("User is in Home Page");
		toQuit();
	}

}

