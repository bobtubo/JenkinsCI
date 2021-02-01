//package step_Definitions;
//
//import base.BaseUtil;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.BlazeLandingPage;
//import pages.BlazeReservePage;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.core.Is.is;
//
//public class BlazeStepDefinition extends BaseUtil {
//    private BaseUtil base;
//
//    public BlazeStepDefinition(BaseUtil base) {
//        this.base = base;
//    }
//
//
//    @Given("I am on the Blaze demo landing page")
//    public void i_am_on_the_blaze_demo_landing_page() {
//
//        base.driver.manage().window().maximize();
//        base.driver.get("https://blazedemo.com/index.php");
//
//    }
//
//    @When("I choose {string} and {string} from the dropdown list")
//    public void i_choose_and_from_the_dropdown_list(String departureCity, String destinationCity) {
//        BlazeLandingPage blazeLandingPage = new BlazeLandingPage(base.driver);
//        blazeLandingPage.selectDepartureCity(departureCity);
//        blazeLandingPage.selectDestinationCity(destinationCity);
//        blazeLandingPage.findFlightButton();
//
//    }
//    @Then("I should be able to see {string} and {string} on the Blaze demo reserve page")
//    public void i_should_be_able_to_see_and_on_the_blaze_demo_reserve_page(String  departureCity, String destinationCity) {
//        BlazeReservePage blazeReservePage = new BlazeReservePage(base.driver);
//        assertThat(blazeReservePage.getFlightDetails().contains(departureCity),is(true));
//        assertThat(blazeReservePage.getFlightDetails().contains(destinationCity),is(true));
//        assertThat(base.driver.getTitle(), is(equalTo("BlazeDemo - reserve")));
//
//    }
//
//}
