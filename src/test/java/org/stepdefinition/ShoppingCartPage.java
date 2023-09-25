package org.stepdefinition;

import org.base.BaseClass;
import org.elements.CategoryBrowserPageElements;
import org.elements.HomePageElements;
import org.elements.LoginElements;
import org.elements.ProductDetailPageElements;
import org.elements.ShoppingCartPageElements;
import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartPage extends BaseClass {

	HomePageElements home = new HomePageElements();
	CategoryBrowserPageElements category = new CategoryBrowserPageElements();
	ProductDetailPageElements product = new ProductDetailPageElements();
	ShoppingCartPageElements shopping = new ShoppingCartPageElements();
	LoginElements login = new LoginElements();

	int timeoutInSeconds = 10;

	@When("User add few items to cart")
	public void user_add_few_items_to_cart() {

		performMoveToElement(home.metStore);

		btnClick(category.shopAll);
		waitForPageToLoad(timeoutInSeconds);

		scrollToProducts();

		btnClick(product.product);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(shopping.closeCart);

		btnClick(category.shop);
		waitForPageToLoad(timeoutInSeconds);

		scrollToProducts();

		btnClick(shopping.secondProduct);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(shopping.productSize);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);

	}

	@When("User navigate to cart page")
	public void user_navigate_to_cart_page() {

		btnClick(shopping.checkOut);
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User see all items and their totals")
	public void user_see_all_items_and_their_totals() {
		
		Assert.assertTrue(shopping.product1Cart.isDisplayed());
		Assert.assertTrue(shopping.product2Cart.isDisplayed());
		System.out.println("Added Products are displayed in the cart page");
		
		Assert.assertTrue(shopping.subTotal.isDisplayed());
		System.out.println("The Sub Total of cart items is Displayed");
		
		toClose();
		
	}

	@When("User add an item to cart")
	public void user_add_an_item_to_cart() {

		performMoveToElement(home.metStore);

		btnClick(category.shopAll);
		waitForPageToLoad(timeoutInSeconds);

		scrollToProducts();

		btnClick(product.product);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User change the product quantity")
	public void user_change_the_product_quantity() {

		btnClick(shopping.productQty);
		waitForPageToLoad(timeoutInSeconds);
		
		Assert.assertTrue(shopping.cartQty.isDisplayed());
		System.out.println("The Product Quantity is added");
		
		toClose();

	}
	
	@Then("User click on remove link below product name")
	public void user_click_on_remove_link_below_product_name() {
		
		btnClick(shopping.removeCart);
		waitForPageToLoad(timeoutInSeconds);
		
		Assert.assertTrue(shopping.cartEmpty.isDisplayed());
		System.out.println("The Product is Removed from Cart");
		
		toClose();
		
	}

	@Then("User click the product link")
	public void user_click_the_product_link() {
		
		btnClick(shopping.product1Cart);
		waitForPageToLoad(timeoutInSeconds);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/store/m-logo-72-seasons-tracks-t-shirts/M72TITLES.html?cgid=store"));
		System.out.println("User is navigated to PDP from cart page");
		
		toClose();

	}
	
	@When("User select the Checkout as Guest radio button")
	public void user_select_the_Checkout_as_Guest_radio_button() {
		
		btnClick(shopping.guestRadio);
		
	}
	
	@Then("User click the Checkout button")
	public void user_click_the_Checkout_button() {
		
		fill(shopping.guestmail, "sampletestmail@gmail.com");

		btnClick(shopping.guestCheckout);
		waitForPageToLoad(timeoutInSeconds);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/shipping/"));
		System.out.println("User is able to Checkout as a Guest user");
		
		toClose();
	    
	}
	
	@When("User enter the Registered email address and password")
	public void user_enter_the_Registered_email_address_and_password() {

		fill(shopping.guestmail, "andrewroobanraaj@gmail.com");

		fill(shopping.cartPassword, "Metallica@2");

		btnClick(shopping.userCheckout);
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@Then("User Login from Cart page")
	public void user_Login_from_Cart_page() {
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/shipping/"));
		System.out.println("User is able to Login from Cart Page");
		
		toClose();
		
	}
	
	
	@When("User logout the account and again login")
	public void user_logout_the_account_and_again_login() {
		
		btnClick(shopping.backToCart);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(login.profileIcon);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(login.logoutButton);
		waitForPageToLoad(timeoutInSeconds);

		fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");
		waitForPageToLoad(timeoutInSeconds);

		btnClick(login.loginButton);
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@Then("User see the items remains same in the cart page")
	public void user_see_the_items_remains_same_in_the_cart_page() {
		
		btnClick(home.cartIcon);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(product.cartQuantity.isDisplayed());

		System.out.println("The Product is in Cart after Logout and Login the Account");

		toQuit();
		
	}

	

	

	

}
