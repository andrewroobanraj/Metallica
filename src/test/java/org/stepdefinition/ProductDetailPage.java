package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojo.CategoryBrowserPagePojo;
import org.pojo.HomePagePojo;
import org.pojo.ProductDetailPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailPage extends BaseClass{
	
	HomePagePojo h=new HomePagePojo();
	CategoryBrowserPagePojo c=new CategoryBrowserPagePojo();
	ProductDetailPagePojo p=new ProductDetailPagePojo();
	
	@When("User navigate to product detail page")
	public void user_navigate_to_product_detail_page() throws InterruptedException {
				
		performMoveToElement(h.getMetStore());
				
		btnClick(c.getShopAll());
		Thread.sleep(2000);
		
		scroll();
		Thread.sleep(1000);   
	}

	@When("User choose the size variant")
	public void user_choose_the_size_variant() throws InterruptedException {
				
		btnClick(p.getProduct());
		Thread.sleep(3000);
		
		btnClick(p.getProductSize());
		Thread.sleep(1000);

	}
	
	@When("User select the product quantity")
	public void user_select_the_product_quantity() throws InterruptedException {
				
		btnClick(p.getProductQty());
	    Thread.sleep(1000);

	}
	@When("User add the product to cart")
	public void user_add_the_product_to_cart() throws InterruptedException {
			    
	    btnClick(p.getAddTocart());
	    Thread.sleep(2000);
	    
	    btnClick(p.getRemove());
	    Thread.sleep(1000);
	    
	    toRefresh();
	}

	@When("User check the Einstein Product recommendations")
	public void user_check_the_Einstein_Product_recommendations() throws InterruptedException {
			    
		btnClick(p.getNextSlide());
		Thread.sleep(3000);
		
		btnClick(p.getPreviousSlide());
		Thread.sleep(1000);
				
	}

	@Then("User add the pre-order product to cart")
	public void user_add_the_pre_order_product_to_cart() throws AWTException, InterruptedException {
		
		scrollUp();
				
		btnClick(h.getSearchMenu());
	    Thread.sleep(2000);
	    		
		btnClick(p.getSearch());
		
		fill(p.getEnterText(), "BLACKENED WHISKEY 72 SEASONS T-SHIRT");
		
		performEnter();
		
		Thread.sleep(2000);
		
		btnClick(p.getProductSize());
		Thread.sleep(1000);
		
		btnClick(p.getAddTocart());
		Thread.sleep(1000);
		
		btnClick(p.getCheckBox());
		Thread.sleep(1000);
		
		btnClick(p.getPreOrdercart());
		Thread.sleep(2000);
		
		btnClick(p.getRemove());
	    Thread.sleep(1000);
	    
	    System.out.println("Product Detail Page - Done");
	    toQuit();
	    
	}

}
