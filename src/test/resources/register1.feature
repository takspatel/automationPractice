Feature: register

  Scenario: open URL
    Given I GOTO URL as "https://www.d3dsecurity.co.uk/"
    When I click on register button on home page
    Given I enter first name as "first name"
    Given I enter last name"last name"
    Given I enter email address as "email address"
    Given I enter password as "password"
    Given I enter confirm password as "confirm password"
    When I click on register button
    Then I should see error message as "error"