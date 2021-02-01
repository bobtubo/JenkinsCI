@RunallTest
Feature: As a a first time buyer I want to be able to use mixture of some default  values and my chosen values to calculate mortgage rates

#  @MortgageCalc
  Scenario Outline: Calculate Mortgage rate with given values and default values
    Given I am on the Mortgage Calculator website
    When I enter "<homeValue>", "<downPayment>", "<interestRate>", "<loanTerm>", "<startMonth>" and "<startYear>"
    And accept default value for all the remaining values
    Then I should get mortage offer with "<totalMonthlyPayment>", "<downPaymentAMount>", "<downPaymentPercentage>", "<loanPayoffDate>", "<totalInterestPaid>" and "<monthlyTaxPaid>"
    Examples:
      | homeValue | downPayment | interestRate | loanTerm | startMonth | startYear | totalMonthlyPayment | downPaymentAMount | downPaymentPercentage | loanPayoffDate | totalInterestPaid | monthlyTaxPaid |
      | 50000     | 20000       | 5            | 25       | Sep        | 2020      | $458.71             | $20,000.00        | 40.00%                | Aug, 2045      | $22,613.10        | $203.00        |
#      | 50000     | 20000       | 5            | 25       | Dec        | 2020      | $458.71             | $20,000.00        | 40.00%                | Nov, 2045      | $22,613.10        | $200.00        |


  @MortgageCalc
  Scenario Outline: Calculate Mortgage rate with given values and default values
    Given I am on the Mortgage Calculator website
    When I enter the following
      | field        | Value |
      | homeValue    | 50000 |
      | downPayment  | 20000 |
      | interestRate | 5     |
      | loanTerm     | 25    |
      | startMonth   | Sep   |
      | startYear    | 2020  |
    And accept default value for all the remaining values
    Then I should get mortage offer with "<totalMonthlyPayment>", "<downPaymentAMount>", "<downPaymentPercentage>", "<loanPayoffDate>", "<totalInterestPaid>" and "<monthlyTaxPaid>"
    Examples:
      | totalMonthlyPayment | downPaymentAMount | downPaymentPercentage | loanPayoffDate | totalInterestPaid | monthlyTaxPaid |
      | $458.71             | $20,000.00        | 40.00%                | Aug, 2045      | $22,613.10        | $203.00        |