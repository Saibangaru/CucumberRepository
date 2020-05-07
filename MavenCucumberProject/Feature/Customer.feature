Feature: customer


 Background: Below are common steps 
    Given User Launch Chrome browser
    Then User open Url "https://admin-demo.nopcommerce.com/login"
    Then Enter user email as "admin@yourstore.com" and password as "admin"
    Then click on login
    Then User can view  Dashboard
    
@sanity
  Scenario: Add a new customer
  When User click on Customer menu
  And click on customer item
  And click on Add new
  Then User can view add new  Customer page
  Then Enter Customer info
  Then Click save
  And User can see confirmation message "The new customer has been added successfully"
  Then Close browser
  
  
  @regression
  Scenario: Search Customer by EmailID
   When User click on Customer menu
  And click on customer item
  Then Enter customer email
  When Click on search button
  Then User should found email in the search table 
  Then Close browser
 
  @regression
  Scenario: Search Customer name
   When User click on Customer menu
  And click on customer item
  And Enter customer first name
  And Enter customer last name
  When Click on search button
  Then User should found name in the search table 
  Then Close browser
  
  
  
  
  
  