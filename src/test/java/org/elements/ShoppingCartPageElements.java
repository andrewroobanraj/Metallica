package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPageElements extends BaseClass{
	
	//default constructor
	public ShoppingCartPageElements() {
				
	PageFactory.initElements(driver, this);	
	
	}
	
	//To close the mini cart 
	@FindBy(xpath="(//button[@class='mini-cart-close js-mini-cart-close primary-link'])[1]")
	public WebElement closeCart;

	//To select the product
	@FindBy(xpath="//a[@title='Go to Product: Band 72 Seasons Tracks T-Shirt']")
	public WebElement secondProduct;

	//To select the product size
	@FindBy(xpath="(//a[@class='swatchanchor'])[2]")
	public WebElement productSize;

	//To click the checkout button
	@FindBy(xpath="//a[@title='Checkout']")
	public WebElement checkOut;

	//To select the Product quantity
	@FindBy(xpath="(//div[@class='c-product-quantity__button js-quantity-quantity__button js-product-quantity__button--up c-product-quantity__button--up product-quantity-up'])[1]")
	public WebElement productQty;
	
	//To select the 2nd Product quantity
	@FindBy(xpath="(//div[@class='c-product-quantity__button js-quantity-quantity__button js-product-quantity__button--up c-product-quantity__button--up product-quantity-up'])[2]")
	public WebElement productQty2;
	
	//Navigate to PDP from cart page
	@FindBy(xpath="(//a[@title='Go to Product: M Logo 72 Seasons Tracks T-Shirts - Medium'])[4]")
	public WebElement toPDP;
	
	//To remove product from cart page
	@FindBy(xpath="(//button[@class='button-text'])[1]")
	public WebElement removeCart;
	
	//To click guest user radio button
	@FindBy(xpath="(//input[@type='radio'])[2]")
	public WebElement guestRadio;

	//To click guest checkout button
	@FindBy(xpath="(//button[@class='add-to-cart button button--cta checkout guest-checkout cart-button'])")
	public WebElement guestCheckout;

	//To enter guest email
	@FindBy(xpath="(//input[@class='input-text emailAddress required'])")
	public WebElement guestmail;

	//Back to cart form shipping page
	@FindBy(xpath="(//span[@class='label label--desktop'])")
	public WebElement backToCart;

	//To enter password in cart page
	@FindBy(xpath="(//input[@class='input-text  required'])")
	public WebElement cartPassword;

	//To click user checkout button
	@FindBy(xpath="(//button[@class='add-to-cart button button--cta checkout login cart-button'])")
	public WebElement userCheckout;
	
}