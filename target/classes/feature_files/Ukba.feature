Feature: Confirm whether a visa is required to visit UK
#  @Test
  Scenario: Japan Nationalities coming to UK for Study
    Given I am on the UKBA website
    When I provide the nationality of "Japan"
    And I click on the next step button
    And I select the reason "Study"
    And I click on the next step button
    And I state that I am intending to stay for more than 6 months
    When I submit the form
    Then I will be informed that "You’ll need a visa to study in the UK"
#  @Test
  Scenario Outline: Japan Nationalities coming to UK for Study
    Given I am on the UKBA website
    When I provide the nationality of "<countryname>"
    And I click on the next step button
    And I select the reason "<reason>"
    And I click on the next step button
    And I state that I am intending to stay for more than 6 months
    When I submit the form
    Then I will be informed that "<message>"

    Examples:
      | countryname | reason | message                               |
      | Japan       | Study  | You’ll need a visa to study in the UK |
      | Ukraine     | Study  | You’ll need a visa to study in the UK |