Feature: Google Search functionality
  Agile Story: As a user, when I am on google
  search page, I should be able to search whatever
  I want, and see relevant information

  Scenario: user search title verification
    Given User is on Google on page
    When User searches for apple
    Then User should see apple in the title