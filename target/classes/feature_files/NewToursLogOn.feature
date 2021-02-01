#@RunallTest
Feature: As a User I want to be able to sign in to Mercury Tours so that i can access my account
  @Testtorun
Scenario: Sign in with valid details (Happy path)
Given I am on the Newtours Landing page
When I click on the SignOn link
And  i enter valid Username as "GAde" and valid Password as "123456"
Then I should be able to sign into my account


  @TesttorunAA
  Scenario: Sign in with invalid details
    Given I am on the Newtours Landing page
    When I click on the SignOn link
    And  i enter invalid Username as "GAde3737" and valid Password as "12345633322"
    Then I should remain on the SignOn page