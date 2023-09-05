package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BillingPageElements extends BaseClass{
	
	//default constructor
	public BillingPageElements() {
					
	PageFactory.initElements(driver, this);	
	
	}
	
	//To click the review order button
	@FindBy(xpath="//button[@id='billingSubmitButton']")
	public WebElement billingSubmit;
	
	//To click paypal
	@FindBy(xpath="//input[@id='is-PAYPAL']")
	public WebElement paypal;
	
	//To click edit in SubTotal
	@FindBy(xpath="//a[@title='Edit']")
	public WebElement editSubtotal;
	
	//TO click edit in Shipping address
	@FindBy(xpath="//a[@class='section-header-note']")
	public WebElement editShipping;
	
	//Back to shipping page
	@FindBy(xpath="//a[@title='Shipping']")
	public WebElement shippingPage;
	
	//To select non taxable address from saved address drop down
	public void addressDropdown() {
				
	WebElement savedAdd = driver.findElement(By.id("dwfrm_singleshipping_addressList"));
				
	Select a=new Select(savedAdd);
	a.selectByValue("OTTAWA");
	}
	
	//To click keep original address 
	@FindBy(xpath="//button[@id='buttonSelectAddressUser']")
	public WebElement keepOrg2;

	//To enter card number 
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_number']")
	public WebElement cardNumber;
	
	//To enter security code
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_cvn']")
	public WebElement securityCode;
	
	//To enter Name on Card
	@FindBy(xpath="//input[@id='dwfrm_billing_paymentMethods_creditCard_owner']")
	public WebElement nameOncard;

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
	public WebElement saveCard;
	
	//To click the Add Gift check box
	@FindBy(xpath="//div[text()='Add a Gift Certificate or Coupon']")
	public WebElement addGift;
	
	//To click the Shipping Address check box
	@FindBy(xpath="//input[@id='dwfrm_billing_billingAddress_useAsBillingAddress']")
	public WebElement shippingAddress;
	
	//To check the tax rate for Non taxable address
	@FindBy(xpath="//dd[@class='order-sales-tax-value js-taxUpdated']")
	public WebElement taxRate;

	
}
