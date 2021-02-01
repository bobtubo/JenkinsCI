package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursRegisterPage extends BasePage{
    public NewToursRegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "input[name='firstName']")
    private WebElement firstNameLocator;
    @FindBy(css = "input[name='lastName']")
    private WebElement lastNameLocator;
    @FindBy(css = "input[name='phone']")
    private WebElement phoneLocator;
    @FindBy(id = "userName")
    private WebElement emailLocator;
    @FindBy(css = "input[name='address1']")
    private WebElement address1Locator;
    @FindBy(css = "input[name='city']")
    private WebElement cityLocator;

    @FindBy(css = "input[name='state']")
    private WebElement stateOrProvinceLocator;
    @FindBy(css = "input[name='postalCode']")
    private WebElement postcodeLocator;

    @FindBy(css = "select[name='country']")
    private WebElement countryLocator;
    @FindBy(css = "input[name='email']")
    private WebElement usernameLocator;

    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;
    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPasswordLocator;

    @FindBy(css = "input[name='submit']")
    private WebElement submitButtonLocator;


    public void enterFirstName(String name){
        sendKeys(firstNameLocator, name);
    }
    public void enterLastName(String name){
        sendKeys(lastNameLocator, name);
    }
    public void enterPhoneNumber(String phone){
        sendKeys(phoneLocator, phone);
    }
    public void enterEmail(String email){
        sendKeys(emailLocator, email);
    }
    public void enterAddress(String address){
        sendKeys(address1Locator, address);
    }
    public void enterCityName(String name){
        sendKeys(cityLocator, name);
    }
    public void enterStateName(String state){
        sendKeys(stateOrProvinceLocator, state);
    }
    public void enterPostcode(String postcode){
        sendKeys(postcodeLocator, postcode);
    }
    public void selectCountry(String country){
        selectFromDropDownUsingVisibilityOfText(countryLocator, country);
    }
    public void selectCountry(int countryIndex){
        selectFromDropDownUsingIndex(countryLocator, countryIndex);

    }
    public void enterUserName(String name){
        sendKeys(usernameLocator, name);
    }
    public void enterPassword(String password){
        sendKeys(passwordLocator, password);
    }
    public void enterConfirmPassword(String password){
        sendKeys(confirmPasswordLocator, password);
    }

    public void clickOnSubmitButton(){
        click(submitButtonLocator);
    }

}
