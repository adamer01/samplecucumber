$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/adamer01/Documents/Selenuim Practise/Test Scripts/samplecucumber/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "SuccessfulLogin with valid credentails",
  "description": "",
  "id": "login-feature;successfullogin-with-valid-credentails",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is in on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user navigates to login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click login buttons",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_is_in_on_Homepage()"
});
formatter.result({
  "duration": 62838883139,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_navigates_to_login()"
});
formatter.result({
  "duration": 13422,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.User_enter_username_and_password()"
});
formatter.result({
  "duration": 2098919092,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_click_login_buttons()"
});
formatter.result({
  "duration": 12509337047,
  "status": "passed"
});
});