Feature: Delete Contact


  Scenario: Check deleting a contact
    Given I am on the homepage page
    And I enter details
    When I retrieve contact detail "adam"
    Then I can delete the contact details successfully

  