package org.stepdefinition;

import org.testng.AssertJUnit;
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

	@When("User Add an item to cart")
	public void user_Add_an_item_to_cart() throws AWTException {

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
		
	}

	@When("User Checkout from cart")
	public void user_Checkout_from_cart() {
	    
		btnClick(shopping.checkOut);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    fill(shopping.guestmail, "andrewroobanraaj@gmail.com");
		
		fill(shopping.cartPassword, "Metallica@2");
	   
		btnClick(shopping.userCheckout);
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@Then("User Skips the mandatory fields and submit")
	public void user_Skips_the_mandatory_fields_and_submit() {
	   
		fieldClear(shipping.firstName);
	    fieldClear(shipping.lastName);
	    fieldClear(shipping.address1);
	    fieldClear(shipping.city);
	    fieldClear(shipping.zipCode);
	    fieldClear(shipping.phone);
	   
	    btnClick(shipping.continueTobilling);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    AssertJUnit.assertTrue(shipping.mandatoryError.isDisplayed());
	    System.out.println("Mandatory Error occurs to fill the  mandatory fields");
	    
	    toClose();
	}

	@Then("User click continue to billing button with valid shipping address")
	public void user_click_continue_to_billing_button_with_valid_shipping_address() throws InterruptedException {
	    
		Thread.sleep(3000);
		
		btnClick(shipping.continueTobilling);		
		waitForPageToLoad(timeoutInSeconds);
		
		Thread.sleep(2000);
		
		AssertJUnit.assertTrue(shipping.keepOriginal.isDisplayed());
		System.out.println("Keep Original address Popup is displayed to navigate billing page");
		
		toClose();
	}

	@When("User enter invalid values in zipcode,country and state fields")
	public void user_enter_invalid_values_in_zipcode_country_and_state_fields() throws InterruptedException {
	    
		fieldClear(shipping.city);
		fieldClear(shipping.zipCode);
		
		fill(shipping.city, "abcdefgh");
		fill(shipping.zipCode, "12AB3");
		
		Thread.sleep(3000);
				
	}

	@Then("User see the error message for invalid address")
	public void user_see_the_error_message_for_invalid_address() {
	   
		btnClick(shipping.continueTobilling);		
		waitForPageToLoad(timeoutInSeconds);
		
		AssertJUnit.assertTrue(shipping.mandatoryError.isDisplayed());
		System.out.println("Error occurs to enter valid Address");
		
		toClose();
		
	}

	@Then("User see the saved address in dropdown")
	public void user_see_the_saved_address_in_dropdown() {
	    
		AssertJUnit.assertTrue(shipping.savedAddress.isDisplayed());
		System.out.println("Saved addresses are displayed in the dropdown");
	
		toClose();
		
	}

	@Then("User click the Use this address for billing checkbox")
	public void user_click_the_Use_this_address_for_billing_checkbox() {
	    
		AssertJUnit.assertTrue(shipping.addressCheckbox.isSelected());
		System.out.println("Use this address for billing checkbox is selected");
		
		toClose();
		
	}
	
	@Then("User click the Is this a Gift checkbox")
	public void user_click_the_Is_this_a_Gift_checkbox() throws InterruptedException  {
	    
		btnClick(shipping.giftCheckbox);
		
		AssertJUnit.assertTrue(shipping.giftCheckbox.isSelected());	
		System.out.println("Is This a Gift Checkbox is selected");
		
		toClose();
	}

	@Then("User enter the shipping address")
	public void user_enter_the_shipping_address() {
	   
		AssertJUnit.assertTrue(shipping.shipMethodlist.isDisplayed());
		System.out.println("Shipping Method list is displayed after enter the address");
		
		toClose();
		
	}

	@Then("User check the ship method for in stock product")
	public void user_check_the_ship_method_for_in_stock_product() {
	    
		AssertJUnit.assertTrue(shipping.shipMethodlabel1.isDisplayed());
		System.out.println("Shipping method for instock product is displayed as 'SHIP NOW' ");
		
		toClose();
		
	}

	@When("User add Pre order product to cart")
	public void user_add_Pre_order_product_to_cart() throws AWTException, InterruptedException {
	    
		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);
	    		
		btnClick(product.search);
		
		fill(product.enterText, "LIVE METALLICA: EAST RUTHERFORD, NJ - AUGUST 6, 2023 (2CD)");
		
		performEnter();
		
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.checkBox);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.preOrdercart);
		waitForPageToLoad(timeoutInSeconds);
	
	}

	@Then("User check the ship method pre order product")
	public void user_check_the_ship_method_pre_order_product() throws InterruptedException {
		
		waitForPageToLoad(timeoutInSeconds);
		Thread.sleep(3000);
		
		AssertJUnit.assertTrue(shipping.shipMethodlabel.isDisplayed());
		System.out.println("Shipping method for Pre Order product is displayed as 'SHIP LATER' ");
		
		toClose();	    
		
	}
	
	@When("User select the shipping method")
	public void user_select_the_shipping_method() throws InterruptedException {
	    
		Thread.sleep(3000);
		
		btnClick(shipping.shippingMethod);
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@Then("User check the selected shipping method is reflected in order summary section")
	public void user_check_the_selected_shipping_method_is_reflected_in_order_summary_section() throws InterruptedException {
	    
		String selectedShipMethod = shipping.selectedShipMethod.getText();
		
		Thread.sleep(3000);
		
		String shipMethodInOrderSummary = shipping.shipMethodInOrderSummary.getText();
		
		String shipMethod = selectedShipMethod.substring(12);
		
		Assert.assertEquals(shipMethod, shipMethodInOrderSummary);
		System.out.println("The Selected Shipping Method is Reflected in Order Summary Section");
		
		
	}

	@Then("User check the Order total amount includes the shipping method rate")
	public void user_check_the_Order_total_amount_includes_the_shipping_method_rate() {
	    
		String SubTotal = shipping.subTotal.getText();
				
		String shipMethodInOrderSummary = shipping.shipMethodInOrderSummary.getText();
		
		String OrderTotal = shipping.orderTotal.getText();
		
		String Rate1 =SubTotal.substring(1);
		String Rate2 =shipMethodInOrderSummary.substring(1);
		String Rate3 =OrderTotal.substring(1);
		
		double value1 = Double.parseDouble(Rate1);//SubTotal
        double value2 = Double.parseDouble(Rate2);//ShipMethodRate
        double value3 = Double.parseDouble(Rate3);//OrderTotal
        
        double sum = value1 + value2;
        
        AssertJUnit.assertEquals(value3, sum);
        System.out.println("The Order total amount includes the Shipping Method Rate");
        
        toClose();		
	 
	}	
	

	@Then("User Click the Continue to billing button")
	public void user_Click_the_Continue_to_billing_button() throws InterruptedException {
	    
		Thread.sleep(3000);
		
		btnClick(shipping.continueTobilling);
		waitForPageToLoad(timeoutInSeconds);
		
		Thread.sleep(2000);
		
		btnClick(shipping.keepOriginal);
		waitForPageToLoad(timeoutInSeconds);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/billing/"));
		System.out.println("User navigated to Billing Page");
		
		toClose();
	}

}
