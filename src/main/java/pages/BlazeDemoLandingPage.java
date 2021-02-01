package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlazeDemoLandingPage extends BasePage{
    public BlazeDemoLandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement departureCityLocator;
    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement destinationCityLocator;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement findFlightsButtonLocator;


    public void selectDepartureCity(String cityname){
        selectFromDropDownUsingVisibilityOfText(departureCityLocator, cityname);
    }
    public void selectDestinationCity(String cityname){
        selectFromDropDownUsingVisibilityOfText(destinationCityLocator, cityname);
    }
    public void clickOnFindFlights(){
//        findFlightsButtonLocator.click();
        click(findFlightsButtonLocator);
    }
}
