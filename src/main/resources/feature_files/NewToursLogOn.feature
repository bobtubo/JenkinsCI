Feature: As a user, I want to be able to sign into my account in the Mercury tours website
  @Test
  Scenario: Sign in with valid details (Happy path)

    Given I am on the NewTours landing page
    When I click on the SignOn link
    And I enter valid username as "GAde" and Password as "123456"
    Then I should be able to sign into my account

