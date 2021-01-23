Feature:

  @Test
  Scenario Outline: Register by entering all information requested (both mandatory and non mandatory info)
    Given I am on the NewTours landing page
    When I click on the "Register" link
    And I enter all the contact information as "<Firstname>","<Lastname>","<PhoneNumber>" and "<Email>"
    And I enter mailing information as "<Address>","<City>","<State>", "<Postcode>", and "<Country>"
    And I enter user information as "<Username>" and "<Password>"
    Then I should be able to create a new user and verify with "<Firstname>","<Lastname>" and "<Username>"

    Examples:
      | Firstname | Lastname | PhoneNumber | Email                 | Address         | State         | Postcode | Country | City      | Username | Password |
      | ola       | gasame   | 0783025637  | bobgarley@gmail.com   | lewisham rd     | kent          | da14 2jy | Nigeria | gravesend | lolaby   | blue     |
      | Fola      | loikame  | 0765858345  | Sallyximena@yahoo.com | latif@yahoo.com | 70 bromley rd | se13 7lh | NIGER   | London    | spagetti | red      |