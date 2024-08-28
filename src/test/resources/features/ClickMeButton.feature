Feature: Click Me Button Test

  Scenario: User clicks the "Click Me" button and verifies the message
    Given I navigate to the "Elements" page
    When I click on the "Buttons" option
    And the "Buttons" page is displayed
    When I click the "Click Me" button
    Then I should see the message "You have done a dynamic click" displayed
