#@RunallTest
Feature:

#  @Testtorun
  Scenario Outline: Register by  entering all information  requested (both mandatory and non-mandatory information)

    Given I am on the Newtours Landing page
    When i Click on "REGISTER" link
    And I enter all the contact information as "<FirstName>", "<LastName>", "<PhoneNUmber>" and "<Email>"
    And I enter Mailing information as "<Address>", "<City>", "<State>", "<PostCode>" and "<Country>"
    And I enter User information as "<Username>" and "<Password>"
    Then I should be able to create a new User and verify with "<FirstName>", "<LastName>" and "<Username>"
    Examples:
      | FirstName | LastName | PhoneNUmber | Email              | Address          | City      | State | PostCode | Country        | Username | Password |
      | Lateef    | Ade      | 0788366643  | boggaley@gmail.com | 29 alderney road | LOndon    | Kent  | da7 4ek  | UNited KINGDOM | lAde     | 123456   |
      | LateefA   | AdeAA    | 0788366644  | boggaley@gmail.com | 33 alderney road | Maidstone | Kent  | db4 4ek  | Greece         | Tomiwa   | 123456   |


#  @Testtorun
  Scenario Outline: Register by  entering contact information and User information
    Given I am on the Newtours Landing page
    When i Click on "REGISTER" link
    And I enter all the contact information as "<FirstName>", "<LastName>", "<PhoneNUmber>" and "<Email>"
    And I enter User information as "<Username>" and "<Password>"
    Then I should be able to create a new User and verify with "<FirstName>", "<LastName>" and "<Username>"
    Examples:
      | FirstName | LastName | PhoneNUmber | Email              | Username | Password |
      | LateefB    | AdeB      | 078836656  | boggaley@gmail.com | GAde     | 123456   |

#  @Testtorun
  Scenario Outline: Register by  entering all information  requested with country Number

    Given I am on the Newtours Landing page
    When i Click on "REGISTER" link
    And I enter all the contact information as "<FirstName>", "<LastName>", "<PhoneNUmber>" and "<Email>"
    And I enter Mailing information as "<Address>", "<City>", "<State>", "<PostCode>" and country 6 on the list
    And I enter User information as "<Username>" and "<Password>"
    Then I should be able to create a new User and verify with "<FirstName>", "<LastName>" and "<Username>"
    Examples:
      | FirstName | LastName | PhoneNUmber | Email              | Address          | City      | State | PostCode  | Username | Password |
      | Lateef    | Ade      | 0788366643  | boggaley@gmail.com | 29 alderney road | LOndon    | Kent  | da7 4ek  | lAde     | 123456   |

