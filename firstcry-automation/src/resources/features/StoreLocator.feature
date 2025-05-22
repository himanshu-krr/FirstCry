Feature: Store Locator Functionality

  Scenario: Login and Navigate to Store Locator
    Given user is on Firstcry homepage
    When user logs in with mobile number "7004481495" and OTP "123456"
    And user hovers on "Stores & Preschools"
    And user clicks on "Find Stores"
    Then Store locator page should be displayed

  Scenario: Search stores with valid inputs
    When user selects store type "FirstCry"
    And user selects state "Maharashtra"
    And user selects city "Pune"
    And user clicks on Search
    Then user should see store details

  Scenario: Search stores with invalid inputs
    When user clicks on Search without selecting any filter
    Then user should not see any results
