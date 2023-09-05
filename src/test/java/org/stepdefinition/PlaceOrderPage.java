package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.BillingPageElements;
import org.elements.HomePageElements;
import org.elements.PlaceOrderPageElements;
import org.elements.ProductDetailPageElements;
import org.elements.ShippingPageElements;
import org.elements.ShoppingCartPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderPage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	ProductDetailPageElements product=new ProductDetailPageElements();
	ShippingPageElements shipping=new ShippingPageElements();
	ShoppingCartPageElements shopping=new ShoppingCartPageElements();
	BillingPageElements billing=new BillingPageElements();
	PlaceOrderPageElements placeorder=new PlaceOrderPageElements();
	
	@When("User navigate to place order page")
	public void user_navigate_to_place_order_page() throws InterruptedException, AWTException {
		
		btnClick(home.searchMenu);
	    Thread.sleep(2000);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "72 SEASONS SILVER RING");
		Thread.sleep(1000);
		
		performEnter();
		
		Thread.sleep(2000);
				
		btnClick(shipping.ringSize);
		Thread.sleep(2000);
		
		btnClick(product.addTocart);
	    Thread.sleep(2000);
	    
	    btnClick(shopping.checkOut);
	    Thread.sleep(2000);
	    
	    fill(shopping.guestmail, "andrewroobanraaj@gmail.com");
		
		fill(shopping.cartPassword, "Metallica@2");
	   
		btnClick(shopping.userCheckout);
	    Thread.sleep(4000);

	    btnClick(shipping.continueTobilling);
	    Thread.sleep(2000);
	    
	    btnClick(shipping.keepOriginal);
	    Thread.sleep(2000);
	    
	    fill(billing.cardNumber, "4214 3602 2011 9592");
		
		fill(billing.securityCode, "098");
		
		fill(billing.nameOncard, "Andrew Rooban Raj S");
		
		billing.monthDropdown();
		
		billing.yearDropdown();
		
		btnClick(billing.billingSubmit);
		Thread.sleep(1000);
	    
	}

	@When("User click the edit cart link")
	public void user_click_the_edit_cart_link() throws InterruptedException {
		
		btnClick(placeorder.backTocart);
	    Thread.sleep(2000);
	    
	    btnClick(shipping.checkoutIncart);
	    Thread.sleep(3000);
	    
	    btnClick(shipping.continueTobilling);
	    Thread.sleep(2000);
	    
	    btnClick(shipping.keepOriginal);
	    Thread.sleep(2000);
	    
	    fill(billing.cardNumber, "4214 3602 2011 9592");
		
		fill(billing.securityCode, "098");
		
		fill(billing.nameOncard, "Andrew Rooban Raj S");
		
		billing.monthDropdown();
		
		billing.yearDropdown();
		
		btnClick(billing.saveCard);
		
		btnClick(billing.billingSubmit);
		Thread.sleep(1000);

	}

	@When("User click the edit button in payment and billing address fields")
	public void user_click_the_edit_button_in_payment_and_billing_address_fields() throws InterruptedException {
		
		btnClick(placeorder.editBillingaddress);
		Thread.sleep(1000);
		
		fill(billing.cardNumber, "4214 3602 2011 9592");
		
		fill(billing.securityCode, "098");
		
		fill(billing.nameOncard, "Andrew Rooban Raj S");
		
		billing.monthDropdown();
		
		billing.yearDropdown();
		
		btnClick(billing.saveCard);
		
		btnClick(billing.billingSubmit);
		Thread.sleep(1000);
		
		btnClick(placeorder.editPayment);
		
	    
	}
	
	@Then("User redirected to billing page to edit the payment and billing address")
	public void user_redirected_to_billing_page_to_edit_the_payment_and_billing_address() {
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the user is in Place Order Page", url.contains("https://www.metallica.com/billing/"));
		
		System.out.println("User is in Billing Page");
		
		toQuit();
		
	}



}
