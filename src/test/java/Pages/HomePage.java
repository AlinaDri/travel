package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static TravelAgencyTests.HelperFunctions.waitUntilElementIsDisplayed;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;

@Data
public class HomePage {

    private SelenideElement accountDropdown = $x("//div[@class='dropdown dropdown-login dropdown-tab']");
    private SelenideElement homePageTab = $(byTitle("home"));
    private SelenideElement accountDropdownSignUpButton = $(byText("Sign Up"));
    private SelenideElement destinationField = $(byId("s2id_autogen1"));
    private SelenideElement destinationInput = $$("input.select2-input").filter(visible).get(0);
    private SelenideElement destinationCountry = $x("//div[contains(text(),'Latvia')]");
    private SelenideElement checkInDateButton = $(byId("checkin"));
    private SelenideElement checkOutDateButton = $(byId("checkout"));
    private SelenideElement adultCountPlus = $$x("//button[@type='button' and contains(text(),'+')]").filter(visible).get(0);
    private SelenideElement childrenCountPlus =  $$x("//button[@type='button' and contains(text(),'+')]").filter(visible).get(1);
    public SelenideElement getButtonByText(String text) {
        return $x("//button[contains(text(), '" + text + "')]");
    }
    public SelenideElement getItemByText(String text){
        return $x("//a[contains(text(), '"+text+"')]");
    }
    public SelenideElement getDate(String checkDate){
        return $$x("//div[contains(text(), '"+checkDate+"')]").filter(visible).get(0);
    }

    public void NavigateToSignUpPage() {
        getButtonByText("Got it!").click();
        accountDropdown.click();
        accountDropdownSignUpButton.click();
    }
    public void EnterDestination(String destinationName){
        destinationField.click();
        destinationInput.sendKeys(destinationName);
        destinationCountry.click();
    }
    public void EnterCheckinAndCheckoutDates(int checkInDateNr, int checkOutDateNr){
        String checkInDate = Integer.toString(checkInDateNr);
        String checkOutDate = Integer.toString(checkOutDateNr);
        checkInDateButton.click();
        waitUntilElementIsDisplayed(getDate(checkInDate), visible);
        getDate(checkInDate).click();
        checkOutDateButton.click();
        waitUntilElementIsDisplayed(getDate(checkOutDate), visible);
        getDate(checkOutDate).click();

    }
    public void CheckHomePageElements(){
        accountDropdown.isDisplayed();
        destinationInput.isDisplayed();
    }
    public void NavigateToHomePage(){
        homePageTab.click();
        waitUntilElementIsDisplayed(destinationField,visible);
    }
    public void EnterAdultAndChildAmount(int adultCount, int childrenCount){
        for(int i = 2; i < adultCount; i++){
            adultCountPlus.click();
        }
        for(int i = 0; i < childrenCount; i++){
            childrenCountPlus.click();
        }

    }
}
