Feature:  Employee
  @testcase2
  Scenario: Adding a new Employee
   # Given open the browser and launch HRMS application
    When users enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    And user clicks on add employee button
    And user enters firstname and middlename and lastname
    #And use clicks on save button
