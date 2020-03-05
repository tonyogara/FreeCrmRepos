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
        "adam_first",
        "adam_last",
        "adam_middle",
        "adam_company"
      ],
      "line": 17,
      "id": "check-contact-creation;check-contact-creationx;;2"
    },
    {
      "cells": [
        "bob_first",
        "bob_last",
        "bob_middle",
        "bob_company"
      ],
      "line": 18,
      "id": "check-contact-creation;check-contact-creationx;;3"
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
  "name": "user enters first name \"adam_first\" and last name \"adam_last\" and middle name \"adam_middle\" and company name \"adam_company\"",
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
  "duration": 5517340208,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 542690547,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_see_the_logged_in_page()"
});
formatter.result({
  "duration": 873822579,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_select_the_contact_link()"
});
formatter.result({
  "duration": 405253243,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_the_New_button()"
});
formatter.result({
  "duration": 245390624,
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
    },
    {
      "val": "adam_company",
      "offset": 110
    }
  ],
  "location": "CreateContactStepSpec.user_enters(String,String,String,String)"
});
formatter.result({
  "duration": 23027263343,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Pauls-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1881:8563:84d5:2bcc%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.2\u0027, java.version: \u002712\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: /var/folders/c7/mc9yy41d19d...}, goog:chromeOptions: {debuggerAddress: localhost:61018}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 61238a9cd4717c7eedbf1bc1b609d5da\n*** Element info: {Using\u003dxpath, value\u003dhtml[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\n\tat com.qa.FreeCrm.pages.ContactPage.selectFirstOptionCompanyName(ContactPage.java:92)\n\tat com.qa.FreeCrm.StepSpecifications.CreateContactStepSpec.user_enters(CreateContactStepSpec.java:72)\n\tat ✽.And user enters first name \"adam_first\" and last name \"adam_last\" and middle name \"adam_middle\" and company name \"adam_company\"(src/main/resources/Features/ContactCreation.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "Check contact creationx",
  "description": "",
  "id": "check-contact-creation;check-contact-creationx;;3",
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
  "name": "user enters first name \"bob_first\" and last name \"bob_last\" and middle name \"bob_middle\" and company name \"bob_company\"",
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
  "duration": 4528313395,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_enter_details()"
});
formatter.result({
  "duration": 566536885,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_see_the_logged_in_page()"
});
formatter.result({
  "duration": 860448653,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.i_select_the_contact_link()"
});
formatter.result({
  "duration": 391901466,
  "status": "passed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_the_New_button()"
});
formatter.result({
  "duration": 182639174,
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
    },
    {
      "val": "bob_company",
      "offset": 107
    }
  ],
  "location": "CreateContactStepSpec.user_enters(String,String,String,String)"
});
formatter.result({
  "duration": 22553756638,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]\"}\n  (Session info: chrome\u003d80.0.3987.122)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Pauls-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1881:8563:84d5:2bcc%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.2\u0027, java.version: \u002712\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: /var/folders/c7/mc9yy41d19d...}, goog:chromeOptions: {debuggerAddress: localhost:61047}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 4a62c329e351704f1e59014d8c7f9ab5\n*** Element info: {Using\u003dxpath, value\u003dhtml[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[3]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\n\tat com.qa.FreeCrm.pages.ContactPage.selectFirstOptionCompanyName(ContactPage.java:92)\n\tat com.qa.FreeCrm.StepSpecifications.CreateContactStepSpec.user_enters(CreateContactStepSpec.java:72)\n\tat ✽.And user enters first name \"bob_first\" and last name \"bob_last\" and middle name \"bob_middle\" and company name \"bob_company\"(src/main/resources/Features/ContactCreation.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateContactStepSpec.select_save_button()"
});
formatter.result({
  "status": "skipped"
});
});