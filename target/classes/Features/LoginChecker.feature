Feature: Check logins


  Scenario: Check valid login
    Given I am on the login page
    When I enter details
    Then I see the logged in page

  Scenario: Check invalid login
    Given I am on the login page
    When I enter incorrect details
    Then I see the failed login message