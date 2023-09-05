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
	
	@When("User navigate to Met Store")
	public void user_navigate_to_Met_Store() throws InterruptedException {
		
		performMoveToElement(home.metStore);
			
		btnClick(category.shopAll);
		Thread.sleep(1000);
		
		scroll();
	    
	}

	@When("User click the product image")
	public void user_click_the_product_image() throws InterruptedException {
				
		btnClick(category.product);
		Thread.sleep(2000);
	    
	    btnClick(category.shop);
	    	
	}
	

	@When("User apply the filters in the left panel")
	public void user_apply_the_filters_in_the_left_panel() throws InterruptedException {
				
		btnClick(category.priceFilter);
	    Thread.sleep(2000);
	    btnClick(category.clearFilter);
		Thread.sleep(2000);
	    
	    btnClick(category.deptFilter);
	    Thread.sleep(2000);
	    btnClick(category.clearFilter);
	    Thread.sleep(2000);
	    
	    btnClick(category.sizeFilter);
	    Thread.sleep(2000);
	    btnClick(category.clearFilter);
	    Thread.sleep(2000);
	    
	    btnClick(category.featureFilter);
	    Thread.sleep(2000);
	    btnClick(category.clearFilter);
	    Thread.sleep(2000);
	    
	    btnClick(category.albumFilter);
	    Thread.sleep(3000);
	    btnClick(category.clearFilter);
	    Thread.sleep(2000);
	    
	    btnClick(category.artistFilter);
	    Thread.sleep(2000);
	    btnClick(category.clearFilter);
	    Thread.sleep(2000); 
	    
	}

	@When("User navigate to next page by clicking page numbers")
	public void user_navigate_to_next_page_by_clicking_page_numbers() throws InterruptedException {
		
		pageNoscroll();
		Thread.sleep(1000);

		btnClick(category.pageNo2);
		Thread.sleep(1000);

		pageNoscroll();
		Thread.sleep(1000);

		btnClick(category.pageNo3);
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		pageNoscroll();
	    
	}

	@Then("User click the view all link")
	public void user_click_the_view_all_link() throws InterruptedException {
		
		btnClick(category.viewAll);
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertTrue("To check user is in products view all page", url.contains("https://www.metallica.com/store/?viewAll=true"));
		
		System.out.println("All the products are displayed in a Single Page");
		toQuit();
	    
	}

}
