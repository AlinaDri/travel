package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static TravelAgencyTests.HelperFunctions.waitUntilElementIsDisplayed;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;


@Data
public class SignUpPage extends HomePage{

    private SelenideElement firstName = $(byName("firstname"));
    private SelenideElement lastName = $(byName("lastname"));
    private SelenideElement mobileNumber = $(byName("phone"));
    private SelenideElement email = $(byName("email"));
    private SelenideElement password = $(byName("password"));
    private SelenideElement confirmPassword = $(byName("confirmpassword"));
    private String generatedEmail = "alina.driksmane+"+ System.currentTimeMillis() +"@testdevlab.com";

    public void FillInRegistrationForm(){
        waitUntilElementIsDisplayed(firstName, visible);
        firstName.sendKeys("John");
        lastName.sendKeys("Doe");
        mobileNumber.sendKeys("1188");
        email.sendKeys(generatedEmail);
        password.sendKeys("parole");
        confirmPassword.sendKeys("parole");
    }

}
