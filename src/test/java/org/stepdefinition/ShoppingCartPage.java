package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.CategoryBrowserPageElements;
import org.elements.HomePageElements;
import org.elements.LoginElements;
import org.elements.ProductDetailPageElements;
import org.elements.ShoppingCartPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartPage extends BaseClass{
	
	 HomePageElements home=new HomePageElements();
	 CategoryBrowserPageElements category=new CategoryBrowserPageElements();
	 ProductDetailPageElements product=new ProductDetailPageElements();
	 ShoppingCartPageElements shopping=new ShoppingCartPageElements();
	 LoginElements login=new LoginElements();


	 
	@When("User add some products to cart")
	public void user_add_some_products_to_cart() throws InterruptedException {
		
		performMoveToElement(home.metStore);
		
		btnClick(category.shopAll);
		Thread.sleep(1000);
		
		scroll();
		
		btnClick(product.product);
		Thread.sleep(3000);
		
		btnClick(product.productSize);
		Thread.sleep(1000);
		
		btnClick(product.addTocart);
	    Thread.sleep(2000);
	   	    
	    btnClick(shopping.closeCart);
	    
		btnClick(category.shop);
		
		scroll();
		
		btnClick(shopping.secondProduct);
		
		btnClick(shopping.productSize);
		Thread.sleep(1000);
		
		btnClick(product.addTocart);
	    Thread.sleep(2000);
	    
	    btnClick(shopping.checkOut);
	    
	}

	@When("User change the product quantity")
	public void user_change_the_product_quantity() throws InterruptedException {
		
		btnClick(shopping.productQty);
	    Thread.sleep(2000);
	    
	    btnClick(shopping.productQty2);
	    Thread.sleep(2000);
	   
	}

	@When("User navigate to PDP by clicking product link")
	public void user_navigate_to_PDP_by_clicking_product_link() throws InterruptedException {
		
		btnClick(shopping.toPDP);
		Thread.sleep(3000);
	   
	}

	@When("User remove the product from cart")
	public void user_remove_the_product_from_cart() throws InterruptedException {
		
		btnClick(home.cartIcon);
	    Thread.sleep(2000);
	    
	    btnClick(shopping.checkOut);
	    Thread.sleep(2000);
	    
	    btnClick(shopping.removeCart);
	    Thread.sleep(2000);

	}

	@Then("User checkout as a guest")
	public void user_checkout_as_a_guest() throws InterruptedException {
		
		btnClick(shopping.guestRadio);
		
	    fill(shopping.guestmail, "sampletestmail@gmail.com");

	    btnClick(shopping.guestCheckout);
	    Thread.sleep(2000);

	    btnClick(shopping.backToCart);
	    Thread.sleep(2000);
	    
	}

	@Then("User login in cart page and checkout")
	public void user_login_in_cart_page_and_checkout() {
		
		fieldClear(shopping.guestmail);
		
		fill(shopping.guestmail, "andrewroobanraaj@gmail.com");
		
		fill(shopping.cartPassword, "Metallica@2");
	   
		btnClick(shopping.userCheckout);	
		
	    btnClick(shopping.backToCart);

		
	}

	@Then("User logout and login again to check the cart products")
	public void user_logout_and_login_again_to_check_the_cart_products() throws InterruptedException, AWTException {
		
		
		btnClick(login.profileIcon);
	    Thread.sleep(2000);
	    
	    btnClick(login.logoutButton);
	    
	    fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		Thread.sleep(2000);
		
		btnClick(login.loginButton);
		
		btnClick(home.cartIcon);
	    Thread.sleep(2000);
	    
	    Assert.assertTrue(product.cartQuantity.isDisplayed());
	   
	    System.out.println("The Product is in Cart after Logout and Login the Account");
	    
	    toQuit();		
	    
	}
	

}
