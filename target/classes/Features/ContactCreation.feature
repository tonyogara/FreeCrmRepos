Feature: Check contact creation

  Scenario Outline: Check contact creationx
  #Scenario: Check contact creationx
    
    Given I am on the login page
    And I enter details
    And I see the logged in page
    When I select the contact link
    And select the New button
    And user enters first name "<firstname>" and last name "<lastname>" and middle name "<middlename>" and company name "<companyname>"
    And select save button
    #Then the contact is saved successfully

    Examples: 
      | firstname  | lastname   | middlename 	| companyname  |
      | adam_first | adam_last  | adam_middle | adam_company |
      | bob_first	 | bob_last	  | bob_middle  | bob_company  |

      
      