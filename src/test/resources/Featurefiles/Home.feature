@Home
Feature: To validate the Home page links in the Metallica site

 Background:
		Given User is in metallica home page
 
 Scenario: Validate all the links navigates to page
 		When User click the links from header/footer section
 		Then user directed to the appropriate pages

 Scenario: Validate the icons/images/links are clickable and navigate to the right page
 		When User click the icons/images/links 
 		Then The icons/images/links are clickable and directed to the appropriate pages