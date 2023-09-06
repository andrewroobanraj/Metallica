package org.stepdefinition;

import org.base.BaseClass;
import org.elements.CategoryBrowserPageElements;
import org.elements.HomePageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryBrowserPage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	CategoryBrowserPageElements category=new CategoryBrowserPageElements();
	
	int timeoutInSeconds = 10;
	
	@When("User navigate to Met Store")
	public void user_navigate_to_Met_Store()  {
		
		performMoveToElement(home.metStore);
			
		btnClick(category.shopAll);
		
		scroll();
	    
	}

	@When("User click the product image")
	public void user_click_the_product_image() throws InterruptedException  {
				
		btnClick(category.product);
		
	    waitForPageToLoad(timeoutInSeconds);
		btnClick(category.shop);
	    	
	}
	

	@When("User apply the filters in the left panel")
	public void user_apply_the_filters_in_the_left_panel() throws InterruptedException  {
				
		btnClick(category.priceFilter);
		
		waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.clearFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.deptFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.clearFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);	    
	    btnClick(category.sizeFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.clearFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.featureFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.clearFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.albumFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.clearFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.artistFilter);
	    
	    waitForPageToLoad(timeoutInSeconds);
	    btnClick(category.clearFilter);

	    
	}

	@When("User navigate to next page by clicking page numbers")
	public void user_navigate_to_next_page_by_clicking_page_numbers() throws InterruptedException  {
		
		pageNoscroll();
		
		waitForPageToLoad(timeoutInSeconds);
		btnClick(category.pageNo2);
		
		pageNoscroll();
		
		waitForPageToLoad(timeoutInSeconds);
		btnClick(category.pageNo3);
		
		pageNoscroll();
		waitForPageToLoad(timeoutInSeconds);
	    
	}

	@Then("User click the view all link")
	public void user_click_the_view_all_link() throws InterruptedException  {
		
		btnClick(category.viewAll);
		waitForPageToLoad(timeoutInSeconds);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertTrue(url.contains("https://www.metallica.com/store/?viewAll=true"));
		
		System.out.println("All the products are displayed in a Single Page");
		
		toQuit();
	    
	}

}
