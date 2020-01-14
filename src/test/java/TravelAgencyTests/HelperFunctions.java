package TravelAgencyTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class HelperFunctions {

    public static void waitUntilElementIsDisplayed(SelenideElement element, Condition condition, Integer time){
        element.waitUntil(condition, time);
    }

    public static void waitUntilElementIsDisplayed(SelenideElement element, Condition condition){
        element.waitUntil(condition, 10000);
    }
}
