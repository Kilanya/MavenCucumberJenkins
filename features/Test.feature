Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open Chrome and start application
    When I enter valid "<email>" and valid "pass"
    Then user should be able to login successfully
    Then application should be closed
   
    Examples: 
      | username       | password  |
      | abc@gmail.com  | password1 |