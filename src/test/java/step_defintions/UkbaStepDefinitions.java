package step_defintions;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UkbaStepDefinitions extends BaseUtil {
    private BaseUtil base;


    public UkbaStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the UKBA website")
    public void i_am_on_the_ukba_website() {
        base.driver.manage().window().maximize();
//base.driver.get("https://www.gov.uk/check-uk-visa/y");
        base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");
        base.driver.findElement(By.xpath("//button[contains(text(),'Accept all cookies')]")).click();


    }

    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        Select select = new Select(base.driver.findElement(By.id("response")));
        select.selectByVisibleText(countryName);
    }

    @When("I click on the Next step button")
    public void i_click_on_the_next_step_button() {
        base.driver.findElement(By.xpath("//button[contains(text(),'Next step')]")).click();

    }

    @When("I select the reason {string}")
    public void i_select_the_reason(String reasonForStudy) {
        base.driver.findElement(By.id("response-2")).click();

    }

    @When("I state I am intending to stay for more than {int} months")
    public void i_state_i_am_intending_to_stay_for_more_than_months(Integer int1) {
        base.driver.findElement(By.id("response-1")).click();

    }

    @When("I submit the form")
    public void i_submit_the_form() {
        i_click_on_the_next_step_button();

    }

    @Then("I will be informed {string}")
    public void i_will_be_informed(String msg) {
        assertThat(base.driver.findElement(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).getText(), is(equalTo(msg)));

    }

    @And("I select the reason as {string}")
    public void iSelectTheReasonAs(String reason) {
        base.driver.findElement(By.id("response-0")).click();
    }

    @And("I state that I am not visiting a partner of family")
    public void iStateThatIAmNotVisitingAPartnerOfFamily() throws InterruptedException {
//        Thread.sleep(2000);
        base.driver.findElement(By.id("response-1")).click();
    }
}
