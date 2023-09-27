@MyAccount
Feature: To Validate the My Account Page in the Metallica application

	Background:
			Given User is in metallica home page
			
	Scenario: Validate the links are clickable in My Account Page
			When User navigate to my account page
			And  User click all the links in my account page
			Then User is navigated to appropriate pages
		
	Scenario: Validate the addresses are able to delete and add
			When User navigate to my account page
			And  User add a new address
			Then User delete the address from Saved addresses
		
	Scenario: Validate Download my data button
			When User navigate to my account page
			Then User click download my data button
		