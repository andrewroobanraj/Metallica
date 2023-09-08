$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Metallica.feature");
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
  "name": "To validate all the fields in the Category Browser Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@categorybrowserpage"
    }
  ]
});
formatter.step({
  "name": "User navigate to Met Store",
  "keyword": "When "
});
formatter.match({
  "location": "CategoryBrowserPage.user_navigate_to_Met_Store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the product image",
  "keyword": "And "
});
formatter.match({
  "location": "CategoryBrowserPage.user_click_the_product_image()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User apply the filters in the left panel",
  "keyword": "And "
});
formatter.match({
  "location": "CategoryBrowserPage.user_apply_the_filters_in_the_left_panel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to next page by clicking page numbers",
  "keyword": "And "
});
formatter.match({
  "location": "CategoryBrowserPage.user_navigate_to_next_page_by_clicking_page_numbers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the view all link",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoryBrowserPage.user_click_the_view_all_link()"
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
  "name": "To validate all the fields in the shopping cart page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@shoppingcartpage"
    }
  ]
});
formatter.step({
  "name": "User add some products to cart",
  "keyword": "When "
});
formatter.match({
  "location": "ShoppingCartPage.user_add_some_products_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User change the product quantity",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCartPage.user_change_the_product_quantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to PDP by clicking product link",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCartPage.user_navigate_to_PDP_by_clicking_product_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User remove the product from cart",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCartPage.user_remove_the_product_from_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checkout as a guest",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingCartPage.user_checkout_as_a_guest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User login in cart page and checkout",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCartPage.user_login_in_cart_page_and_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logout and login again to check the cart products",
  "keyword": "And "
});
formatter.match({
  "location": "ShoppingCartPage.user_logout_and_login_again_to_check_the_cart_products()"
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