package pages;

public interface IMortgageCalculator {
    void enterHomeValue(String hValue);

    void enterDownpaymentAmount(String dPaymentAmount);

    void enterInterestRate(String intRate);

    void enterLoanTerm(String loanTerm);

    void selectStartMonth(String sMonth);

    void enterStartYear(String startYear);

    void clickOnSubmitButton();

    String getTotalMonthlyPaymentAMount();

    String getDownPaymentAmount();

    String getDownPaymentPercentage();

    String getLoanPayoffDate();

    String getTotalInterestPaid();

    String getMonthlyTaxPaid();
}
