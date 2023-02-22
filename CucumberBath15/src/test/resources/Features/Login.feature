Feature: login functionalities
  @smoke
  Scenario: Valid Admin login
    #Given open the browser and launch HRMS application
    When users enters valid email and valid password
    And click on login button
    Then user is logged in successfully
    #And Close the browser

  @smoke2
  Scenario: Valid Admin login
    #Given open the browser and launch HRMS application (Hooks will execute automatically)
    When users enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
    #And Close the browser (Hooks will execute automatically)

  @scenarioOutline
  #Parameterization/ Data Driven
  Scenario Outline:
    #Given open the browser and launch HRMS application
    When users enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully
    #And Close the browser
    Examples:
      |username| password|
      |admin   | Hum@nhrm123|
      |ADMIN   | Hum@nhrm123|
      |Jason   | Hum@nhrm123|

    @dataTable
    Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login
      |username| password   |
      |admin   | Hum@nhrm123|
      |ADMIN   | Hum@nhrm123|
      |Jason   | Hum@nhrm123|