package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.BillingPageElements;
import org.elements.HomePageElements;
import org.elements.ProductDetailPageElements;
import org.elements.ShippingPageElements;
import org.elements.ShoppingCartPageElements;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingPage extends BaseClass {

	HomePageElements home = new HomePageElements();
	ProductDetailPageElements product = new ProductDetailPageElements();
	ShippingPageElements shipping = new ShippingPageElements();
	ShoppingCartPageElements shopping = new ShoppingCartPageElements();
	BillingPageElements billing = new BillingPageElements();

	int timeoutInSeconds = 10;

	@When("User Add an product to cart")
	public void user_Add_an_product_to_cart() throws AWTException {

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

	@When("User Checkout from cart page")
	public void user_Checkout_from_cart_page() {

		btnClick(shopping.checkOut);
		waitForPageToLoad(timeoutInSeconds);

		fill(shopping.guestmail, "andrewroobanraaj@gmail.com");

		fill(shopping.cartPassword, "Metallica@2");

		btnClick(shopping.userCheckout);
		waitForPageToLoad(timeoutInSeconds);

	}

	@When("User navigate to billing page")
	public void user_navigate_to_billing_page() throws InterruptedException {

		Thread.sleep(3000);

		btnClick(shipping.continueTobilling);
		waitForPageToLoad(timeoutInSeconds);
		
		Thread.sleep(2000);

		btnClick(shipping.keepOriginal);
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User Skip any mandatory field and proceed")
	public void user_Skip_any_mandatory_field_and_proceed() {

		btnClick(billing.billingSubmit);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(billing.requiredFieldError.isDisplayed());
		System.out.println("Error Displayed to fill the required fields");

	}

	@Then("User enter invalid data and proceed")
	public void user_enter_invalid_data_and_proceed() {

		fill(billing.cardNumber, "1234567891012131");

		fill(billing.securityCode, "098");

		fill(billing.nameOncard, "Andrew Rooban Raj S");

		billing.monthDropdown();

		billing.yearDropdown();

		btnClick(billing.billingSubmit);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(billing.invalidError.isDisplayed());
		System.out.println("The page redirected to En Error Occurred page");

		toClose();

		// String cardNumber = billing.cardNumber.getAttribute("value");

		// Assert.assertTrue(cardNumber.isEmpty());
		// System.out.println("The invalid fields are cleared to re-enter the valid
		// Values");

	}

	@Then("User enter a Taxable state address")
	public void user_enter_a_Taxable_state_address() throws InterruptedException {

		shipping.addressDropdown();
		Thread.sleep(3000);

	}

	@Then("User click the Continue to billing button with Taxable address")
	public void user_click_the_Continue_to_billing_button_with_Taxable_address() throws InterruptedException {

		btnClick(shipping.continueTobilling);
		waitForPageToLoad(timeoutInSeconds);

		Thread.sleep(2000);
		
		btnClick(shipping.keepOriginal);
		waitForPageToLoad(timeoutInSeconds);

		String tax = billing.taxRate.getText();

		Assert.assertNotEquals("$0.00", tax);
		System.out.println("The Tax returned appropriately for Taxable address.");

		toClose();
	}

	@Then("User enter non-Taxable state address")
	public void user_enter_non_Taxable_state_address() throws InterruptedException {

		billing.nonTaxableAddressDropdown();
		Thread.sleep(3000);

	}

	@Then("User click the Continue to billing button with non-Taxable address")
	public void user_click_the_Continue_to_billing_button_with_non_Taxable_address() throws InterruptedException {

		btnClick(shipping.continueTobilling);
		waitForPageToLoad(timeoutInSeconds);

		Thread.sleep(2000);
		
		btnClick(billing.keepOrg2);
		waitForPageToLoad(timeoutInSeconds);

		String tax = billing.taxRate.getText();

		Assert.assertEquals("$0.00", tax);
		System.out.println("The Tax returned is $0.00 for Non-Taxable address.");

		toClose();
	}

	@When("User enter card details")
	public void user_enter_card_details() {

		fill(billing.cardNumber, "4214 3602 2011 9592");

		fill(billing.securityCode, "098");

		fill(billing.nameOncard, "Andrew Rooban Raj S");

		billing.monthDropdown();

		billing.yearDropdown();

	}

	@Then("User click the Review Order button")
	public void user_click_the_Review_Order_button() {

		btnClick(billing.billingSubmit);

		String url = driver.getCurrentUrl();
		Assert.assertTrue("To check the user is in Place Order Page",
				url.contains("https://www.metallica.com/placeorder/"));
		System.out.println("After click the Review Order button User is in Place Order Page");

		toQuit();

	}

	@When("User select the International Shipping address")
	public void user_select_the_International_Shipping_address() throws InterruptedException {

		billing.internationalAddressDropdown();
		waitForPageToLoad(timeoutInSeconds);
		
		Thread.sleep(3000);

		btnClick(shipping.continueTobilling);
		waitForPageToLoad(timeoutInSeconds);

		Thread.sleep(2000);
		
		btnClick(shipping.keepOriginal);
		waitForPageToLoad(timeoutInSeconds);

	}
	
	@Then("User navigated to shipping page without Policy message")
	public void user_navigated_to_shipping_page_without_Policy_message() {
	    
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/billing/"));
		System.out.println("The International address policy is not displayed while navigated to shipping page.");
		
		toClose();
	}

	@Then("User navigated to place order page without Policy message")
	public void user_navigated_to_place_order_page_without_Policy_message() {
	   
		btnClick(billing.billingSubmit);
		waitForPageToLoad(timeoutInSeconds);
		
		String url = driver.getCurrentUrl();
		
		Assert.assertTrue(url.contains("https://www.metallica.com/placeorder/"));
		System.out.println("The International address policy is not displayed while navigated to Place Order Page.");
		
		toClose();
				
	}

}
