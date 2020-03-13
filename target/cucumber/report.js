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
  "name": "I am on the homepage page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter login details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I retrieve contact detail \"adam\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can delete the contact details successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactDeletionStepSpec.i_am_on_the_homepage_page()"
});
formatter.result({
  "duration": 4349473627,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 3339790911,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adam",
      "offset": 27
    }
  ],
  "location": "ContactDeletionStepSpec.i_retrieve_contact_detail(String)"
});
formatter.result({
  "duration": 6988924118,
  "status": "passed"
});
formatter.match({
  "location": "ContactDeletionStepSpec.i_can_delete_the_contact_details_successfully()"
});
formatter.result({
  "duration": 37707591438,
  "status": "passed"
});
});