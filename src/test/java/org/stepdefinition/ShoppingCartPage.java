package org.stepdefinition;

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
	 
	 int timeoutInSeconds = 10;


	 
	@When("User add some products to cart")
	public void user_add_some_products_to_cart()  {
		
		performMoveToElement(home.metStore);
		
		btnClick(category.shopAll);
		waitForPageToLoad(timeoutInSeconds);
		
		scroll();
		
		btnClick(product.product);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);
	   	    
	    btnClick(shopping.closeCart);
	    
		btnClick(category.shop);
		waitForPageToLoad(timeoutInSeconds);
		
		scroll();
		
		btnClick(shopping.secondProduct);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(shopping.productSize);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shopping.checkOut);
	    waitForPageToLoad(timeoutInSeconds);
	    
	}

	@When("User change the product quantity")
	public void user_change_the_product_quantity()  {
		
		btnClick(shopping.productQty);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shopping.productQty2);
	    waitForPageToLoad(timeoutInSeconds);
	   
	}

	@When("User navigate to PDP by clicking product link")
	public void user_navigate_to_PDP_by_clicking_product_link()  {
		
		btnClick(shopping.toPDP);
		waitForPageToLoad(timeoutInSeconds);
	   
	}

	@When("User remove the product from cart")
	public void user_remove_the_product_from_cart()  {
		
		btnClick(home.cartIcon);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shopping.checkOut);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shopping.removeCart);
	    waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User checkout as a guest")
	public void user_checkout_as_a_guest() {
		
		btnClick(shopping.guestRadio);
		
	    fill(shopping.guestmail, "sampletestmail@gmail.com");

	    btnClick(shopping.guestCheckout);
	    waitForPageToLoad(timeoutInSeconds);

	    btnClick(shopping.backToCart);
	    waitForPageToLoad(timeoutInSeconds);
	    
	}

	@Then("User login in cart page and checkout")
	public void user_login_in_cart_page_and_checkout() {
		
		fieldClear(shopping.guestmail);
		
		fill(shopping.guestmail, "andrewroobanraaj@gmail.com");
		
		fill(shopping.cartPassword, "Metallica@2");
	   
		btnClick(shopping.userCheckout);
		waitForPageToLoad(timeoutInSeconds);
		
	    btnClick(shopping.backToCart);
	    waitForPageToLoad(timeoutInSeconds);

		
	}

	@Then("User logout and login again to check the cart products")
	public void user_logout_and_login_again_to_check_the_cart_products() {
		
		
		btnClick(login.profileIcon);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(login.logoutButton);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(login.loginButton);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(home.cartIcon);
		waitForPageToLoad(timeoutInSeconds);
	    
	    Assert.assertTrue(product.cartQuantity.isDisplayed());
	   
	    System.out.println("The Product is in Cart after Logout and Login the Account");
	    
	    toQuit();		
	    
	}
	

}
