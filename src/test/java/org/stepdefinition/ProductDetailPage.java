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
	
	@When("User navigate to product detail page")
	public void user_navigate_to_product_detail_page() throws InterruptedException {
				
		performMoveToElement(home.metStore);
				
		btnClick(category.shopAll);
		Thread.sleep(2000);
		
		scroll();
		Thread.sleep(1000);   
	}

	@When("User choose the size variant")
	public void user_choose_the_size_variant() throws InterruptedException {
				
		btnClick(product.product);
		Thread.sleep(3000);
		
		btnClick(product.productSize);
		Thread.sleep(1000);

	}
	
	@When("User select the product quantity")
	public void user_select_the_product_quantity() throws InterruptedException {
				
		btnClick(product.productQty);
	    Thread.sleep(1000);

	}
	@When("User add the product to cart")
	public void user_add_the_product_to_cart() throws InterruptedException {
			    
	    btnClick(product.addTocart);
	    Thread.sleep(2000);
	    
	    btnClick(product.remove);
	    Thread.sleep(1000);
	    
	    toRefresh();
	}

	@When("User check the Einstein Product recommendations")
	public void user_check_the_Einstein_Product_recommendations() throws InterruptedException {
			    
		btnClick(product.nextSlide);
		Thread.sleep(3000);
		
		btnClick(product.previousSlide);
		Thread.sleep(1000);
				
	}

	@Then("User add the pre-order product to cart")
	public void user_add_the_pre_order_product_to_cart() throws AWTException, InterruptedException {
		
		scrollUp();
				
		btnClick(home.searchMenu);
	    Thread.sleep(2000);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "BLACKENED WHISKEY 72 SEASONS T-SHIRT");
		
		performEnter();
		
		Thread.sleep(2000);
		
		btnClick(product.productSize);
		Thread.sleep(1000);
		
		btnClick(product.addTocart);
		Thread.sleep(1000);
		
		btnClick(product.checkBox);
		Thread.sleep(1000);
		
		btnClick(product.preOrdercart);
		Thread.sleep(2000);
		
		Assert.assertTrue(product.cartQuantity.isDisplayed());
	    
	    System.out.println("Product Detail Page is verified");
	    toQuit();
	    
	}

}
