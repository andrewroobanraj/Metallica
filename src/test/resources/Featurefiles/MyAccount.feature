@MyAccount
Feature: To Validate the My Account Page in the Metallica application

	Background:
			Given User is in metallica home page
			
	Scenario: Validate the links are clickable in My Account Page
			When User navigate to my account page
			And  User click all the links in my account page
			Then User click download my data button 
			