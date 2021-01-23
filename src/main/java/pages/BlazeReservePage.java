package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlazeReservePage extends BasePage {
    public BlazeReservePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3")
    private WebElement flightDetailsLocator;
    @FindBy(xpath = "//input[@type='submit']")
    private List<WebElement> chooseFlightButtonsLocators;

    public String getFlightDetails(){
        return flightDetailsLocator.getText();

    }
    public int getNumberOfChoice(){
        return chooseFlightButtonsLocators.size();

    }
}
