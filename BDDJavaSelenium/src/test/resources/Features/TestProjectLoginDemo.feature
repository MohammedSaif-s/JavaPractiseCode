Feature: Test Login Functionality

  Scenario: Check the Test project login page is successful with valid credentials
    Given browser page is open
    And user is on the login page
    When user enters the valid username and password
    And user clicks login page 
    Then user is navigated to the home page