$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Purchase.feature");
formatter.feature({
  "name": "Mobile purchase validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mobile"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launches flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "MobilevalidationSteps.user_launches_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User handles login",
  "keyword": "And "
});
formatter.match({
  "location": "MobilevalidationSteps.user_handles_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile purchase validation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mobile"
    },
    {
      "name": "@map"
    }
  ]
});
formatter.step({
  "name": "User search mobile by using Oned map",
  "rows": [
    {
      "cells": [
        "name1",
        "iPhone"
      ]
    },
    {
      "cells": [
        "name2",
        "SONY"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MobilevalidationSteps.user_search_mobile_by_using_Oned_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the mobile and click add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "MobilevalidationSteps.user_select_the_mobile_and_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User doing the payment",
  "keyword": "And "
});
formatter.match({
  "location": "MobilevalidationSteps.user_doing_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User receive the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MobilevalidationSteps.user_receive_the_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});