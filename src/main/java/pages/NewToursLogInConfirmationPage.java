package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToursLogInConfirmationPage extends BasePage{
    public NewToursLogInConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3")
    private WebElement headingLocator;
    @FindBy(xpath = "//td/p[1]/font/b")
    private WebElement thankYouLocator;


    public String getHeaderText(){
        return headingLocator.getText();
    }
    public String getThankYouText(){
        return thankYouLocator.getText();
    }

}
