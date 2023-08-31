package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojo.BillingPagePojo;
import org.pojo.HomePagePojo;
import org.pojo.PlaceOrderPagePojo;
import org.pojo.ProductDetailPagePojo;
import org.pojo.ShippingPagePojo;
import org.pojo.ShoppingCartPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderPage extends BaseClass{
	
	HomePagePojo h=new HomePagePojo();
	ProductDetailPagePojo p=new ProductDetailPagePojo();
	ShippingPagePojo sp=new ShippingPagePojo();
	ShoppingCartPagePojo s=new ShoppingCartPagePojo();
	BillingPagePojo b=new BillingPagePojo();
	PlaceOrderPagePojo po=new PlaceOrderPagePojo();
	
	@When("User navigate to place order page")
	public void user_navigate_to_place_order_page() throws InterruptedException, AWTException {
		
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
	    
	    fill(b.getCardNumber(), "4214 3602 2011 9592");
		
		fill(b.getSecurityCode(), "098");
		
		fill(b.getNameOncard(), "Andrew Rooban Raj S");
		
		b.monthDropdown();
		
		b.yearDropdown();
		
		btnClick(b.getBillingSubmit());
		Thread.sleep(1000);
	    
	}

	@When("User click the edit cart link")
	public void user_click_the_edit_cart_link() throws InterruptedException {
		
		btnClick(po.getBackTocart());
	    Thread.sleep(2000);
	    
	    btnClick(sp.getCheckoutIncart());
	    Thread.sleep(3000);
	    
	    btnClick(sp.getContinueTobilling());
	    Thread.sleep(2000);
	    
	    btnClick(sp.getKeepOriginal());
	    Thread.sleep(2000);
	    
	    fill(b.getCardNumber(), "4214 3602 2011 9592");
		
		fill(b.getSecurityCode(), "098");
		
		fill(b.getNameOncard(), "Andrew Rooban Raj S");
		
		b.monthDropdown();
		
		b.yearDropdown();
		
		btnClick(b.getSaveCard());
		
		btnClick(b.getBillingSubmit());
		Thread.sleep(1000);

	}

	@Then("User click the edit button in payment and billing address fields")
	public void user_click_the_edit_button_in_payment_and_billing_address_fields() throws InterruptedException {
		
		btnClick(po.getEditBillingaddress());
		Thread.sleep(1000);
		
		fill(b.getCardNumber(), "4214 3602 2011 9592");
		
		fill(b.getSecurityCode(), "098");
		
		fill(b.getNameOncard(), "Andrew Rooban Raj S");
		
		b.monthDropdown();
		
		b.yearDropdown();
		
		btnClick(b.getSaveCard());
		
		btnClick(b.getBillingSubmit());
		Thread.sleep(1000);
		
		btnClick(po.getEditPayment());
		
		System.out.println("Place Order Page - Done");
		
		toQuit();
	    
	}

}
