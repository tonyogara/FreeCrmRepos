$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/ContactCreation.feature");
formatter.feature({
  "line": 1,
  "name": "Check contact creation",
  "description": "",
  "id": "check-contact-creation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Check contact creation",
  "description": "",
  "id": "check-contact-creation;check-contact-creation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Check contact creationx"
    }
  ],
  "line": 5,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter login details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I see the logged in page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select the contact link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "select the New button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters first name \"\u003cfirstname\u003e\" and last name \"\u003clastname\u003e\" and middle name \"\u003cmiddlename\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select save button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the contact is saved successfully as saved \"\u003cDisplayedContactName\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "check-contact-creation;check-contact-creation;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "middlename",
        "DisplayedContactName"
      ],
      "line": 15,
      "id": "check-contact-creation;check-contact-creation;;1"
    },
    {
      "comments": [
        {
          "line": 16,
          "value": "#| adam_first | adam_last | adam_middle | adam_first adam_last |"
        }
      ],
      "cells": [
        "bob_first",
        "bob_last",
        "bob_middle",
        "bob_first bob_last"
      ],
      "line": 17,
      "id": "check-contact-creation;check-contact-creation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "comments": [
    {
      "line": 16,
      "value": "#| adam_first | adam_last | adam_middle | adam_first adam_last |"
    }
  ],
  "line": 17,
  "name": "Check contact creation",
  "description": "",
  "id": "check-contact-creation;check-contact-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Check contact creationx"
    }
  ],
  "line": 5,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter login details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I see the logged in page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I select the contact link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "select the New button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters first name \"bob_first\" and last name \"bob_last\" and middle name \"bob_middle\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select save button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the contact is saved successfully as saved \"bob_first bob_last\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContactStepSpec.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 5199408944,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 533190234,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_see_the_logged_in_page()"
});
formatter.result({
  "duration": 876353584,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_select_the_contact_link()"
});
formatter.result({
  "duration": 463582097,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_the_New_button()"
});
formatter.result({
  "duration": 158158481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bob_first",
      "offset": 24
    },
    {
      "val": "bob_last",
      "offset": 50
    },
    {
      "val": "bob_middle",
      "offset": 77
    }
  ],
  "location": "CreateContactStepSpec.user_enters(String,String,String)"
});
formatter.result({
  "duration": 2268820009,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_save_button()"
});
formatter.result({
  "duration": 88537971,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bob_first bob_last",
      "offset": 44
    }
  ],
  "location": "CreateContactStepSpec.the_contact_is_saved_successfully_as_saved(String)"
});
formatter.result({
  "duration": 602827095,
  "status": "passed"
});
formatter.uri("src/main/resources/Features/ContactDeletion.feature");
formatter.feature({
  "line": 1,
  "name": "Delete Contact",
  "description": "",
  "id": "delete-contact",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check deleting a contact",
  "description": "",
  "id": "delete-contact;check-deleting-a-contact",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter login details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I search contact details for \"bob\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can purge the contact \"bob_first bob_middle bob_last\" details successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContactStepSpec.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 3782533847,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 476387474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bob",
      "offset": 30
    }
  ],
  "location": "ContactDeletionStepSpec.i_retrieve_contact_detail(String)"
});
formatter.result({
  "duration": 1319892293,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bob_first bob_middle bob_last",
      "offset": 25
    }
  ],
  "location": "ContactDeletionStepSpec.i_can_delete_the_contact_details_successfully(String)"
});
formatter.result({
  "duration": 6375076429,
  "status": "passed"
});
});