package step_Definitions;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;

    }
    @Before
    public void initialise(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        base.driver = new ChromeDriver();

    }

    @After
    public void teardown() throws InterruptedException, IOException{
        screenShot();
        
        Thread.sleep(2000);
        base.driver.quit();


    }

    private void screenShot() throws IOException {
        TakesScreenshot scrshot = ((TakesScreenshot) base.driver);
        File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("target/Screenshot" + System.currentTimeMillis() + ".png"));
    }
}
