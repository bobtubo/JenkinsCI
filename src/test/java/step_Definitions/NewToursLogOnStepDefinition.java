package step_Definitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewToursLogInConfirmationPage;
import pages.NewToursRegisterPage;
import pages.NewToursSignOnPage;
import pages.NewToursWelcomePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewToursLogOnStepDefinition extends BaseUtil {
    private BaseUtil base;

    public NewToursLogOnStepDefinition(BaseUtil base) {
        this.base = base;
    }

//    @Given("I am on the NewTours landing page")
//    public void i_am_on_the_new_tours_landing_page() {
//      base.driver.manage().window().maximize();
//      base.driver.get("http://demo.guru99.com/test/newtours/index.php");

//    }
    @When("I click on the SignOn link")
    public void i_click_on_the_sign_on_link() {
        NewToursWelcomePage newToursWelcomePage = new NewToursWelcomePage(base.driver);
        newToursWelcomePage.clickOnSignOnLink();
    }



    @When("I enter valid username as {string} and Password as {string}")
    public void i_enter_valid_username_as_and_password_as(String uName, String pWord) {
        NewToursSignOnPage newToursSignOnPage = new NewToursSignOnPage(base.driver);
        newToursSignOnPage.enterUsername(uName);
        newToursSignOnPage.enterPassword(pWord);
        newToursSignOnPage.clickSubmit();

    }
    @Then("I should be able to sign into my account")
    public void i_should_be_able_to_sign_into_my_account() {
        NewToursLogInConfirmationPage newToursLogInConfirmationPage = new NewToursLogInConfirmationPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Login: Mercury Tours")));
        assertThat(newToursLogInConfirmationPage.getHeaderText(), is (equalTo("Login Successfully")));
        assertThat(newToursLogInConfirmationPage.getThankYou().equalsIgnoreCase("Thank you for Loggin."),is(true));
    }

}
