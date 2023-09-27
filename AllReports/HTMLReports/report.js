$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Home.feature");
formatter.feature({
  "name": "To validate the Home page links in the Metallica site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Home"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate all the links navigates to page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home"
    }
  ]
});
formatter.step({
  "name": "User click the links from header/footer section",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.user_click_the_links_from_header_footer_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user directed to the appropriate pages",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.user_directed_to_the_appropriate_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the icons/images/links are clickable and navigate to the right page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home"
    }
  ]
});
formatter.step({
  "name": "User click the icons/images/links",
  "keyword": "When "
});
formatter.match({
  "location": "HomePage.user_click_the_icons_images_links()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The icons/images/links are clickable and directed to the appropriate pages",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage.the_icons_images_links_are_clickable_and_directed_to_the_appropriate_pages()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "To validate the Login functionality of Metallica application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate using valid credential in the login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter valid email id and valid password in the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_Enter_valid_email_id_and_valid_password_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate using Invalid credential in the login page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.step({
  "name": "Enter invalid credentials \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Metallica1@gmail.com",
        "metallica123"
      ]
    },
    {
      "cells": [
        "andrewroobanraaj@gmail.com",
        "Metallica@23"
      ]
    },
    {
      "cells": [
        "metallicaabc@gmail.com",
        "Metallica@2"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate using Invalid credential in the login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid credentials \"Metallica1@gmail.com\" and \"metallica123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.enter_invalid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate using Invalid credential in the login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid credentials \"andrewroobanraaj@gmail.com\" and \"Metallica@23\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.enter_invalid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate using Invalid credential in the login page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter invalid credentials \"metallicaabc@gmail.com\" and \"Metallica@2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.enter_invalid_credentials_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate user is not able to create new account using already registered email address in the login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User navigate to login page",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Create Account button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.click_Create_Account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter already existing email address in create account form and submit",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enter_already_existing_email_address_in_create_account_form_and_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Featurefiles/Registration.feature");
formatter.feature({
  "name": "To validate the Registration form in the Metallica application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate by entering the valid details in the Registration form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "name": "User navigate to registration page",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationPage.user_navigate_to_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entering all the required fields with valid information",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationPage.user_entering_all_the_required_fields_with_valid_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter invalid values in the fields",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPage.user_enter_invalid_values_in_the_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The error message is displayed to enter valid information",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationPage.the_error_message_is_displayed_to_enter_valid_information()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in metallica home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_metallica_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the mandatory fields in the registration form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Registration"
    }
  ]
});
formatter.step({
  "name": "User navigate to registration page",
  "keyword": "When "
});
formatter.match({
  "location": "RegistrationPage.user_navigate_to_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click apply button without enter values in mandatory fields",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationPage.user_click_apply_button_without_enter_values_in_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message is displayed to fill the mandatory fields",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPage.error_message_is_displayed_to_fill_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});