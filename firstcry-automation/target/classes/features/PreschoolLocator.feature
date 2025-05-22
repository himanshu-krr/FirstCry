Feature: Preschool Locator Functionality

  Scenario: Navigate to Preschool Locator
    Given user hovers on "Stores & Preschools"
    When user clicks on "Find Preschools"
    Then Preschool locator page should be displayed

  Scenario: Search with valid pincode
    When user enters pincode "411014"
    And clicks on submit
    Then user should see preschools in that area

  Scenario: Search with invalid pincode
    When user enters pincode "633456"
    And clicks on submit
    Then user should see message "Ooopss… We don't have a FirstCry Intellitots Preschool in your area."

  Scenario: Submit without entering pincode
    When user clicks on submit without entering pincode
    Then submit button should be disabled
