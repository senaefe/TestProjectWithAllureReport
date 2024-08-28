Feature: Add and Edit Record Test

  Scenario: User adds a new record and then edits the name
    Given I navigate to the "Webtables" page in Add Record
    When I click the Add button
    Then I should see the Registration Form displayed
    When I enter first name "Sena" and last name "Efe"
    And I enter email "senaefe@gmail.com"
    And I enter age "28"
    And I enter salary "77000"
    And I enter department "Software"
    And I submit the record
    Then I should see the new record with first name "Sena" and last name "Efe" in the table

    When I click the Edit button for the recently added record
    Then I should see the Registration Form displayed with the record's details
    When I update first name to "Aylin"
    And I submit the record
    Then I should see the updated record with first name "Aylin" and last name "Efe" in the table
