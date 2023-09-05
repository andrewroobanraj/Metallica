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

	
	@When("User navigate to shipping page")
	public void user_navigate_to_shipping_page() throws InterruptedException, AWTException {
		
		btnClick(home.searchMenu);
	    Thread.sleep(2000);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "72 SEASONS SILVER RING");
		
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
	    
	}

	@When("User validate the shipping address fields")
	public void user_validate_the_shipping_address_fields() {
		
		fill(shipping.city, "abcdefgh");
		fill(shipping.zipCode, "12AB3");
		btnClick(shipping.continueTobilling);		
	   
	}

	@When("User select address from saved address dropdown")
	public void user_select_address_from_saved_address_dropdown() throws InterruptedException {
		
		fieldClear(shipping.city);
		fieldClear(shipping.zipCode);
		
		shipping.addressDropdown();
		Thread.sleep(2000);
	   
	}

	@When("User click the Use this address checkbox")
	public void user_click_the_Use_this_address_checkbox() throws InterruptedException {
		
		btnClick(shipping.addressCheckbox);
		Thread.sleep(3000);
		
		btnClick(shipping.addressCheckbox);
		Thread.sleep(3000);
	    
	}

	@When("User click the Is this a Gift checkbox")
	public void user_click_the_Is_this_a_Gift_checkbox() throws InterruptedException {
	    
		btnClick(shipping.giftCheckbox);
		
		fill(shipping.giftMessage, "Hii Buddy");
		Thread.sleep(2000);
		
		btnClick(shipping.giftCheckbox);
		
	}

	@Then("User select the Shipping Method")
	public void user_select_the_Shipping_Method() {
		
		String Method1 = shipping.shipMethodlabel1.getText();
		System.out.println("Shipping Method for Normal Product: " + Method1);
		
		btnClick(shipping.shippingMethod);
	   
	}

	@Then("User check shipping method label for Pre Order product")
	public void user_check_shipping_method_label_for_Pre_Order_product() throws InterruptedException, AWTException {
		
		scrollUp();
		
		btnClick(shopping.backToCart);
		
		btnClick(shopping.removeCart);
		Thread.sleep(2000);
	   
		btnClick(home.searchMenu);
	    Thread.sleep(2000);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "BLACKENED WHISKEY 72 SEASONS T-SHIRT");
		
		performEnter();
		
		Thread.sleep(2000);
		
		btnClick(product.productSize);
		Thread.sleep(1000);
		
		btnClick(product.addTocart);
		Thread.sleep(1000);
		
		btnClick(product.checkBox);
		Thread.sleep(1000);
		
		btnClick(product.preOrdercart);
		Thread.sleep(2000);
		
		btnClick(shipping.preOrdercheckOut);
		
		btnClick(shipping.checkoutIncart);
		Thread.sleep(3000);
		
		String Method = shipping.shipMethodlabel.getText();
		System.out.println("Shipping Method for Pre-Order: " + Method);

		
	}

	@Then("User click the Continue to billing button")
	public void user_click_the_Continue_to_billing_button() throws InterruptedException {
	   
		
	    btnClick(shipping.continueTobilling);
		Thread.sleep(2000);
	    
	    btnClick(shipping.keepOriginal);
	    
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("To Check the url", url.contains("https://www.metallica.com/billing/"));
	    
	    System.out.println("After click the Continue to Billing button User is in Billing Page");

	    toQuit();
		
	}

}
