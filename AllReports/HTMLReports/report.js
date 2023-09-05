$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "To validate the functionality of Metallica application",
  "description": "",
  "keyword": "Feature"
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
  "name": "To validate all the fields in the Place Order Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@placeorderpage"
    }
  ]
});
formatter.step({
  "name": "User navigate to place order page",
  "keyword": "When "
});
formatter.match({
  "location": "PlaceOrderPage.user_navigate_to_place_order_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the edit cart link",
  "keyword": "And "
});
formatter.match({
  "location": "PlaceOrderPage.user_click_the_edit_cart_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the edit button in payment and billing address fields",
  "keyword": "And "
});
formatter.match({
  "location": "PlaceOrderPage.user_click_the_edit_button_in_payment_and_billing_address_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User redirected to billing page to edit the payment and billing address",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaceOrderPage.user_redirected_to_billing_page_to_edit_the_payment_and_billing_address()"
});
formatter.result({
  "status": "passed"
});
});