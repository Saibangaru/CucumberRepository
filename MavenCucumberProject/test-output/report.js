$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/Customer.feature");
formatter.feature({
  "name": "customer",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are common steps",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open Url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.user_open_Url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter user email as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.enter_user_email_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view  Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.user_can_view_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a new customer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User click on Customer menu",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.user_click_on_Customer_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on customer item",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.click_on_customer_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add new",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.click_on_Add_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view add new  Customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.user_can_view_add_new_Customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Customer info",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.enter_Customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click save",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.click_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can see confirmation message \"The new customer has been added successfully\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.user_can_see_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.NopCommerceLoginPage.close_browser()"
});
formatter.result({
  "status": "passed"
});
});