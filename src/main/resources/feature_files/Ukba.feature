#@RunallTest
Feature: Confirm whether a visa is required to visit the UK

Background:
Given I am on the UKBA website
#  @Testtorun
  Scenario: Japan nationalities coming to UK to study for more than 6 months require Visa
    When I provide nationality of "Japan"
    And I click on the Next step button
    And I select the reason "Study"
    And I click on the Next step button
    And I state I am intending to stay for more than 6 months
    And I submit the form
    Then I will be informed "You’ll need a visa to study in the UK"

#  @Testtorun
  Scenario Outline: Japan nationalities coming to UK to study for more than 6 months require Visa with Examples
    When I provide nationality of "<CountryName>"
    And I click on the Next step button
    And I select the reason "<Reason>"
    And I click on the Next step button
    And I state I am intending to stay for more than 6 months
    And I submit the form
    Then I will be informed "<Message>"
    Examples:
      | CountryName | Reason | Message                               |
      | Japan       | Study  | You’ll need a visa to study in the UK |
      | Ukraine     | Study  | You’ll need a visa to study in the UK |
      | Morocco     | Study  | You’ll need a visa to study in the UK |
      | USA         | Study  | You’ll need a visa to study in the UK |

#  @Testtorun
  Scenario: Japan nationalities coming to UK for Tourism do not require Visa
    When I provide nationality of "Japan"
    And I click on the Next step button
    And I select the reason as "Tourism"
    And I submit the form
    Then I will be informed "You won’t need a visa to come to the UK"

#  @Testtorun
  Scenario Outline: Nationalities coming to UK for Tourism do not require Visa Using scenario outline with examples
    When I provide nationality of "<CountryName>"
    And I click on the Next step button
    And I select the reason as "<Reason>"
    And I submit the form
    Then I will be informed "<MessageToBeDisplayed>"
    Examples:
      | CountryName | Reason  | MessageToBeDisplayed                    |
      | Japan       | Tourism | You won’t need a visa to come to the UK |
      | USA         | Tourism | You won’t need a visa to come to the UK |
      | Malaysia    | Tourism | You won’t need a visa to come to the UK |
      | Canada      | Tourism | You won’t need a visa to come to the UK |


#  @Testtorun
  Scenario: Russia nationalities coming to UK for Tourismand not visiting Family will require Visa
    When I provide nationality of "Russia"
    And I click on the Next step button
    And I select the reason as "Tourism"
    And I click on the Next step button
    And I state that I am not visiting a partner of family
    And I submit the form
    Then I will be informed "You’ll need a visa to come to the UK"

  @RunallTest
  Scenario Outline: Nationalities coming to UK for Tourism and not visiting Family will require Visa with Examples
    When I provide nationality of "<CountryName>"
    And I click on the Next step button
    And I select the reason as "<Reason>"
    And I click on the Next step button
    And I state that I am not visiting a partner of family
    And I submit the form
    Then I will be informed "<Descision>"
    Examples:
      | CountryName | Reason  | Descision                            |
      | Russia      | Tourism | You’ll need a visa to come to the UK |
      | Cuba        | Tourism | You’ll need a visa to come to the UK |
      | Belarus     | Tourism | You’ll need a visa to come to the UK |
      | Albania     | Tourism | You’ll need a visa to come to the UK |