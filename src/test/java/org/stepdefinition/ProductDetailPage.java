package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.CategoryBrowserPageElements;
import org.elements.HomePageElements;
import org.elements.ProductDetailPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailPage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	CategoryBrowserPageElements category=new CategoryBrowserPageElements();
	ProductDetailPageElements product=new ProductDetailPageElements();
	
	int timeoutInSeconds = 10;
	
	@When("User navigate to product detail page")
	public void user_navigate_to_product_detail_page() {
				
		performMoveToElement(home.metStore);
				
		btnClick(category.shopAll);
		waitForPageToLoad(timeoutInSeconds);
		
		scroll();
		waitForPageToLoad(timeoutInSeconds);   
	}

	@When("User choose the size variant")
	public void user_choose_the_size_variant()  {
				
		btnClick(product.product);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);

	}
	
	@When("User select the product quantity")
	public void user_select_the_product_quantity()  {
				
		btnClick(product.productQty);
		waitForPageToLoad(timeoutInSeconds);

	}
	@When("User add the product to cart")
	public void user_add_the_product_to_cart()  {
			    
	    btnClick(product.addTocart);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(product.remove);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    toRefresh();
	}

	@When("User check the Einstein Product recommendations")
	public void user_check_the_Einstein_Product_recommendations() {
			    
		btnClick(product.nextSlide);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.previousSlide);
		waitForPageToLoad(timeoutInSeconds);
				
	}

	@Then("User add the pre-order product to cart")
	public void user_add_the_pre_order_product_to_cart() throws AWTException {
		
		scrollUp();
				
		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "LIVE METALLICA: EAST RUTHERFORD, NJ - AUGUST 6, 2023 (2CD)");
		
		performEnter();
		
		waitForPageToLoad(timeoutInSeconds);
		
		//btnClick(product.productSize);
		//waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.checkBox);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.preOrdercart);
		waitForPageToLoad(timeoutInSeconds);
		
		Assert.assertTrue(product.cartQuantity.isDisplayed());
	    
	    System.out.println("Product Detail Page is verified");
	    toQuit();
	    
	}

}
