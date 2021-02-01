package step_defintions;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BlazeDemoLandingPage;
import pages.BlazeDemoReservePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BlazeDemoStepDefinitions extends BaseUtil {
    private BaseUtil base;


    public BlazeDemoStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the Welcome to Simple Travel Agency landing page")
    public void i_am_on_the_welcome_to_simple_travel_agency_landing_page() {
base.driver.manage().window().maximize();
base.driver.get("https://blazedemo.com/index.php");

    }

    @When("I choose the {string} and {string} from the drop down")
    public void i_choose_the_and_from_the_drop_down(String departureCity, String destinationCity) {
        BlazeDemoLandingPage blazeDemoLandingPage = new BlazeDemoLandingPage(base.driver);
        blazeDemoLandingPage.selectDepartureCity(departureCity);
        blazeDemoLandingPage.selectDestinationCity(destinationCity);
        blazeDemoLandingPage.clickOnFindFlights();

    }
    @Then("I should be able to see {string} and {string} on the BlazeDemo reserve page")
    public void i_should_be_able_to_see_and_on_the_blaze_demo_reserve_page(String departureCity, String destinationCity) {
        BlazeDemoReservePage blazeDemoReservePage = new BlazeDemoReservePage(base.driver);
        assertThat(blazeDemoReservePage.getFlightDetails().contains(departureCity),is(true));
        assertThat(blazeDemoReservePage.getFlightDetails().contains(destinationCity),is(true));

        //check pagetitle is "BlazeDemo - reserve"
        assertThat(base.driver.getTitle(), is(equalTo("BlazeDemo - reserve")));

        //check that there are 5 'Choose the flight' buttons
        assertThat(blazeDemoReservePage.getNumberofChooseThisFlightButtons(), is(equalTo(5)));

    }
}
