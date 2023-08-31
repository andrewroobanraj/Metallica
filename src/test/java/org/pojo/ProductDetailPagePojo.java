package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPagePojo extends BaseClass {
	
		//default constructor
		public ProductDetailPagePojo() {
							
		PageFactory.initElements(driver, this);	
	}

		//To select the Product
		@FindBy(xpath="//a[@title='Go to Product: M Logo 72 Seasons Tracks T-Shirts']")
		private WebElement product;
		
		public WebElement getProduct() {
			return product;
		}
		
		//To select the Product size
		@FindBy(xpath="(//a[@class='swatchanchor'])[2]")
		private WebElement productSize;
		
		public WebElement getProductSize() {
			return productSize;
		}
		
		//To select the Product quantity
		@FindBy(xpath="(//div[@class='c-product-quantity__button js-quantity-quantity__button js-product-quantity__button--up c-product-quantity__button--up product-quantity-up'])")
		private WebElement productQty;
		
		public WebElement getProductQty() {
			return productQty;
		}
		
		//To add the product to cart
		@FindBy(xpath="//button[@id='add-to-cart']")
		private WebElement addTocart;
		
		public WebElement getAddTocart() {
			return addTocart;
		}
		
		//To remove the product from cart
		@FindBy(xpath="(//button[@type='button'])[1]")
		private WebElement remove;

		public WebElement getRemove() {
			return remove;
		}
		
		//To move next slide in Einstein Product recommendations
		@FindBy(xpath="//button[@id='slick-slide-control17']")
		private WebElement nextSlide;
		
		public WebElement getNextSlide() {
			return nextSlide;
		}
		
		//To move previous slide in Einstein Product recommendations
		@FindBy(xpath="//button[@id='slick-slide-control10']")
		private WebElement previousSlide;

		public WebElement getPreviousSlide() {
			return previousSlide;
		}
		
		//To click the search field
		@FindBy(xpath="//button[@class='search-toggle']")
		private WebElement search;

		public WebElement getSearch() {
			return search;
		}
		
		//To enter product name in search field
		@FindBy(xpath="//input[@type='text']")
		private WebElement enterText;
				
		public WebElement getEnterText() {
			return enterText;
		}

		//To select pre-order check box
		@FindBy(xpath="//input[@id=\"preorder-acknowledgement\"]")
		private WebElement checkBox;

		public WebElement getCheckBox() {
			return checkBox;
		}
		
		//To add pre-order product to cart
		@FindBy(xpath="//button[@class='preorder-add-to-cart button button--cta']")
		private WebElement preOrdercart;

		public WebElement getPreOrdercart() {
			return preOrdercart;
		}
		
		
}
