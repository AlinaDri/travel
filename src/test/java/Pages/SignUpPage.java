package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static TravelAgencyTests.HelperFunctions.waitUntilElementIsDisplayed;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;


@Data
public class SignUpPage extends HomePage{

    private SelenideElement firstNameInput = $(byName("firstname"));
    private SelenideElement lastNameInput = $(byName("lastname"));
    private SelenideElement mobileNumberInput = $(byName("phone"));
    private SelenideElement emailInput = $(byName("email"));
    private SelenideElement passwordInput = $(byName("password"));
    private SelenideElement confirmPasswordInput = $(byName("confirmpassword"));

    public void FillInRegistrationForm(){
        waitUntilElementIsDisplayed(firstNameInput, visible);
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("Doe");
        mobileNumberInput.sendKeys("1188");
        emailInput.sendKeys("alina.driksmane+"+ System.currentTimeMillis() +"@testdevlab.com");
        passwordInput.sendKeys("parole");
        confirmPasswordInput.sendKeys("parole");
    }


}
