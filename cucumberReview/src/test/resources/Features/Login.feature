Feature: test the login functionality
  Scenario: validate admin login
    Given the user navigates to the url
    When user enters a valid email and password
    And clicks on Login Button
    Then the user is logged in