package TravelAgencyTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "TravelAgencyTests",
        features = {"src/test/resources/TravelAgencyTests/"},
        plugin = {"pretty","io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm", "json:target/cucumber-reports/file.json"}
)
public class RunCucumberTest {
}
