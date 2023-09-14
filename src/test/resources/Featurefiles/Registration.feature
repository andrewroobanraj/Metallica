@Registration
Feature: To validate the Registration form in the Metallica application

 Background:
		Given User is in metallica home page
		
		Scenario: Validate by entering the valid details in the Registration form
			When User navigate to registration page
			And  User entering all the required fields with valid information
			Then User enter invalid values in the fields
			And  The error message is displayed to enter valid information
			
		Scenario: Validate the mandatory fields in the registration form
			When User navigate to registration page
			And  User click apply button without enter values in mandatory fields
			Then Error message is displayed to fill the mandatory fields