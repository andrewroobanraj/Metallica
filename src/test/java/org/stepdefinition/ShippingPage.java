package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.pojo.HomePagePojo;
import org.pojo.ProductDetailPagePojo;
import org.pojo.ShippingPagePojo;
import org.pojo.ShoppingCartPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShippingPage extends BaseClass{
	
	HomePagePojo h=new HomePagePojo();
	ProductDetailPagePojo p=new ProductDetailPagePojo();
	ShippingPagePojo sp=new ShippingPagePojo();
	ShoppingCartPagePojo s=new ShoppingCartPagePojo();

	
	@When("User navigate to shipping page")
	public void user_navigate_to_shipping_page() throws InterruptedException, AWTException {
		
		btnClick(h.getSearchMenu());
	    Thread.sleep(2000);
	    		
		btnClick(p.getSearch());
		
		fill(p.getEnterText(), "72 SEASONS SILVER RING");
		
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
	    
	}

	@When("User validate the mandatory fields")
	public void user_validate_the_mandatory_fields() {
		
		fieldClear(sp.getFirstName());
	    fieldClear(sp.getLastName());
	    fieldClear(sp.getAddress1());
	    fieldClear(sp.getCity());
	    fieldClear(sp.getZipCode());
	    fieldClear(sp.getPhone());
	    btnClick(sp.getContinueTobilling());
	    
	}

	@When("User validate the shipping address fields")
	public void user_validate_the_shipping_address_fields() {
		
		fill(sp.getCity(), "abcdefgh");
		fill(sp.getZipCode(), "12AB3");
		btnClick(sp.getContinueTobilling());		
	   
	}

	@When("User select address from saved address dropdown")
	public void user_select_address_from_saved_address_dropdown() throws InterruptedException {
		
		fieldClear(sp.getCity());
		fieldClear(sp.getZipCode());
		
		sp.addressDropdown();
		Thread.sleep(2000);
	   
	}

	@When("User click the Use this address checkbox")
	public void user_click_the_Use_this_address_checkbox() throws InterruptedException {
		
		btnClick(sp.getAddressCheckbox());
		Thread.sleep(3000);
		
		btnClick(sp.getAddressCheckbox());
		Thread.sleep(3000);
	    
	}

	@When("User click the Is this a Gift checkbox")
	public void user_click_the_Is_this_a_Gift_checkbox() throws InterruptedException {
	    
		btnClick(sp.getGiftCheckbox());
		
		fill(sp.getGiftMessage(), "Hii Buddy");
		Thread.sleep(2000);
		
		btnClick(sp.getGiftCheckbox());
		
	}

	@Then("User select the Shipping Method")
	public void user_select_the_Shipping_Method() {
		
		btnClick(sp.getShippingMethod());
	   
	}

	@Then("User check shipping method label for Pre Order product")
	public void user_check_shipping_method_label_for_Pre_Order_product() throws InterruptedException, AWTException {
		
		scrollUp();
		
		btnClick(s.getBackToCart());
		
		btnClick(s.getRemoveCart());
		Thread.sleep(2000);
	   
		btnClick(h.getSearchMenu());
	    Thread.sleep(2000);
	    		
		btnClick(p.getSearch());
		
		fill(p.getEnterText(), "BLACKENED WHISKEY 72 SEASONS T-SHIRT");
		
		performEnter();
		
		Thread.sleep(2000);
		
		btnClick(p.getProductSize());
		Thread.sleep(1000);
		
		btnClick(p.getAddTocart());
		Thread.sleep(1000);
		
		btnClick(p.getCheckBox());
		Thread.sleep(1000);
		
		btnClick(p.getPreOrdercart());
		Thread.sleep(2000);
		
		btnClick(sp.getPreOrdercheckOut());
		
		btnClick(sp.getCheckoutIncart());
		Thread.sleep(3000);

		
	}

	@Then("User click the Continue to billing button")
	public void user_click_the_Continue_to_billing_button() throws InterruptedException {
	   
	    btnClick(sp.getContinueTobilling());
		Thread.sleep(2000);
	    
	    btnClick(sp.getKeepOriginal());
	    System.out.println("Shipping Page - Done");

	    toQuit();
		
	}

}
