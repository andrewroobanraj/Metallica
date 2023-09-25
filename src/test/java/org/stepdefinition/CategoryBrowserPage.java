package org.stepdefinition;

import org.base.BaseClass;
import org.elements.CategoryBrowserPageElements;
import org.elements.HomePageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryBrowserPage extends BaseClass {

	HomePageElements home = new HomePageElements();
	CategoryBrowserPageElements category = new CategoryBrowserPageElements();

	int timeoutInSeconds = 10;

	@When("User navigate to Met Store")
	public void user_navigate_to_Met_Store() {

		performMoveToElement(home.metStore);

		btnClick(category.shopAll);
		waitForPageToLoad(timeoutInSeconds);

		scrollToProducts();

	}

	@When("User see the Product tile with product image and price")
	public void user_see_the_Product_tile_with_product_image_and_price() {

		category.productTile.isDisplayed();
		category.productImage.isDisplayed();
		category.productPrice.isDisplayed();
		System.out.println("The Product tile is displayed with product Image and Price");
	}

	@When("User click the product image")
	public void user_click_the_product_image() {

		btnClick(category.productImage);
		waitForPageToLoad(timeoutInSeconds);
		System.out.println("User is able to click the Product Image");

		btnClick(category.shop);
		waitForPageToLoad(timeoutInSeconds);
	}

	@Then("user see the product badge in single line")
	public void user_see_the_product_badge_in_single_line() {

		Assert.assertTrue(category.productBadge.isDisplayed());
		System.out.println("The Product badge is displayed");
		
		toClose();

	}

	@Then("User apply the filters in the left panel")
	public void user_apply_the_filters_in_the_left_panel() throws InterruptedException {

		btnClick(category.priceFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.clearFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.deptFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.clearFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.sizeFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.clearFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.featureFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.clearFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.albumFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.clearFilter);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(category.artistFilter);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(category.clearFilter.isEnabled());
		System.out.println("The Clear button is only enabled after filter is applied");

		btnClick(category.clearFilter);
		waitForPageToLoad(timeoutInSeconds);
		
		toClose();

	}

	@When("User click the page numbers")
	public void user_click_the_page_numbers() {

		pageNoscroll();

		btnClick(category.pageNo2);
		waitForPageToLoad(timeoutInSeconds);

		pageNoscroll();

		btnClick(category.pageNo3);
		waitForPageToLoad(timeoutInSeconds);
		System.out.println("User click the Page No:3");
		
		pageNoscroll();
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User navigated to that page")
	public void user_navigated_to_that_page() {
		
		Assert.assertTrue(category.currentPageNo.isDisplayed());
		System.out.println("User Navigated to Page 3");	
		
		toClose();
		
	}

	@When("User click the view all link")
	public void user_click_the_view_all_link() throws InterruptedException {

		pageNoscroll();
		
		btnClick(category.viewAll);
		waitForPageToLoad(timeoutInSeconds);

	}
	
	@Then("User see all the products in a single page")
	public void user_see_all_the_products_in_a_single_page() {
	   
		scrollUp();

		String url = driver.getCurrentUrl();

		Assert.assertTrue(url.contains("https://www.metallica.com/store/?viewAll=true"));

		System.out.println("All the products are displayed in a Single Page");

		toQuit();
	}

}
