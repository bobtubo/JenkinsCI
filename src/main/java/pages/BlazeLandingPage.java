//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class BlazeLandingPage extends BasePage{
//    public BlazeLandingPage(WebDriver driver) {
//        super(driver);
//    }
//    @FindBy(xpath = "//select[@name='fromPort']")
//    private WebElement departureCityLocator;
//
//    @FindBy(xpath = "//select[@name='toPort']")
//    private WebElement destinationCityLocator;
//
//    @FindBy(xpath = "//input[@type='submit']")
//    private WebElement submitFlightLocator;
//
//
//    public void selectDepartureCity(String cityName){
//        selectFromDropDownListUsingVisibilityOfText(departureCityLocator, cityName);
//    }
//    public void selectDestinationCity(String destinationCityName){
//        selectFromDropDownListUsingVisibilityOfText(destinationCityLocator, destinationCityName);
//    }
//    public void findFlightButton() {
////        submitFlightLocator.click(); /selenium click method
////        using our own method defined in the basePage
//        click(submitFlightLocator);
//    }
//}
