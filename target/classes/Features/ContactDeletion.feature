Feature: Delete Contact


  Scenario: Check deleting a contact
    Given I am on the login page
    And I enter login details
    When I search contact details for "bob"
    Then I can purge the contact "bob_first bob_middle bob_last" details successfully

  