package TravelAgencyTests;

import cucumber.api.java.Before;
import org.junit.After;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class Hooks {
    @Before
    public void openBrowser(){
        clearBrowserCache();
        clearBrowserCookies();
    }

    @After
    public void closeBrowser(){
        closeBrowser();
    }
}
