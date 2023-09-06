package org.stepdefinition;

import org.base.BaseClass;
import org.elements.HomePageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	
	int timeoutInSeconds = 10;
	
	@When("User click all the links in home page")
	public void user_click_all_the_links_in_home_page() throws InterruptedException {
				
		btnClick(home.cartIcon);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.homePage);
		
		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.closeSearch);
		
		btnClick(home.metStore);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.homePage);
		
		btnClick(home.helplink);
		waitForPageToLoad(timeoutInSeconds);
        
        btnClick(home.homePage);
		
		scrollDown();
		
		btnClick(home.creditsLink);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(home.homePage);
	    
	    scrollDown();
        
	    btnClick(home.termsOfuseLink);
	    waitForPageToLoad(timeoutInSeconds);
		
        btnClick(home.homePage);
		
		scrollDown();
		
		btnClick(home.privacyPolicylink);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(home.homePage);
		
		scrollDown();
		
        btnClick(home.AWMH);
		
		windowsHandling();
   
	    btnClick(home.fifthMember);
	    waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.homePage);
				
		btnClick(home.tourDates);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(home.homePage);
		
		btnClick(home.photos);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(home.videos);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(home.instagram);
		
		windowsHandling();
        		
		btnClick(home.product);
		waitForPageToLoad(timeoutInSeconds);
		
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

