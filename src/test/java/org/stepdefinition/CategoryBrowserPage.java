package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.CategoryBrowserPagePojo;
import org.pojo.HomePagePojo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryBrowserPage extends BaseClass{
	
	HomePagePojo h=new HomePagePojo();
	CategoryBrowserPagePojo c=new CategoryBrowserPagePojo();
	
	@When("User navigate to Met Store")
	public void user_navigate_to_Met_Store() throws InterruptedException {
		
		performMoveToElement(h.getMetStore());
			
		btnClick(c.getShopAll());
		Thread.sleep(1000);
		
		scroll();
	    
	}

	@When("User click the product image")
	public void user_click_the_product_image() {
				
		btnClick(c.getProduct());
	    
	    btnClick(c.getShop());
	    	
	}
	

	@When("User apply the filters in the left panel")
	public void user_apply_the_filters_in_the_left_panel() throws InterruptedException {
				
		btnClick(c.getPriceFilter());
	    Thread.sleep(2000);
	    btnClick(c.getClearFilter());
		Thread.sleep(2000);
	    
	    btnClick(c.getDeptFilter());
	    Thread.sleep(2000);
	    btnClick(c.getClearFilter());
	    Thread.sleep(2000);
	    
	    btnClick(c.getSizeFilter());
	    Thread.sleep(2000);
	    btnClick(c.getClearFilter());
	    Thread.sleep(2000);
	    
	    btnClick(c.getFeatureFilter());
	    Thread.sleep(2000);
	    btnClick(c.getClearFilter());
	    Thread.sleep(2000);
	    
	    btnClick(c.getAlbumFilter());
	    Thread.sleep(3000);
	    btnClick(c.getClearFilter());
	    Thread.sleep(2000);
	    
	    btnClick(c.getArtistFilter());
	    Thread.sleep(2000);
	    btnClick(c.getClearFilter());
	    Thread.sleep(2000); 
	    
	}

	@When("User navigate to next page by clicking page numbers")
	public void user_navigate_to_next_page_by_clicking_page_numbers() throws InterruptedException {
		
		pageNoscroll();
		Thread.sleep(1000);

		btnClick(c.getPageNo2());

		pageNoscroll();
		Thread.sleep(1000);

		btnClick(c.getPageNo3());
		
		Thread.sleep(1000);
		pageNoscroll();
	    
	}

	@Then("User click the view all link")
	public void user_click_the_view_all_link() throws InterruptedException {
		
		btnClick(c.getViewAll());
		Thread.sleep(2000);
		System.out.println("Category Browser Page : DONE");
		toQuit();
	    
	}

}
