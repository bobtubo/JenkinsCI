package step_defintions;

import base.BaseUtil;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageCalculatorPage;
import utilities.PropertiesReader;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MortgageCalculatorStepDefinitions  extends BaseUtil {
    private BaseUtil base;

    public MortgageCalculatorStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Mortgage Calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws Exception {
        PropertiesReader propertiesReader = new PropertiesReader();
        base.driver.get(propertiesReader.getMortgageCalcURL());

    }

    @When("I enter {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_enter_and(String hValue, String dPayment, String iRate, String lTerm, String sMonth, String sYear) {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.enterHomeValue(hValue);
        mortgageCalculatorPage.enterDownpaymentAmount(dPayment);
        mortgageCalculatorPage.enterInterestRate(iRate);
        mortgageCalculatorPage.enterLoanTerm(lTerm);
        mortgageCalculatorPage.selectStartMonth(sMonth);
        mortgageCalculatorPage.enterStartYear(sYear);
        mortgageCalculatorPage.clickOnSubmitButton();
    }
    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {

    }
    @Then("I should get mortage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortage_offer_with_and(String tMonthlyPaymentAmount, String dPaymentAmount, String dPaymentPerc, String lPayoffDate, String tIntRate, String mTaxPaid) {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        assertThat(mortgageCalculatorPage.getTotalMonthlyPaymentAMount(), is(equalTo(tMonthlyPaymentAmount)));
        assertThat(mortgageCalculatorPage.getDownPaymentAmount(), is(equalTo(dPaymentAmount)));
        assertThat(mortgageCalculatorPage.getDownPaymentPercentage(), is(equalTo(dPaymentPerc)));
        assertThat(mortgageCalculatorPage.getLoanPayoffDate(), is(equalTo(lPayoffDate)));
        assertThat(mortgageCalculatorPage.getTotalInterestPaid(), is(equalTo(tIntRate)));
//        assertThat(mortgageCalculatorPage.getMonthlyTaxPaid(), is(equalTo(mTaxPaid)));

        //Using List array

        List<String> arrayListOfTax = Arrays.asList("$199.00", "$201.00", mTaxPaid, "$200.00");
assertThat(arrayListOfTax, hasItem(mortgageCalculatorPage.getMonthlyTaxPaid()));

    }

    @When("I enter the following")
    public void iEnterTheFollowing(List<List<String>> data ) {

        //http://www.thinkcode.se/blog/2018/06/30/data-tables-in-cucumber-3

//        https://cucumber.io/docs/cucumber/api/?sbsearch=DataTable
MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
//        List<String> data = table.asList(String.class);
        mortgageCalculatorPage.enterHomeValue(data.get(1).get(1));
        mortgageCalculatorPage.enterDownpaymentAmount(data.get(2).get(1));
        mortgageCalculatorPage.enterInterestRate(data.get(3).get(1));
        mortgageCalculatorPage.enterLoanTerm(data.get(4).get(1));
        mortgageCalculatorPage.selectStartMonth(data.get(5).get(1));
        mortgageCalculatorPage.enterStartYear(data.get(6).get(1));
        mortgageCalculatorPage.clickOnSubmitButton();

    }
}
