package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShippingPagePojo extends BaseClass{
	
		//default constructor
		public ShippingPagePojo() {
					
		PageFactory.initElements(driver, this);	
		
		}
		
		//To enter product name in search
		@FindBy(xpath="//a[@title='Go to Product: 72 Seasons Silver Ring']")
		private WebElement ringProduct;

		public WebElement getRingProduct() {
			return ringProduct;
		}
		
		//To select the product size
		@FindBy(xpath="(//a[@class='swatchanchor'])[1]")
		private WebElement ringSize;

		public WebElement getRingSize() {
			return ringSize;
		}
		
		//To enter value in First Name field
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_firstName']")
		private WebElement firstName;
		
		public WebElement getFirstName() {
			return firstName;
		}    
		
		//To enter value in Last Name field
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']")
		private WebElement lastName;
		
		public WebElement getLastName() {
			return lastName;
		}
		
		//To enter Address 1
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address1']")
		private WebElement address1;
		
		public WebElement getAddress1() {
			return address1;
		}
		
		//To enter Address 2
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_address2']")
		private WebElement address2;
		
		public WebElement getAddress2() {
			return address2;
		}
		
		//To enter City
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_city']")
		private WebElement city;
		
		public WebElement getCity() {
			return city;
		}
		
		//To enter State
		@FindBy(xpath="//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_states_state']")
		private WebElement state;
		
		public WebElement getState() {
			return state;
		}
		
		//To enter Country
		@FindBy(xpath="//select[@id='dwfrm_singleshipping_shippingAddress_addressFields_country']")
		private WebElement country;
		
		public WebElement getCountry() {
			return country;
		}
		
		//To enter Zipcode
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_postal']")
		private WebElement zipCode;
		
		public WebElement getZipCode() {
			return zipCode;
		}
		
		//To enter Phone number
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_phone']")
		private WebElement phone;
		
		public WebElement getPhone() {
			return phone;
		}
		
		//To click continue to billing button
		@FindBy(xpath="//button[@id='shipping-continue']")
		private WebElement continueTobilling;

		public WebElement getContinueTobilling() {
			return continueTobilling;
		}
		
		//To select address from saved address dropdown
		public void addressDropdown() {
			
			WebElement savedAdd = driver.findElement(By.id("dwfrm_singleshipping_addressList"));
			
			Select a=new Select(savedAdd);
			a.selectByValue("Miami");
			
		}
		
		//To select address check box
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_useAsBillingAddress']")
		private WebElement addressCheckbox;
		
		public WebElement getAddressCheckbox() {
			return addressCheckbox;
		}
		
		//To select gift check box
		@FindBy(xpath="//input[@id='dwfrm_singleshipping_shippingAddress_isGift']")
		private WebElement giftCheckbox;
		
		public WebElement getGiftCheckbox() {
			return giftCheckbox;
		}
		
		//To enter gift message
		@FindBy(xpath="//textarea[@id='dwfrm_singleshipping_shippingAddress_giftMessage']")
		private WebElement giftMessage;
		
		public WebElement getGiftMessage() {
			return giftMessage;
		}
		
		//To select shipping method
		@FindBy(xpath="//input[@id='shipping-method-shqups-GND']")
		private WebElement shippingMethod;

		public WebElement getShippingMethod() {
			return shippingMethod;
		}
		
		//To click the checkout button
		@FindBy(xpath="(//a[@title='Checkout'])[1]")
		private WebElement preOrdercheckOut;

		public WebElement getPreOrdercheckOut() {
			return preOrdercheckOut;
		}
		
		//To click checkout in cart page
		@FindBy(xpath="//button[@value='Checkout']")
		private WebElement checkoutIncart;

		public WebElement getCheckoutIncart() {
			return checkoutIncart;
		}
		
		//To click keep original button in popup
		@FindBy(xpath="(//span[@class='ui-button-text'])[2]")
		private WebElement keepOriginal;

		public WebElement getKeepOriginal() {
			return keepOriginal;
		}
		
}
