package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojo.BillingPagePojo;
import org.pojo.HomePagePojo;
import org.pojo.ProductDetailPagePojo;
import org.pojo.ShippingPagePojo;
import org.pojo.ShoppingCartPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingPage extends BaseClass {
	
	HomePagePojo h=new HomePagePojo();
	ProductDetailPagePojo p=new ProductDetailPagePojo();
	ShippingPagePojo sp=new ShippingPagePojo();
	ShoppingCartPagePojo s=new ShoppingCartPagePojo();
	BillingPagePojo b=new BillingPagePojo();

	@When("User navigate to billing page")
	public void user_navigate_to_billing_page() throws InterruptedException, AWTException {
    
		btnClick(h.getSearchMenu());
	    Thread.sleep(2000);
	    		
		btnClick(p.getSearch());
		
		fill(p.getEnterText(), "72 SEASONS SILVER RING");
		Thread.sleep(1000);
		
		performEnter();
		
		Thread.sleep(2000);
				
		btnClick(sp.getRingSize());
		Thread.sleep(2000);
		
		btnClick(p.getAddTocart());
	    Thread.sleep(2000);
	    
	    btnClick(s.getCheckOut());
	    Thread.sleep(2000);
	    
	    fill(s.getGuestmail(), "andrewroobanraaj@gmail.com");
		
		fill(s.getCartPassword(), "Metallica@2");
	   
		btnClick(s.getUserCheckout());
	    Thread.sleep(4000);

	    btnClick(sp.getContinueTobilling());
	    Thread.sleep(2000);
	    
	    btnClick(sp.getKeepOriginal());
	    Thread.sleep(2000);

	}
	
	@When("User click review order button without filling the mandatory fields")
	public void User_click_review_order_button_without_filling_the_mandatory_fields() throws InterruptedException {
		
		btnClick(b.getBillingSubmit());
	    Thread.sleep(2000);
		
	}

	@When("User click the Paypal button")
	public void user_click_the_Paypal_button() throws InterruptedException {
		
		btnClick(b.getPaypal());
	    Thread.sleep(2000);

    
	}

	@When("User click the Edit button in SubTotal and Shipping address field")
	public void user_click_the_Edit_button_in_SubTotal_and_Shipping_address_field() throws InterruptedException {
		
		btnClick(b.getEditSubtotal());
	    Thread.sleep(4000);
	    
	    btnClick(sp.getContinueTobilling());
	    Thread.sleep(2000);
	    
	    btnClick(sp.getKeepOriginal());
	    Thread.sleep(2000);
	    
	    btnClick(b.getEditShipping());
	    Thread.sleep(4000);
	    
	    btnClick(sp.getContinueTobilling());
	    Thread.sleep(2000);
	    
	    btnClick(sp.getKeepOriginal());
	    Thread.sleep(2000);
	   
	}

	@When("User select the non taxable address from saved address dropdown")
	public void user_select_the_non_taxable_address_from_saved_address_dropdown() throws InterruptedException {
		
		btnClick(b.getShippingPage());
	    Thread.sleep(2000);
	    
	    b.addressDropdown();
	    Thread.sleep(4000);
	    
	    btnClick(sp.getContinueTobilling());
	    Thread.sleep(2000);
	    
	    btnClick(b.getKeepOrg2());
    
	}

	@When("User enter card details")
	public void user_enter_card_details() {
		
		fill(b.getCardNumber(), "4214 3602 2011 9592");
		
		fill(b.getSecurityCode(), "098");
		
		fill(b.getNameOncard(), "Andrew Rooban Raj S");
		
		b.monthDropdown();
		
		b.yearDropdown();
    
	}

	@When("User validate the saved this card, add a gift and shipping address checkbox")
	public void user_validate_the_saved_this_card_add_a_gift_and_shipping_address_checkbox() throws InterruptedException {
                        
		btnClick(b.getSaveCard());
		Thread.sleep(1000);
		
		btnClick(b.getAddGift());
		Thread.sleep(1000);

		btnClick(b.getAddGift());
		Thread.sleep(1000);
		
		btnClick(b.getShippingAddress());
		Thread.sleep(1000);
		
		btnClick(b.getShippingAddress());
		Thread.sleep(1000);
		
	}

	@Then("User click the Review Order button")
	public void user_click_the_Review_Order_button() {
    
		btnClick(b.getBillingSubmit());
		System.out.println("Billing Page - Done");
		
		toQuit();
		
	}


}
