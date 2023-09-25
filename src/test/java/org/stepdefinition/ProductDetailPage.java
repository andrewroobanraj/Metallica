package org.stepdefinition;

import java.awt.AWTException;

import org.base.BaseClass;
import org.elements.CategoryBrowserPageElements;
import org.elements.HomePageElements;
import org.elements.ProductDetailPageElements;
import org.junit.Assert;

import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductDetailPage extends BaseClass {

	HomePageElements home = new HomePageElements();
	CategoryBrowserPageElements category = new CategoryBrowserPageElements();
	ProductDetailPageElements product = new ProductDetailPageElements();

	int timeoutInSeconds = 10;

	@When("User navigate to Met store")
	public void user_navigate_to_Met_store() {

		performMoveToElement(home.metStore);

		btnClick(category.shopAll);
		waitForPageToLoad(timeoutInSeconds);

		scrollToProducts();
	}

	@Then("User select any Product")
	public void user_select_any_Product() {

		btnClick(product.product);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(product.prodImage.isDisplayed());
		System.out.println("The Product Image is Displayed");

		Assert.assertTrue(product.description.isDisplayed());
		System.out.println("The Product Description is Displayed");

		toClose();

	}

	@When("User select any Product in Met Store")
	public void user_select_any_Product_in_Met_Store() {

		btnClick(product.product);
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User click the Add to Cart button")
	public void user_click_the_Add_to_Cart_button() {

		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(product.productAdded.isDisplayed());
		System.out.println("The Product is added to Cart");

		toClose();

	}

	@Then("User click the Add Quantity button in PDP")
	public void user_click_the_Add_Quantity_button_in_PDP() {
		
		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.productQty);
		waitForPageToLoad(timeoutInSeconds);
		
		btnClick(product.productSize2);
		waitForPageToLoad(timeoutInSeconds);
		
		Assert.assertTrue(product.quantityValue.isDisplayed());
		System.out.println("The Product Quantity is Added");

		toClose();
	}

	@Then("User click the Size variant")
	public void user_click_the_Size_variant() {

		btnClick(product.productSize);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(product.sizeName.isDisplayed());
		System.out.println("The Product Size variant is selected");

		toClose();
	}

	@When("User Add a Pre-order product  to cart")
	public void user_Add_a_Pre_order_product_to_cart() throws AWTException {

		btnClick(home.searchMenu);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(product.search);

		fill(product.enterText, "LIVE METALLICA: EAST RUTHERFORD, NJ - AUGUST 6, 2023 (2CD)");

		performEnter();

		waitForPageToLoad(timeoutInSeconds);

		// btnClick(product.productSize);
		// waitForPageToLoad(timeoutInSeconds);

	}

	@When("User Click the Pre-order CTA")
	public void user_Click_the_Pre_order_CTA() {

		btnClick(product.addTocart);
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User select the Pre-order product policy checkbox")
	public void user_select_the_Pre_order_product_policy_checkbox() {

		btnClick(product.checkBox);
		waitForPageToLoad(timeoutInSeconds);

	}

	@Then("User Add the product to cart")
	public void user_Add_the_product_to_cart() {

		btnClick(product.preOrdercart);
		waitForPageToLoad(timeoutInSeconds);

		Assert.assertTrue(product.cartQuantity.isDisplayed());
		System.out.println("Pre-Order Product is added to Cart");
		
		toQuit();

	}

	@Then("User see the Einstein Product recommendations below the product")
	public void user_see_the_Einstein_Product_recommendations_below_the_product() {
		
		toRefresh();
		
		Assert.assertTrue(product.einsteinProd.isDisplayed());
		System.out.println("Einstein Product recommendations are Displayed below the product");
		
		toClose();
		
	}

	

}
