package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterConfirmationPage extends BasePage {
    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//td/p[1]/font/b")
    private WebElement dearTextLocator;
    @FindBy (xpath = "//p[3]/font/b")
    private WebElement noteTextLocator;

    public String getDearText(){
        return dearTextLocator.getText();
    }

    public String getNoteText(){
        String a = noteTextLocator.getText();
        return a;
    }

}
