//package step_Definitions;
//
//import base.BaseUtil;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.Select;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class UKbaStepDefinition extends BaseUtil {
//    private BaseUtil base;
//
//    public UKbaStepDefinition(BaseUtil base) {
//        this.base = base;
//    }
//    @Given("I am on the UKBA website")
//    public void i_am_on_the_ukba_website() {
//
//      //  base.driver.get("https://www.gov.uk/check-uk-visa/y");
//        base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");
//    }
//
//    @When("I provide the nationality of {string}")
//    public void i_provide_the_nationality_of(String country) {
//
//        Select select = new Select(base.driver.findElement(By.id("response")));
//        select.selectByVisibleText(country);
//       // base.driver.findElement(By.id("response"));
//    }
//
//    @When("I click on the next step button")
//    public void i_click_on_the_next_step_button() {
//
//        base.driver.findElement(By.xpath("//button[contains(text(), 'Next step')]")).click();
//    }
//
//    @When("I select the reason {string}")
//    public void i_select_the_reason(String reason) {
//
//        base.driver.findElement(By.id("response-2")).click();
//    }
//
//    @When("I state that I am intending to stay for more than {int} months")
//    public void i_state_that_i_am_intending_to_stay_for_more_than_months(Integer int1) {
//
//        base.driver.findElement(By.id("response-1")).click();
//
//    }
//    @When("I submit the form")
//    public void i_submit_the_form() {
//
//        i_click_on_the_next_step_button();
//
//    }
//    @Then("I will be informed that {string}")
//    public void i_will_be_informed_that(String msg) {
//
//        assertThat(base.driver.findElement(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).getText(), is(equalTo(msg)));
//
//    }
//}
