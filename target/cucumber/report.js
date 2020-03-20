$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/ContactDeletion.feature");
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
  "duration": 4457078669,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 3409674903,
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
  "duration": 6579508184,
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
  "duration": 116658536753,
  "status": "passed"
});
});