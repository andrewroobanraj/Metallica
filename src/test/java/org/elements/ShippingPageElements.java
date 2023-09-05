package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingPageElements extends BaseClass{
	
		//default constructor
		public ShippingPageElements() {
					
		PageFactory.initElements(driver, this);	
		
		}
		
		//To enter product name in search
		@FindBy(xpath="//a[@title='Go to Product: 72 Seasons Silver Ring']")
		public WebElement ringProduct;

		//To select the product size
		@FindBy(xpath="(//a[@class='swatchanchor'])[1]")
		public WebElement ringSize;

		//To enter value in First Name field
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_firstName']")
		public WebElement firstName;
		
		//To enter value in Last Name field
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']")
		public WebElement lastName;
		
		//To enter Address 1
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address1']")
		public WebElement address1;
		
		//To enter Address 2
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address2']")
		public WebElement address2;
		
		//To enter City
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_city']")
		public WebElement city;
		
		//To enter State
		@FindBy(xpath="//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_states_state']")
		public WebElement state;
		
		//To enter Country
		@FindBy(xpath="//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_country']")
		public WebElement country;
		
		//To enter Zipcode
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_postal']")
		public WebElement zipCode;
		
		//To enter Phone number
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']")
		public WebElement phone;
		
		//To click continue to billing button
		@FindBy(xpath="//button[@id='shipping-continue']")
		public WebElement continueTobilling;

		//To select address from saved address dropdown
		public void addressDropdown() {
			
			WebElement savedAdd = driver.findElement(By.id("dwfrm_singleshipping_addressList"));
			
			Select a=new Select(savedAdd);
			a.selectByValue("Miami");
			
		}
		
		//To select address check box
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_useAsBillingAddress']")
		public WebElement addressCheckbox;
		
		//To select gift check box
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_isGift']")
		public WebElement giftCheckbox;
		
		//To enter gift message
		@FindBy(xpath="//textarea[@id='dwfrm_singleshipping_shippingAddress_giftMessage']")
		public WebElement giftMessage;
		
		//To select shipping method
		@FindBy(xpath="//input[@id='shipping-method-shqups-GND']")
		public WebElement shippingMethod;

		//To click the checkout button
		@FindBy(xpath="(//a[@title='Checkout'])[1]")
		public WebElement preOrdercheckOut;

		//To click checkout in cart page
		@FindBy(xpath="//button[@value='Checkout']")
		public WebElement checkoutIncart;

		//To click keep original button in popup
		@FindBy(xpath="(//span[@class='ui-button-text'])[2]")
		public WebElement keepOriginal;
		
		//To check the Label of shipping method for Pre-Order Product
		@FindBy(xpath="//div[@class='shipping-method-header custom-shipment-header']")
		public WebElement shipMethodlabel;
		
		//To check the Label of shipping method for normal Product 
		@FindBy(xpath="//div[@class='shipping-method-header normal-shipment-header']")
		public WebElement shipMethodlabel1;

}
