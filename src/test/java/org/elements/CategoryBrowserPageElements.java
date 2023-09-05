package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryBrowserPageElements extends BaseClass{
	
		//default constructor
		public CategoryBrowserPageElements() {
						
			PageFactory.initElements(driver, this);	
		}

		//Navigate to Met Store
		@FindBy(xpath="//img[@alt='SHOP ALL']")
		public WebElement shopAll;

		//To click the product image
		@FindBy(xpath="//a[@title='Go to Product: 72 Seasons Silver Ring']")
		public WebElement product;
		
		//Back to category page
		@FindBy(xpath="//a[@title='Go to Shop']")
		public WebElement shop;

		//To select the price filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[1]")
		public WebElement priceFilter;
		
		//To clear the applied filter
		@FindBy(xpath="//a[@class='js-clear-filters breadcrumb-refinement-value breadcrumb-refinement-value--clear button--secondary']")
		public WebElement clearFilter;
		
		//To select the department filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[7]")
		public WebElement deptFilter;
		
		//To select the size filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[11]")
		public WebElement sizeFilter;
		
		//To select the feature filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[19]")
		public WebElement featureFilter;
		
		//To select the album filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[22]")
		public WebElement albumFilter;
		
		//To select the artist filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[39]")
		public WebElement artistFilter;

		//To navigate page 2
		@FindBy(xpath="//a[@class='page-2']")
		public WebElement pageNo2;
		
		//To navigate page 3
		@FindBy(xpath="//a[@class='page-3']")
		public WebElement pageNo3;
		
		//To click view all link
		@FindBy(xpath="//a[@class='view-all']")
		public WebElement viewAll;

				
}
