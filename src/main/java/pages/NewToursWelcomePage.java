package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursWelcomePage extends BasePage{
    public NewToursWelcomePage(WebDriver driver) {
        super(driver);
    }

@FindBy(linkText = "SIGN-ON")
    private WebElement signOnLinkLocator;
    @FindBy(linkText = "REGISTER")
    private WebElement RegistLinkLocator;
    @FindBy(linkText = "SUPPORT")
    private WebElement supportLinkLocator;
    @FindBy(linkText = "CONTACT")
    private WebElement contactLinkLocator;
    @FindBy(css = "input[name='userName']")
    private WebElement usernameLocator;
    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;
    @FindBy(css = "input[name='submit']")
    private WebElement submitButtonLocator;

public void clickOnSignOnLink(){
    click(signOnLinkLocator);
}
    public void clickOnRegisterLink(){
        click(RegistLinkLocator);
    }
    public void clickOnSupportLink(){
        click(supportLinkLocator);
    }
    public void clickOnContactLink(){
        click(contactLinkLocator);
    }
    public void enterUsername(String username){
    sendKeys(usernameLocator, username);
    }
    public void enterPassword(String password){
        sendKeys(passwordLocator, password);
    }
    public void clickOnSubmitButton(){
    click(submitButtonLocator);
    }



}
