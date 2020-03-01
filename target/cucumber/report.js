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
  "name": "Check contact creationx",
  "description": "",
  "id": "check-contact-creation;check-contact-creationx",
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
  "line": 6,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the logged in page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the contact link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "select the New button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters first name \"\u003cfirstname\u003e\" and last name \"\u003clastname\u003e\" and middle name \"\u003cmiddlename\u003e\" and company name \"\u003ccompanyname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select save button",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 13,
      "value": "#Then the contact is saved successfully"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "check-contact-creation;check-contact-creationx;",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "middlename",
        "companyname"
      ],
      "line": 16,
      "id": "check-contact-creation;check-contact-creationx;;1"
    },
    {
      "cells": [
        "adam",
        "ant",
        "middle_name",
        "adam_company"
      ],
      "line": 17,
      "id": "check-contact-creation;check-contact-creationx;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Check contact creationx",
  "description": "",
  "id": "check-contact-creation;check-contact-creationx;;2",
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
  "line": 6,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the logged in page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the contact link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "select the New button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters first name \"adam\" and last name \"ant\" and middle name \"middle_name\" and company name \"adam_company\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select save button",
  "keyword": "And "
});
formatter.match({
  "location": "CreateContactStepSpec.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 7483998321,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 537913116,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_see_the_logged_in_page()"
});
formatter.result({
  "duration": 1061692004,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_select_the_contact_link()"
});
formatter.result({
  "duration": 409169180,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_the_New_button()"
});
formatter.result({
  "duration": 192933958,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adam",
      "offset": 24
    },
    {
      "val": "ant",
      "offset": 45
    },
    {
      "val": "middle_name",
      "offset": 67
    },
    {
      "val": "adam_company",
      "offset": 98
    }
  ],
  "location": "CreateContactStepSpec.user_enters(String,String,String,String)"
});
formatter.result({
  "duration": 2427030991,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_save_button()"
});
formatter.result({
  "duration": 201020032,
  "status": "passed"
});
});