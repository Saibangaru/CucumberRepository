Feature: OrangeHRM Login
  Scenario: Logo presence on HRM page
    Given I launch chrome browser
    When I open orange HRM home page
    Then I verify that logo present on the page
    And close browser
    