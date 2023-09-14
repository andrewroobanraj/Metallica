package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements extends BaseClass{
	
	    //default constructor
		public HomePageElements() {
			
			PageFactory.initElements(driver, this);	
		}
		
		//Click Cart Icon
		@FindBy(className="svg-icon-bag-dims")
		public WebElement cartIcon;
		
		//Back To Home Page
		@FindBy(id="Layer_1")
		public WebElement homePage;
		
		//Back to Home page from  user profile page
		@FindBy(xpath="(//a[@title='Metallica Home'])[1]")
		public WebElement toHomePage;
		
		//Click Search Menu
		@FindBy(className="svg-menu-search-dims")
		public WebElement searchMenu;
		
		//Close the Search Menu
		@FindBy(xpath="(//span[text() ='Close'])[1]")
		public WebElement closeSearch;
		
		//Click Met Store
		@FindBy(xpath="(//a[@class='has-sub-menu dropdown-toggle header-nav-link header-nav-link--l1 js-nav-link'])[7]")
		public WebElement metStore;
		
		//Click Help link
		@FindBy(xpath="//a[text()='Help']")
		public WebElement helplink;
		
		//Click Credits link
		@FindBy(xpath="//a[text()='Credits']")
		public WebElement creditsLink;
		
		//Click Terms of Use link
		@FindBy(xpath="//a[text()='Terms of Use']")
		public WebElement termsOfuseLink;
		
		//Click Privacy Policy link
		@FindBy(xpath="//a[text()='Privacy Policy']")
		public WebElement privacyPolicylink;
		
		//Click AWMH
		@FindBy(xpath="(//span[text()='All Within My Hands Foundation'])[2]")
		public WebElement AWMH;
		
		//Click Fifth Member Fans Club
		@FindBy(xpath="//img[@alt='Fifth Member Fan Club']")
		public WebElement fifthMember;
		
		//Click View all Tour Dates
		@FindBy(xpath="//span[text()='View All Tour Dates']")
		public WebElement tourDates;
		
		//Click Photos Section
		@FindBy(xpath="//a[text()='Photo']")
		public WebElement photos;
		
		//Click Videos Section
		@FindBy(xpath="//a[text()='Video']")
		public WebElement videos;
		
		//Click Instagram Icon
		@FindBy(xpath="(//img[@alt ='Instagram'])[2]")
		public WebElement instagram;
		
		//Click Product 
		@FindBy(xpath="//a[@title = 'Go to Product: Band 72 Seasons Tracks T-Shirt']")
		public WebElement product;

}
