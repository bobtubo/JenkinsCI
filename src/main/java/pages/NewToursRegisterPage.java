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

    @FindBy(css = "input[name='userName']")
    private WebElement emailLocator;

    @FindBy(css = "input[name='address1']")
    private WebElement address1Locator;

    @FindBy(css = "input[name='city']")
    private WebElement cityLocator;

    @FindBy(css = "input[name='state']")
    private WebElement stateLocator;

    @FindBy(css = "input[name='postalCode']")
    private WebElement postalCodeLocator;

    @FindBy(css = "input[name='country']")
    private WebElement countryLocator;

    @FindBy(css = "input[name='email']")
    private WebElement usernameLocator;

    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;

    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmLocator;

    @FindBy(css = "input[name='submit']")
    private WebElement submitButtonLocator;

    public void enterFirstname(String firstname){
        sendKeys(firstNameLocator, firstname);
    }

    public void enterLastname(String lastname){
        sendKeys(lastNameLocator, lastname);
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

    public void enterCity(String city){
        sendKeys(cityLocator, city);

    }
    public void enterState(String state){
        sendKeys(stateLocator, state);
    }

    public void enterPostalCode(String postalcode){
        sendKeys(postalCodeLocator, postalcode);

    }

    public void selectCountry(String country){
        selectFromDropDownListUsingVisibilityOfText(countryLocator, country);

    }
    public void enterUsername(String username){
        sendKeys(usernameLocator, username);
    }
    public void enterPassword(String password){
        sendKeys(passwordLocator, password);
    }
    public void confirmPassword(String confirm){
        sendKeys(confirmLocator, confirm);

    }
    public void clickSubmit(){
        click(submitButtonLocator);

    }

}
