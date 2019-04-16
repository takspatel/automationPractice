Feature: Sign in

  Scenario: open URL
    Given I goto URL as "https://www.d3dsecurity.co.uk"
    When I click login button on Home page
    Given I enter user name as "test@gmail.com"
    Given I enter password  "password123"
    When I click login button on login page
    Then I should see error message"wrong credentials"
