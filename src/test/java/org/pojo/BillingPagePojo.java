package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingPagePojo extends BaseClass{
	
	//default constructor
	public BillingPagePojo() {
					
	PageFactory.initElements(driver, this);	
	
	}
	
	//To click the review order button
	@FindBy(xpath="//button[@id='billingSubmitButton']")
	private WebElement billingSubmit;
	
	public WebElement getBillingSubmit() {
		return billingSubmit;
	}
	
	//To click paypal
	@FindBy(xpath="//input[@id='is-PAYPAL']")
	private WebElement paypal;
	
	public WebElement getPaypal() {
		return paypal;
	}
	
	//To click edit in SubTotal
	@FindBy(xpath="//a[@title='Edit']")
	private WebElement editSubtotal;
	
	public WebElement getEditSubtotal() {
		return editSubtotal;
	}
	
	//TO click edit in Shipping address
	@FindBy(xpath="//a[@class='section-header-note']")
	private WebElement editShipping;
	
	public WebElement getEditShipping() {
		return editShipping;
	}
	
	//Back to shipping page
	@FindBy(xpath="//a[@title='Shipping']")
	private WebElement shippingPage;
	
	public WebElement getShippingPage() {
		return shippingPage;
	}
	
	//To select non taxable address from saved address drop down
	public void addressDropdown() {
				
	WebElement savedAdd = driver.findElement(By.id("dwfrm_singleshipping_addressList"));
				
	Select a=new Select(savedAdd);
	a.selectByValue("OTTAWA");
	}
	
	//To click keep original address 
	@FindBy(xpath="//button[@id='buttonSelectAddressUser']")
	private WebElement keepOrg2;

	public WebElement getKeepOrg2() {
		return keepOrg2;
	}
	
	//To enter card number 
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_number']")
	private WebElement cardNumber;
	
	public WebElement getCardNumber() {
		return cardNumber;
	}
	
	//To enter security code
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_cvn']")
	private WebElement securityCode;
	
	public WebElement getSecurityCode() {
		return securityCode;
	}
	
	//To enter Name on Card
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_owner']")
	private WebElement nameOncard;

	public WebElement getNameOncard() {
		return nameOncard;
	}
	
	//To select Expiry Month
	public void monthDropdown() {
		
	WebElement month = driver.findElement(By.xpath("//select[@id='dwfrm_billing_paymentMethods_creditCard_expiration_month']"));

	Select m=new Select(month);
	m.selectByVisibleText("February");
	}
	
	//To select Expiry Year
	public void yearDropdown() {
			
	WebElement year = driver.findElement(By.xpath("//select[@id='dwfrm_billing_paymentMethods_creditCard_expiration_year']"));

	Select y=new Select(year);
	y.selectByVisibleText("2026");
	}
	
	//To click save this card check box
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_saveCard']")
	private WebElement saveCard;
	
	public WebElement getSaveCard() {
		return saveCard;
	}
	
	@FindBy(xpath="//div[text()='Add a Gift Certificate or Coupon']")
	private WebElement addGift;
	
	public WebElement getAddGift() {
		return addGift;
	}
	
	@FindBy(xpath="//input[@id='dwfrm_billing_billingAddress_useAsBillingAddress']")
	private WebElement shippingAddress;

	public WebElement getShippingAddress() {
		return shippingAddress;
	}	
	
	
}
