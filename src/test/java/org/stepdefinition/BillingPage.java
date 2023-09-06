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
	
	int timeoutInSeconds = 10;

	@When("User navigate to billing page")
	public void user_navigate_to_billing_page() throws AWTException, InterruptedException {
    
		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "72 SEASONS SILVER RING");
		waitForPageToLoad(timeoutInSeconds);
		
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
		Thread.sleep(3000);

	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shipping.keepOriginal);
	    waitForPageToLoad(timeoutInSeconds);

	}
	
	@When("User click review order button without filling the mandatory fields")
	public void User_click_review_order_button_without_filling_the_mandatory_fields()  {
		
		btnClick(billing.billingSubmit);
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@When("User click the Paypal button")
	public void user_click_the_Paypal_button()  {
		
		btnClick(billing.paypal);
		waitForPageToLoad(timeoutInSeconds);

    
	}

	@When("User click the Edit button in SubTotal and Shipping address field")
	public void user_click_the_Edit_button_in_SubTotal_and_Shipping_address_field()  {
		
		btnClick(billing.editSubtotal);
		waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shipping.keepOriginal);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(billing.editShipping);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(shipping.keepOriginal);
	    waitForPageToLoad(timeoutInSeconds);
	   
	}

	@When("User select the non taxable address from saved address dropdown")
	public void user_select_the_non_taxable_address_from_saved_address_dropdown() throws InterruptedException {
		
		btnClick(billing.shippingPage);
		waitForPageToLoad(timeoutInSeconds);
	    
	    billing.addressDropdown();
	    Thread.sleep(3000);
	    
	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    btnClick(billing.keepOrg2);
	    waitForPageToLoad(timeoutInSeconds);
	    
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
	public void user_validate_the_saved_this_card_add_a_gift_and_shipping_address_checkbox()  {
                        
		btnClick(billing.saveCard);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(billing.addGift);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(billing.addGift);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(billing.shippingAddress);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(billing.shippingAddress);
		waitForPageToLoad(timeoutInSeconds);
		
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
