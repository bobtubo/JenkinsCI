package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursSignOnPage extends BasePage {
    public NewToursSignOnPage(WebDriver driver) {
        super(driver);
    }
// This is interrogation meaning identifying the web element
    @FindBy(css = "input[name='userName']")
    private WebElement userNameLocator;

    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;

    @FindBy(css = "input[name='submit']")
    private WebElement submitButton;

    public void enterUsername(String username){
        sendKeys(userNameLocator, username);
    }

    public void enterPassword(String password){
        sendKeys(passwordLocator, password);
    }

    public void clickSubmit(){
        click(submitButton);
    }
}
