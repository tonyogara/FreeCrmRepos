@tag
Feature: Check logins

  @tag1
  Scenario: Check valid login
    Given I am on the login page
    When I enter details
    Then I see the logged in page
	
    