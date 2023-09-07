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
  "name": "To validate all the fields in the Shipping Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@shippingpage"
    }
  ]
});
formatter.step({
  "name": "User navigate to shipping page",
  "keyword": "When "
});
formatter.match({
  "location": "ShippingPage.user_navigate_to_shipping_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate the mandatory fields",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_validate_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validate the shipping address fields",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_validate_the_shipping_address_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select address from saved address dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_select_address_from_saved_address_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Use this address checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_click_the_Use_this_address_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Is this a Gift checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_click_the_Is_this_a_Gift_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the Shipping Method",
  "keyword": "Then "
});
formatter.match({
  "location": "ShippingPage.user_select_the_Shipping_Method()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User check shipping method label for Pre Order product",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_check_shipping_method_label_for_Pre_Order_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Continue to billing button",
  "keyword": "And "
});
formatter.match({
  "location": "ShippingPage.user_click_the_Continue_to_billing_button()"
});
formatter.result({
  "status": "passed"
});
});