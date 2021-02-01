package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlazeDemoReservePage extends BasePage{
    public BlazeDemoReservePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//h3")
    private WebElement flightdetailsLocator;
    @FindBy(xpath = "//input[@type='submit']")
    private List<WebElement> chooseThisFlightButtonLocators;

    public String getFlightDetails(){
        return flightdetailsLocator.getText();
    }

    public int getNumberofChooseThisFlightButtons(){
        return chooseThisFlightButtonLocators.size();
    }
}
