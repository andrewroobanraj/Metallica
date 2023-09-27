package org.stepdefinition;

import org.base.BaseClass;
import org.elements.LoginElements;
import org.elements.MyAccountPageElements;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountPage extends BaseClass {

	MyAccountPageElements myAccount = new MyAccountPageElements();
	LoginElements login = new LoginElements();

	int timeoutInSeconds = 10;

	@When("User navigate to my account page")
	public void user_navigate_to_my_account_page() {

		btnClick(login.profileIcon);
		waitForPageToLoad(timeoutInSeconds);

		fill(login.userName, "andrewroobanraaj@gmail.com");
		fill(login.password, "Metallica@2");

		btnClick(login.loginButton);
		waitForPageToLoad(timeoutInSeconds);

	}

	@When("User click all the links in my account page")
	public void user_click_all_the_links_in_my_account_page() {

		btnClick(myAccount.personalInfo);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.myAccount);

		btnClick(myAccount.orderHis);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.myAccount);

		btnClick(myAccount.paySetting);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.myAccount);

		btnClick(myAccount.presaleCodes);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.myAccount);

		btnClick(myAccount.freeDownload);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.myAccount);

		btnClick(myAccount.contests);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.myAccount);

		btnClick(myAccount.vinylClub);
		waitForPageToLoad(timeoutInSeconds);

	}
	
	@Then("User is navigated to appropriate pages")
	public void user_is_navigated_to_appropriate_pages() {
	   
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("https://www.metallica.com/vinyl-club-subscription-management/"));
		System.out.println("User is navigated to appropriate pages");
		
		toClose();
	}

	@Then("User click download my data button")
	public void user_click_download_my_data_button() {

		btnClick(myAccount.downloadMyData);

		myAccount.downloadResult();
		System.out.println("File Downloaded Successfully");
		
		toClose();

	}

	@When("User add a new address")
	public void user_add_a_new_address() {

		btnClick(myAccount.addresses);
		waitForPageToLoad(timeoutInSeconds);

		btnClick(myAccount.addNewAddress);
		waitForPageToLoad(timeoutInSeconds);

		fill(myAccount.addressName, "Palayamkottai");
		fill(myAccount.address1, "46,South Street");
		fill(myAccount.firstName, "Andrew");
		fill(myAccount.lastName, "Raj");
		fill(myAccount.city, "Tirunelveli");
		fill(myAccount.zipcode, "627002");
		myAccount.country();
		fill(myAccount.state, "TamilNadu");
		fill(myAccount.phone, "7010537032");

		btnClick(myAccount.applyButton);
		waitForPageToLoad(timeoutInSeconds);
		
	}

	@Then("User delete the address from Saved addresses")
	public void user_delete_the_address_from_Saved_addresses() {
		
		btnClick(myAccount.deleteAddress);

		alert();

		waitForPageToLoad(timeoutInSeconds);
		
		//String address = myAccount.addressPage.getText();
		//System.out.println(address);
		Assert.assertFalse(myAccount.addressPage.getText().contains("Palayamkottai"));
		System.out.println("User add and delete the address from Addresses page");
		
	} 

}
