Feature: Login NopCommerce page
  Scenario: Successful login with valid credentials
  Given User Launch Chrome browser
  When User open Url "https://admin-demo.nopcommerce.com/login"
  And Enter user email as "admin@yourstore.com" and password as "admin"
  And click on login
  Then page title should be "Dashboard / nopCommerce administration"
  When User click on logout link
  Then page title should be "Your store. Login"
  And Close browser

Scenario Outline: Login with Multiple credentials
   Given User Launch Chrome browser
  When User open Url "https://admin-demo.nopcommerce.com/login"
  And Enter user email as "<email>" and password as "<password>"
  And click on login
  Then page title should be "Dashboard / nopCommerce administration"
  When User click on logout link
  Then page title should be "Your store. Login"
  And Close browser
  
  Examples:
  |email|password|
  |admin1@yourstore.com | admin1|
  
  
