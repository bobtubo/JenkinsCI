package step_defintions;

import base.BaseUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.*;
import utilities.PropertiesReader;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursLogonStepDefinitions extends BaseUtil {
    private BaseUtil base;


    public NewtoursLogonStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    private void closePopUp() throws InterruptedException {
        //A way to close the advert pop up
        Thread.sleep(2000);
        //go into the iframe
        base.driver.switchTo().frame("flow_close_btn_iframe");
        base.driver.findElement(By.xpath("//*[@id='closeBtn']")).click();
        //come out of the iframe
        base.driver.switchTo().defaultContent();
    }

    @When("I click on the SignOn link")
    public void i_click_on_the_sign_on_link() {
        NewToursWelcomePage newtoursWelcomePage = new NewToursWelcomePage(base.driver);
        newtoursWelcomePage.clickOnSignOnLink();
    }

    @When("i enter valid Username as {string} and valid Password as {string}")
    public void i_enter_valid_username_as_and_valid_password_as(String uName, String pWord) throws Exception {
        NewToursSignOnPage newtoursSignOnPage = new NewToursSignOnPage(base.driver);
        closePopUp();
//        newtoursSignOnPage.enterUsername(uName);
//        newtoursSignOnPage.enterPassword(pWord);


        //Using propertiesReader to get the valid username and password
        PropertiesReader propertiesReader = new PropertiesReader();
        newtoursSignOnPage.enterUsername(propertiesReader.getNewtoursValidUsername());
        newtoursSignOnPage.enterPassword(propertiesReader.getNewtoursValidPassword());
        newtoursSignOnPage.clickOnSubmitButton();

    }
    @Then("I should be able to sign into my account")
    public void i_should_be_able_to_sign_into_my_account() throws InterruptedException {
        closePopUp();
        assertThat(base.driver.getTitle(), is (equalTo("Login: Mercury Tours")));
        NewToursLogInConfirmationPage newtoursLoginConfirmationPage = new NewToursLogInConfirmationPage(base.driver);
        assertThat(newtoursLoginConfirmationPage.getHeaderText().toLowerCase(), is (equalTo("login successfully")));
        assertThat(newtoursLoginConfirmationPage.getThankYouText().equalsIgnoreCase("Thank you for Loggin."),is(true));
    }

    @When("i enter invalid Username as {string} and valid Password as {string}")
    public void i_enter_invalid_username_as_and_valid_password_as(String uName, String pWord) throws InterruptedException {
        NewToursSignOnPage newtoursSignOnPage = new NewToursSignOnPage(base.driver);
        closePopUp();
        newtoursSignOnPage.enterUsername(uName);
        newtoursSignOnPage.enterPassword(pWord);
        newtoursSignOnPage.clickOnSubmitButton();
    }

    @Then("I should remain on the SignOn page")
    public void iShouldRemainOnTheSignOnPage() throws InterruptedException {
        closePopUp();
        assertThat(base.driver.getTitle(), is (equalTo("Sign-on: Mercury Tours")));


    }
}
