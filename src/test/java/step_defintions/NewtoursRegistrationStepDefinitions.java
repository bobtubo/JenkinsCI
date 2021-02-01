package step_defintions;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewToursRegisterPage;
import pages.NewToursWelcomePage;
import utilities.PropertiesReader;
import utilities.Storage;
import utilities.Utility;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursRegistrationStepDefinitions extends BaseUtil {
    private BaseUtil base;


    public NewtoursRegistrationStepDefinitions(BaseUtil base) {
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

    @Given("I am on the Newtours Landing page")
    public void i_am_on_the_newtours_landing_page() throws Exception {
        base.driver.manage().window().maximize();
//        base.driver.get("http://demo.guru99.com/test/newtours/index.php");

        //Using static method to get Url properties
//        base.driver.get(PropertiesReader.getNewtoursURL());

        //Using non static method
        PropertiesReader propertiesReader = new PropertiesReader();
base.driver.get(propertiesReader.getNewtoursURL());
        closePopUp();
    }

    @When("i Click on {string} link")
    public void i_click_on_link(String string) {
        NewToursWelcomePage newtoursWelcomePage = new NewToursWelcomePage(base.driver);
        newtoursWelcomePage.clickOnRegisterLink();


    }

    @When("I enter all the contact information as {string}, {string}, {string} and {string}")
    public void i_enter_all_the_contact_information_as_and(String fName, String lName, String pNumber, String email) throws InterruptedException {
        closePopUp();
        Storage.setRandomNumbers(Utility.generateRandomNumbers());
        System.out.println("Genearted random number is : " + Storage.getRandomNumbers());
        NewToursRegisterPage newtoursRegisterPage = new NewToursRegisterPage(base.driver);
        newtoursRegisterPage.enterFirstName(fName);
        newtoursRegisterPage.enterLastName(lName);
        newtoursRegisterPage.enterPhoneNumber(pNumber);
        newtoursRegisterPage.enterEmail(Storage.getRandomNumbers()+email);

    }

    @When("I enter Mailing information as {string}, {string}, {string}, {string} and {string}")
    public void i_enter_mailing_information_as_and(String address, String city, String state, String postcode, String country) {
        NewToursRegisterPage newtoursRegisterPage = new NewToursRegisterPage(base.driver);
        newtoursRegisterPage.enterAddress(address);
        newtoursRegisterPage.enterCityName(city);
        newtoursRegisterPage.enterStateName(state);
        newtoursRegisterPage.enterPostcode(postcode);
        newtoursRegisterPage.selectCountry(country.toUpperCase());

    }

    @When("I enter User information as {string} and {string}")
    public void i_enter_user_information_as_and(String username, String password) {
        NewToursRegisterPage newtoursRegisterPage = new NewToursRegisterPage(base.driver);
        newtoursRegisterPage.enterUserName(username);
        newtoursRegisterPage.enterPassword(password);
        newtoursRegisterPage.enterConfirmPassword(password);
        newtoursRegisterPage.clickOnSubmitButton();

    }

    @Then("I should be able to create a new User and verify with {string}, {string} and {string}")
    public void i_should_be_able_to_create_a_new_user_and_verify_with_and(String fName, String lName, String uName) throws InterruptedException {
        closePopUp();
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
        assertThat(newtoursRegisterConfirmationPage.getDearText().contains(fName), equalTo(true));
        assertThat(newtoursRegisterConfirmationPage.getDearText().contains(lName), equalTo(true));

        assertThat(newtoursRegisterConfirmationPage.getNoteText().contains(uName), equalTo(true));

    }

    @And("I enter Mailing information as {string}, {string}, {string}, {string} and country {int} on the list")
    public void iEnterMailingInformationAsAndCountryOnTheList(String address, String city, String state, String postcode, int index) {
        NewToursRegisterPage newtoursRegisterPage = new NewToursRegisterPage(base.driver);
        newtoursRegisterPage.enterAddress(address);
        newtoursRegisterPage.enterCityName(city);
        newtoursRegisterPage.enterStateName(state);
        newtoursRegisterPage.enterPostcode(postcode);
        newtoursRegisterPage.selectCountry(index);
    }
}
