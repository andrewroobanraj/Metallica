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
  "name": "To validate all the fields in My Account Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@myaccountpage"
    }
  ]
});
formatter.step({
  "name": "User navigate to my account page",
  "keyword": "When "
});
formatter.match({
  "location": "MyAccountPage.user_navigate_to_my_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click all the links in my account page",
  "keyword": "And "
});
formatter.match({
  "location": "MyAccountPage.user_click_all_the_links_in_my_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User back to My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyAccountPage.user_back_to_My_Account_page()"
});
formatter.result({
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
  "name": "To validate all the fields in the Product Detail Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@productdetailpage"
    }
  ]
});
formatter.step({
  "name": "User navigate to product detail page",
  "keyword": "When "
});
formatter.match({
  "location": "ProductDetailPage.user_navigate_to_product_detail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User choose the size variant",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailPage.user_choose_the_size_variant()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the product quantity",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailPage.user_select_the_product_quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the product to cart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailPage.user_add_the_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User check the Einstein Product recommendations",
  "keyword": "And "
});
formatter.match({
  "location": "ProductDetailPage.user_check_the_Einstein_Product_recommendations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User add the pre-order product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailPage.user_add_the_pre_order_product_to_cart()"
});
formatter.result({
  "status": "passed"
});
});