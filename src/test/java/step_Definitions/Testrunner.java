package step_Definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Bobby\\IdeaProjects\\uiFunctional\\src\\main\\resources\\feature_files",
//        plugin = {"pretty", "html:target/Myreport"}, tags = "@Test")

        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber/cucumber-report.json",
                "junit:target/cucumber.xml"
        }, tags="@Test")


public class Testrunner {
}
