//package step_Definitions;
//
//import base.BaseUtil;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.BlazeLandingPage;
//import pages.BlazeReservePage;
//import pages.NewToursRegisterPage;
//import pages.NewToursWelcomePage;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.core.Is.is;
//
//public class NewToursStepDefinition extends BaseUtil {
//    private BaseUtil base;
//
//    public NewToursStepDefinition(BaseUtil base) {
//        this.base = base;
//    }
//
//    @Given("I am on the NewTours landing page")
//    public void i_am_on_the_new_tours_landing_page() {
//      base.driver.manage().window().maximize();
//      base.driver.get("http://demo.guru99.com/test/newtours/index.php");
//    }
//
//
//    @When("I click on the {string} link")
//    public void i_click_on_the_link(String string) {
//        NewToursWelcomePage newToursWelcomePage = new NewToursWelcomePage(base.driver);
//        newToursWelcomePage.clickOnRegisterLink();
//    }
//    @When("I enter all the contact information as {string},{string},{string} and {string}")
//    public void i_enter_all_the_contact_information_as_and(String fName, String lName, String phone, String email) {
//        NewToursRegisterPage newToursRegisterPage = new NewToursRegisterPage(base.driver);
//        newToursRegisterPage.enterFirstname(fName);
//        newToursRegisterPage.enterLastname(lName);
//        newToursRegisterPage.enterPhoneNumber(phone);
//        newToursRegisterPage.enterEmail(email);
//
//    }
//    @When("I enter mailing information as {string},{string},{string}, {string}, and {string}")
//    public void i_enter_mailing_information_as_and(String address, String city, String state, String postcode, String country) {
//        NewToursRegisterPage newToursRegisterPage = new NewToursRegisterPage(base.driver);
//        newToursRegisterPage.enterAddress(address);
//        newToursRegisterPage.enterCity(city);
//        newToursRegisterPage.enterState(state);
//        newToursRegisterPage.enterPostalCode(postcode);
//        newToursRegisterPage.selectCountry(country);
//    }
//    @When("I enter user information as {string} and {string}")
//    public void i_enter_user_information_as_and(String uName, String pWord) {
//        NewToursRegisterPage newToursRegisterPage = new NewToursRegisterPage(base.driver);
//        newToursRegisterPage.enterUsername(uName);
//        newToursRegisterPage.enterPassword(pWord);
//
//    }
//    @Then("I should be able to create a new user and verify with {string},{string} and {string}")
//    public void i_should_be_able_to_create_a_new_user_and_verify_with_and(String fName, String lName, String uName) {
//        NewToursRegisterPage newToursRegisterPage = new NewToursRegisterPage(base.driver);
////        assertThat(newToursRegisterPage.);
//    }
//
//}
