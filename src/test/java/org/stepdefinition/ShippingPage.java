package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.HomePageElements;
import org.elements.ProductDetailPageElements;
import org.elements.ShippingPageElements;
import org.elements.ShoppingCartPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingPage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	ProductDetailPageElements product=new ProductDetailPageElements();
	ShippingPageElements shipping=new ShippingPageElements();
	ShoppingCartPageElements shopping=new ShoppingCartPageElements();
	
	int timeoutInSeconds = 10;

	
	@When("User navigate to shipping page")
	public void user_navigate_to_shipping_page() throws AWTException {
		
		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "72 SEASONS SILVER RING");
		
		performEnter();
		
		waitForPageToLoad(timeoutInSeconds);
				
		btnClick(shipping.ringSize);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shopping.checkOut);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    fill(shopping.guestmail, "andrewroobanraaj@gmail.com");
		
		fill(shopping.cartPassword, "Metallica@2");
	   
		btnClick(shopping.userCheckout);
		waitForPageToLoad(timeoutInSeconds);
	    
	}

	@When("User validate the mandatory fields")
	public void user_validate_the_mandatory_fields() {
		
		fieldClear(shipping.firstName);
	    fieldClear(shipping.lastName);
	    fieldClear(shipping.address1);
	    fieldClear(shipping.city);
	    fieldClear(shipping.zipCode);
	    fieldClear(shipping.phone);
	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	}

	@When("User validate the shipping address fields")
	public void user_validate_the_shipping_address_fields() {
		
		fill(shipping.city, "abcdefgh");
		fill(shipping.zipCode, "12AB3");
		btnClick(shipping.continueTobilling);		
		waitForPageToLoad(timeoutInSeconds);
	   
	}

	@When("User select address from saved address dropdown")
	public void user_select_address_from_saved_address_dropdown()  {
		
		fieldClear(shipping.city);
		fieldClear(shipping.zipCode);
		
		shipping.addressDropdown();
		   
	}

	@When("User click the Use this address checkbox")
	public void user_click_the_Use_this_address_checkbox() {
		
		btnClick(shipping.addressCheckbox);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(shipping.addressCheckbox);
		waitForPageToLoad(timeoutInSeconds);
	    
	}

	@When("User click the Is this a Gift checkbox")
	public void user_click_the_Is_this_a_Gift_checkbox() throws InterruptedException  {
	    
		btnClick(shipping.giftCheckbox);
		
		fill(shipping.giftMessage, "Hii Buddy");
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(shipping.giftCheckbox);
		Thread.sleep(5000);
		
	}

	@Then("User select the Shipping Method")
	public void user_select_the_Shipping_Method() {
		
		Assert.assertTrue("ship method for normal product", shipping.shipMethodlabel1.isDisplayed());
		
		btnClick(shipping.shippingMethod);
		waitForPageToLoad(timeoutInSeconds);
	   
	}

	@Then("User check shipping method label for Pre Order product")
	public void user_check_shipping_method_label_for_Pre_Order_product() throws AWTException, InterruptedException {
		
		scrollUp();
		
		btnClick(shopping.backToCart);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(shopping.removeCart);
		waitForPageToLoad(timeoutInSeconds);
	   
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
		
		btnClick(shipping.preOrdercheckOut);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(shipping.checkoutIncart);
		Thread.sleep(5000);
	
		Assert.assertTrue("Shipping Method for Pre-Order", shipping.shipMethodlabel.isDisplayed());
		
	}

	@Then("User click the Continue to billing button")
	public void user_click_the_Continue_to_billing_button()  {
	   
		
	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shipping.keepOriginal);
	    
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("To Check the url", url.contains("https://www.metallica.com/billing/"));
	    
	    System.out.println("After click the Continue to Billing button User is in Billing Page");

	    toQuit();
		
	}

}
