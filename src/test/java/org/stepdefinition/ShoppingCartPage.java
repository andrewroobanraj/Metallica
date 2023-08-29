package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojo.CategoryBrowserPagePojo;
import org.pojo.HomePagePojo;
import org.pojo.LoginPojo;
import org.pojo.ProductDetailPagePojo;
import org.pojo.ShoppingCartPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartPage extends BaseClass{
	
	 HomePagePojo h=new HomePagePojo();
	 CategoryBrowserPagePojo c=new CategoryBrowserPagePojo();
	 ProductDetailPagePojo p=new ProductDetailPagePojo();
	 ShoppingCartPagePojo s=new ShoppingCartPagePojo();
	 LoginPojo l=new LoginPojo();


	 
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
	    
		btnClick(c.getShop());
		
		scroll();
		
		btnClick(s.getSecondProduct());
		
		btnClick(s.getProductSize());
		Thread.sleep(1000);
		
		btnClick(p.getAddTocart());
	    Thread.sleep(2000);
	    
	    btnClick(s.getCheckOut());
	    
	}

	@When("User change the product quantity")
	public void user_change_the_product_quantity() throws InterruptedException {
		
		btnClick(s.getProductQty());
	    Thread.sleep(2000);
	    
	    btnClick(s.getProductQty2());
	    Thread.sleep(2000);
	   
	}

	@When("User navigate to PDP by clicking product link")
	public void user_navigate_to_PDP_by_clicking_product_link() throws InterruptedException {
		
		btnClick(s.getToPDP());
		Thread.sleep(3000);
	   
	}

	@When("User remove the product from cart")
	public void user_remove_the_product_from_cart() throws InterruptedException {
		
		btnClick(h.getCartIcon());
	    Thread.sleep(2000);
	    
	    btnClick(s.getCheckOut());
	    Thread.sleep(2000);
	    
	    btnClick(s.getRemoveCart());
	    Thread.sleep(2000);

	}

	@Then("User checkout as a guest")
	public void user_checkout_as_a_guest() throws InterruptedException {
		
		btnClick(s.getGuestRadio());
		
	    fill(s.getGuestmail(), "sampletestmail@gmail.com");

	    btnClick(s.getGuestCheckout());
	    Thread.sleep(2000);

	    btnClick(s.getBackToCart());
	    Thread.sleep(2000);
	    
	}

	@Then("User login in cart page and checkout")
	public void user_login_in_cart_page_and_checkout() {
		
		fieldClear(s.getGuestmail());
		
		fill(s.getGuestmail(), "andrewroobanraaj@gmail.com");
		
		fill(s.getCartPassword(), "Metallica@2");
	   
		btnClick(s.getUserCheckout());	
		
	    btnClick(s.getBackToCart());

		
	}

	@Then("User logout and login again to check the cart products")
	public void user_logout_and_login_again_to_check_the_cart_products() throws InterruptedException, AWTException {
		
		
		btnClick(l.getProfileIcon());
	    Thread.sleep(2000);
	    
	    btnClick(l.getLogoutButton());
	    
	    fill(l.getUserName(), "andrewroobanraaj@gmail.com");
		fill(l.getPassword(), "Metallica@2");
		Thread.sleep(2000);
		
		btnClick(l.getLoginButton());
		
		btnClick(h.getCartIcon());
		
	    Thread.sleep(2000);
	    
	    toQuit();		
	    
	}
	

}
