package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.BillingPageElements;
import org.elements.HomePageElements;
import org.elements.ProductDetailPageElements;
import org.elements.ShippingPageElements;
import org.elements.ShoppingCartPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingPage extends BaseClass {
	
	HomePageElements home=new HomePageElements();
	ProductDetailPageElements product=new ProductDetailPageElements();
	ShippingPageElements shipping=new ShippingPageElements();
	ShoppingCartPageElements shopping=new ShoppingCartPageElements();
	BillingPageElements billing=new BillingPageElements();

	@When("User navigate to billing page")
	public void user_navigate_to_billing_page() throws InterruptedException, AWTException {
    
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

	}
	
	@When("User click review order button without filling the mandatory fields")
	public void User_click_review_order_button_without_filling_the_mandatory_fields() throws InterruptedException {
		
		btnClick(billing.billingSubmit);
	    Thread.sleep(2000);
		
	}

	@When("User click the Paypal button")
	public void user_click_the_Paypal_button() throws InterruptedException {
		
		btnClick(billing.paypal);
	    Thread.sleep(2000);

    
	}

	@When("User click the Edit button in SubTotal and Shipping address field")
	public void user_click_the_Edit_button_in_SubTotal_and_Shipping_address_field() throws InterruptedException {
		
		btnClick(billing.editSubtotal);
	    Thread.sleep(4000);
	    
	    btnClick(shipping.continueTobilling);
	    Thread.sleep(2000);
	    
	    btnClick(shipping.keepOriginal);
	    Thread.sleep(2000);
	    
	    btnClick(billing.editShipping);
	    Thread.sleep(4000);
	    
	    btnClick(shipping.continueTobilling);
	    Thread.sleep(2000);
	    
	    btnClick(shipping.keepOriginal);
	    Thread.sleep(2000);
	   
	}

	@When("User select the non taxable address from saved address dropdown")
	public void user_select_the_non_taxable_address_from_saved_address_dropdown() throws InterruptedException {
		
		btnClick(billing.shippingPage);
	    Thread.sleep(2000);
	    
	    billing.addressDropdown();
	    Thread.sleep(4000);
	    
	    btnClick(shipping.continueTobilling);
	    Thread.sleep(2000);
	    
	    btnClick(billing.keepOrg2);
	    
	    String tax = billing.taxRate.getText();
	    System.out.println("Tax Rate for Non-Taxable address: " +tax);
    
	}

	@When("User enter card details")
	public void user_enter_card_details() {
		
		fill(billing.cardNumber, "4214 3602 2011 9592");
		
		fill(billing.securityCode, "098");
		
		fill(billing.nameOncard, "Andrew Rooban Raj S");
		
		billing.monthDropdown();
		
		billing.yearDropdown();
    
	}

	@When("User validate the saved this card, add a gift and shipping address checkbox")
	public void user_validate_the_saved_this_card_add_a_gift_and_shipping_address_checkbox() throws InterruptedException {
                        
		btnClick(billing.saveCard);
		Thread.sleep(1000);
		
		btnClick(billing.addGift);
		Thread.sleep(1000);

		btnClick(billing.addGift);
		Thread.sleep(1000);
		
		btnClick(billing.shippingAddress);
		Thread.sleep(1000);
		
		btnClick(billing.shippingAddress);
		Thread.sleep(1000);
		
	}

	@Then("User click the Review Order button")
	public void user_click_the_Review_Order_button() {
    
		btnClick(billing.billingSubmit);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the user is in Place Order Page", url.contains("https://www.metallica.com/placeorder/"));
		System.out.println("After click the Review Order button User is in Place Order Page");
		
		toQuit();
		
	}


}
