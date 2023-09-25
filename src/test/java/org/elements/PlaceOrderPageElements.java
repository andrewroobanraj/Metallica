package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPageElements extends BaseClass{
	
	//default constructor
	public PlaceOrderPageElements() {
						
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//a[@class='back-to-cart']")
	public WebElement backTocart;

	@FindBy(xpath="(//a[@class='section-header-note'])[2]")
	public WebElement editBillingaddress;
	
	@FindBy(xpath="(//a[@class='section-header-note'])[3]")
	public WebElement editPayment;
	
	//To check the Totals
	@FindBy(xpath="(//dd[@class='order-subtotal-value js-miniCartSubtotals'])[2]")
	public WebElement subTotal;
	
	@FindBy(xpath="(//dd[@class='order-sales-tax-value js-taxUpdated'])[2]")
	public WebElement taxRate;
	
	@FindBy(xpath="(//dd[@class='order-value order-total-value js-estimatedTotalUpdated'])[2]")
	public WebElement totalOrder;
	
	//To check the international policy checkbox 
	@FindBy(xpath="//input[@id='dwfrm_vatdisclaimer_shipIntNoVat']")
	public WebElement intPolicyCheckBox;
	
	//To check the place order button is disable
	@FindBy(xpath="//button[@disabled='disabled']")
	public WebElement disabledPlaceOrderButton;
}
