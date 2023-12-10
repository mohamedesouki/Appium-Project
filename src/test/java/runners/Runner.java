package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/Features",
        glue = "stepDefinitions",
        plugin = {
                "html:target/cucumber.html"

        }
)
public class Runner extends AbstractTestNGCucumberTests {




}