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
import org.testng.AssertJUnit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderPage extends BaseClass{
	
	HomePageElements home=new HomePageElements();
	ProductDetailPageElements product=new ProductDetailPageElements();
	ShippingPageElements shipping=new ShippingPageElements();
	ShoppingCartPageElements shopping=new ShoppingCartPageElements();
	BillingPageElements billing=new BillingPageElements();
	PlaceOrderPageElements placeorder=new PlaceOrderPageElements();
	
	int timeoutInSeconds = 10;
	
	@When("User Add an product to cart page")
	public void user_Add_an_product_to_cart_page() throws AWTException {

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

	@When("User checkout from cart")
	public void user_checkout_from_cart() {
	    
		btnClick(shopping.checkOut);
	    waitForPageToLoad(timeoutInSeconds);
	    
	    fill(shopping.guestmail, "andrewroobanraaj@gmail.com");
		
		fill(shopping.cartPassword, "Metallica@2");
	   
		btnClick(shopping.userCheckout);
		waitForPageToLoad(timeoutInSeconds);
		
	}
	
	@Then("User check the Use this address for billing checkbox is selected")
	public void user_check_the_Use_this_address_for_billing_checkbox_is_selected() {
	   
		AssertJUnit.assertTrue(shipping.addressCheckbox.isSelected());
		System.out.println("Use this address for billing checkbox is selected");
	}
	
	@When("User select the International Shipping Address")
	public void user_select_the_International_Shipping_Address() {
	    
		billing.internationalAddressDropdown();
		waitForPageToLoad(timeoutInSeconds);
	}

	@When("User navigate to Place Order page")
	public void user_navigate_to_Place_Order_page() throws InterruptedException {

		Thread.sleep(3000);
		
		btnClick(shipping.continueTobilling);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(shipping.keepOriginal);
		waitForPageToLoad(timeoutInSeconds);
		
		fill(billing.cardNumber, "4214 3602 2011 9592");
		
		fill(billing.securityCode, "098");
		
		fill(billing.nameOncard, "Andrew Rooban Raj S");
		
		billing.monthDropdown();
		
		billing.yearDropdown();
		
		btnClick(billing.billingSubmit);
		waitForPageToLoad(timeoutInSeconds);
	}
	
	@Then("User check the shipping and billing address in the Place Order page")
	public void user_check_the_shipping_and_billing_address_in_the_place_order_page() {
	    
		String shippingAddress = billing.shippingAdd.getText();
		String billingAddress  = billing.billingAdd.getText();
		
		Assert.assertEquals(shippingAddress, billingAddress);
		System.out.println("The Shipping address is used as the Billing Address");
		
		toClose();
	}
	
	@Then("User click the edit cart link")
	public void user_click_the_edit_cart_link() throws InterruptedException  {
		
		btnClick(placeorder.backTocart);
		waitForPageToLoad(timeoutInSeconds);
		
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/cart/"));
		System.out.println("User navigated to Shopping Cart Page");
		
		toClose();

	}
	
	@Then("User check the Order Total")
	public void user_check_the_Order_Total() {
	    
		String SubTotal = placeorder.subTotal.getText();
		
		String shipMethodInOrderSummary = shipping.shipMethodInOrderSummary.getText();
		
		String taxRate = placeorder.taxRate.getText();
		
		String OrderTotal = placeorder.totalOrder.getText();
		
		String Rate1 =SubTotal.substring(1);
		String Rate2 =shipMethodInOrderSummary.substring(1);
		String Rate3 =taxRate.substring(1);
		String Rate4 =OrderTotal.substring(1);
		
		double value1 = Double.parseDouble(Rate1);//SubTotal
        double value2 = Double.parseDouble(Rate2);//ShipMethodRate
        double value3 = Double.parseDouble(Rate3);//TaxRate
        double value4 = Double.parseDouble(Rate4);//OrderTotal
        
        double sum = value1 + value2 + value3;
        
        AssertJUnit.assertEquals(value4, sum);
        System.out.println("The order total calculated correctly including tax and shipping costs.");
        
        toClose();		
	}

	@Then("User see the International Shipping policy message in Place Order page")
	public void user_see_the_International_Shipping_policy_message_in_Place_Order_page() {
	    
		Assert.assertTrue(placeorder.intPolicyCheckBox.isDisplayed());
		System.out.println("User see the International Shipping policy message in Place Order page");
		
		toClose();
	}

	@Then("User is not allowed to place the order without selecting the checkbox")
	public void user_is_not_allowed_to_place_the_order_without_selecting_the_checkbox() {
	    
		Assert.assertTrue(placeorder.disabledPlaceOrderButton.isDisplayed());
		System.out.println("User is not allowed to place the order without selecting the checkbox");
		
		toClose();
	}

}
