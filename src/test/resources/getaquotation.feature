Feature: Get a Free Quotation

  Scenario: Get a free quotation
    Given I enter URL as "https://www.d3dsecurity.co.uk/"
    When I click on login button on home page
    Given I entered " valid first name"
    Given I entered as "valid Last Name"
    Given I entered valid email address as "email@yahoo.com"
    Given I entered valid phone number "01234567"
    Given I entered subject as "subject"
    Given I entered message as "abcdefghijk"
    Given I entered captcha code as shown on the page"test"
    When I click on send message button
    Then I should be able to see "Thanks For Inquiry, We will Contact you Soon!!"