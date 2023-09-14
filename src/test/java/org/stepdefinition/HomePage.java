package org.stepdefinition;

import org.base.BaseClass;
import org.elements.HomePageElements;
import org.elements.LoginElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	LoginElements login=new LoginElements();
	
	int timeoutInSeconds = 10;
	
	@When("User click the links from header\\/footer section")
	public void user_click_the_links_from_header_footer_section() throws InterruptedException {
		
		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.closeSearch);
		
		btnClick(login.profileIcon);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.toHomePage);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.metStore);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.homePage);
		
		scrollDown();
		
        btnClick(home.AWMH);
		
		windowsHandling();
		
		btnClick(home.fifthMember);
	    waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.homePage);
		
		btnClick(home.cartIcon);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.homePage);
		
		scrollDown();
		
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
	    
	}

	@Then("user directed to the appropriate pages")
	public void user_directed_to_the_appropriate_pages() {
	   
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the URL", url.contains("https://www.metallica.com/privacy-policy.html"));
		System.out.println("User is in Privacy Policy Page");
		toQuit();
		
	}
	
	@When("User click the icons\\/images\\/links")
	public void user_click_the_icons_images_links() throws InterruptedException {
	   
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
		
	}

	@Then("The icons\\/images\\/links are clickable and directed to the appropriate pages")
	public void the_icons_images_links_are_clickable_and_directed_to_the_appropriate_pages() {
	   
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the URL", url.contains("https://www.metallica.com/store/band-72-seasons-tracks-t-shirt/BAND72TRACKT.html"));
		System.out.println("User is in Product Page which is selected from Home page");
		toQuit();
		
	}

}

