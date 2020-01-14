package TravelAgencyTests;

import Pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class SignUpAndLoginSteps {
   private SignUpPage signUpPage = new SignUpPage();

    @Given("I am in Sign Up page")
    public void iAmInSignUpPage() {
        open("https://www.phptravels.net/home");
        signUpPage.NavigateToSignUpPage();
    }

    @When("I enter valid user details in Register section")
    public void iEnterValidUserDetailsInRegisterSection() {
        signUpPage.FillInRegistrationForm();
    }

    @And("I click on {string}")
    public void iClick(String button) {
        signUpPage.getButtonByText(button).click();
        sleep(5000);
    }

    @And("My Account page is open")
    public void myAccountPageIsOpen() {
        signUpPage.getItemByText("My profile").isDisplayed();
    }

    @And("I click on {string} tab")
    public void iClickOnTab(String tabName) {
        signUpPage.getItemByText(tabName).click();
    }

    @Then("My profile section is opened")
    public void myProfileSectionIsOpened() {

    }

    @And("Correct personal information is displayed")
    public void correctPersonalInformationIsDisplayed() {
    }

    @Given("I have account created")
    public void iHaveAccountCreated() {
        open("https://www.phptravels.net/home");
        signUpPage.NavigateToSignUpPage();

    }
}