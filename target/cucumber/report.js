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
      "cells": [
        "adam_first",
        "adam_last",
        "adam_middle",
        "adam_first adam_lastw"
      ],
      "line": 16,
      "id": "check-contact-creation;check-contact-creation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
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
  "name": "user enters first name \"adam_first\" and last name \"adam_last\" and middle name \"adam_middle\"",
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
  "name": "the contact is saved successfully as saved \"adam_first adam_lastw\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateContactStepSpec.i_am_on_the_login_page()"
});
formatter.result({
  "duration": 3925303981,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 725656029,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_see_the_logged_in_page()"
});
formatter.result({
  "duration": 978709835,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_select_the_contact_link()"
});
formatter.result({
  "duration": 455244162,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_the_New_button()"
});
formatter.result({
  "duration": 273742047,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adam_first",
      "offset": 24
    },
    {
      "val": "adam_last",
      "offset": 51
    },
    {
      "val": "adam_middle",
      "offset": 79
    }
  ],
  "location": "CreateContactStepSpec.user_enters(String,String,String)"
});
formatter.result({
  "duration": 2357120303,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_save_button()"
});
formatter.result({
  "duration": 90959583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adam_first adam_lastw",
      "offset": 44
    }
  ],
  "location": "CreateContactStepSpec.the_contact_is_saved_successfully_as_saved(String)"
});
formatter.result({
  "duration": 696020850,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cadam_first adam_last[w]\u003e but was:\u003cadam_first adam_last[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.qa.FreeCrm.StepSpecifications.CreateContactStepSpec.the_contact_is_saved_successfully_as_saved(CreateContactStepSpec.java:102)\n\tat ✽.Then the contact is saved successfully as saved \"adam_first adam_lastw\"(src/main/resources/Features/ContactCreation.feature:12)\n",
  "status": "failed"
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
  "duration": 3586265576,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 468598705,
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
  "duration": 1352470187,
  "status": "passed"
});
formatter.match({
  "location": "ContactDeletionStepSpec.i_can_delete_the_contact_details_successfully()"
});
formatter.result({
  "duration": 797661558,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Pauls-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:10e3:7c3d:4129:687c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.2\u0027, java.version: \u002712\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: /var/folders/c7/mc9yy41d19d...}, goog:chromeOptions: {debuggerAddress: localhost:63680}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 66eba46ca2ebb2efa91270d3d9e1d488\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\n\tat com.qa.FreeCrm.pages.RubbishBinPage.purgeFirstElementInRubishBinTable(RubbishBinPage.java:39)\n\tat com.qa.FreeCrm.StepSpecifications.ContactDeletionStepSpec.i_can_delete_the_contact_details_successfully(ContactDeletionStepSpec.java:52)\n\tat ✽.Then I can delete the contact details successfully(src/main/resources/Features/ContactDeletion.feature:8)\n",
  "status": "failed"
});
});