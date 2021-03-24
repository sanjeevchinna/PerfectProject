Feature: Login into the page
Scenario: user login with valid credentials
    Given user Launch "Chrome" browser
    When when user opens "https://admin-demo.nopcommerce.com/login?"
    When user enters username as "admin@yourstore.com"
    And user enters password ad "admin"
    Then user need to login succefully
   And logout
   

Scenario Outline:: user login with valid credentials
    Given user Launch "Chrome" browser
    When when user opens "https://admin-demo.nopcommerce.com/login?"
    When user enters username as "<email>"
    And user enters password ad "<password>"
    Then user need to login succefully
    And logout
    
    Examples:
    |email|password|
    |admin@yourstore.com|admin|
    |admin@yourstore.com|admin2|
    |admin@yourstore.com|admin|