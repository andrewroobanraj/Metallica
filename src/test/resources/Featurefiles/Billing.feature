@Billing
Feature: To validate the fields in Billing page 

	Background:
		Given User is in metallica home page
	
	Scenario: Validate the valid error message appears for skipping the required fields and for the invalid data
		When User Add an product to cart
		And  User Checkout from cart page
		And  User navigate to billing page
		Then User Skip any mandatory field and proceed
		And  User enter invalid data and proceed
	
	Scenario: Validate whether the Tax is collected for the right states
		When User Add an product to cart
		And  User Checkout from cart page
		Then User enter a Taxable state address 
		And  User click the Continue to billing button with Taxable address
		
	Scenario: Validate whether the Tax is not collected for the non-Taxable states
		When User Add an product to cart
		And  User Checkout from cart page
		Then User enter non-Taxable state address
		And  User click the Continue to billing button with non-Taxable address
	@unit	
	Scenario: Validate by clicking the review order button
		When User Add an product to cart
		And  User Checkout from cart page
		And  User navigate to billing page
		And  User enter card details
		Then User click the Review Order button
	
	Scenario: Verify whether the International Shipping Policy message is not displayed in Billing page
		When User Add an product to cart
		And  User Checkout from cart page
		And  User select the International Shipping address
		Then User navigated to shipping page without Policy message
	
	Scenario: Verify whether the Customer is directed to Place order page without the International Shipping Policy check in Billing page
		When User Add an product to cart
		And  User Checkout from cart page
		And  User select the International Shipping address
		And  User enter card details
		Then User navigated to place order page without Policy message
			
	
	
	
	
	
	
	
	