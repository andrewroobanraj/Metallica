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
  "name": "To validate login \u0026 logout using valid userName and valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
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
  "name": "User enter valid userName and valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enter_valid_userName_and_valid_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in a dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_in_a_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Logout",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_Logout()"
});
formatter.result({
  "status": "passed"
});
});