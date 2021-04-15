$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/TestProjectLoginDemo.feature");
formatter.feature({
  "name": "Test Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check the Test project login page is successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser page is open",
  "keyword": "Given "
});
formatter.match({
  "location": "TestProjectLogin.browser_page_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "And "
});
formatter.match({
  "location": "TestProjectLogin.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "TestProjectLogin.user_enters_the_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login page",
  "keyword": "And "
});
formatter.match({
  "location": "TestProjectLogin.user_clicks_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestProjectLogin.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});