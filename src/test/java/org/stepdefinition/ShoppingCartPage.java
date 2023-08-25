package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.CategoryBrowserPagePojo;
import org.pojo.HomePagePojo;
import org.pojo.ProductDetailPagePojo;
import org.pojo.ShoppingCartPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartPage extends BaseClass{
	
	 HomePagePojo h=new HomePagePojo();
	 CategoryBrowserPagePojo c=new CategoryBrowserPagePojo();
	 ProductDetailPagePojo p=new ProductDetailPagePojo();
	 ShoppingCartPagePojo s=new ShoppingCartPagePojo();

	 
	@When("User add some products to cart")
	public void user_add_some_products_to_cart() throws InterruptedException {
		
		performMoveToElement(h.getMetStore());
		
		btnClick(c.getShopAll());
		Thread.sleep(1000);
		
		scroll();
		
		btnClick(p.getProduct());
		Thread.sleep(3000);
		
		btnClick(p.getProductSize());
		Thread.sleep(1000);
		
		btnClick(p.getAddTocart());
	    Thread.sleep(2000);
	   	    
	    btnClick(s.getCloseCart());
	    
	    scrollUp();
		
		btnClick(c.getShop());
		
		scroll();
		
		btnClick(s.getSecondProduct());
		
		btnClick(s.getProductSize());
		Thread.sleep(1000);
		
		btnClick(p.getAddTocart());
	    Thread.sleep(2000);
	    
	    btnClick(s.getCloseCart());
	    
	}

	@When("User change the product quantity")
	public void user_change_the_product_quantity() {
	   
	}

	@When("User navigate to PDP by clicking product link")
	public void user_navigate_to_PDP_by_clicking_product_link() {
	   
	}

	@When("User remove the product from cart")
	public void user_remove_the_product_from_cart() {
	   
	}

	@When("User apply and remove the coupon codes")
	public void user_apply_and_remove_the_coupon_codes() {
	   
	}

	@Then("User checkout as a guest")
	public void user_checkout_as_a_guest() {
	    
	}

	@Then("User login in cart page and checkout")
	public void user_login_in_cart_page_and_checkout() {
	   
	}

	@Then("User close the site and login again to check the cart products")
	public void user_close_the_site_and_login_again_to_check_the_cart_products() {
		
		System.out.println("Shopping Cart Page : DONE");
		toQuit();
	    
	}
	

}
