
@all
Feature: User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  dashboard should be displayed.
  Accounts are: librarian, student, admin
# @wip # this annottions help us group and smoke and regression test

  @librarian
  Scenario: Login as librarian
    Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard


  @student
  Scenario: Login as Student
    Given user is on the login page
    Then user enters student username
    When user enters student password
    And user should see the dashboard


    @admin
    Scenario: Login as Admin
      Given user is on the login page
      Then user enters admin username
      When user enters admin password
      And user should see the dashboard



