Feature: Check contact creation

  Scenario Outline: Check contact creation
  #Scenario: Check contact creationx
    
    Given I am on the login page
    And I enter login details
    And I see the logged in page
    When I select the contact link
    And select the New button
    And user enters first name "<firstname>" and last name "<lastname>" and middle name "<middlename>"
    And select save button
    Then the contact is saved successfully as saved "<contactname>"

    Examples: 
      | firstname  | lastname   | middlename 	| contactname   			 |
      | adam_first | adam_last  | adam_middle | adam_first adam_last |
      #| bob_first	 | bob_last	  | bob_middle  | bob_company  			 |

      
      