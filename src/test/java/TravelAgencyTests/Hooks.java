package TravelAgencyTests;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.driver;

public class Hooks {
    @Before
    public void beforeScenario(){
        clearBrowserCache();
        clearBrowserCookies();
    }

    @After
    public void closeBrowser(){
        driver().close();
    }
}
