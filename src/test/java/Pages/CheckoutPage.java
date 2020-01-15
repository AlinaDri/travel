package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static TravelAgencyTests.HelperFunctions.waitUntilElementIsDisplayed;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;


@Data
public class CheckoutPage extends HotelDetailsPage{

    private SelenideElement checkOutFirstName = $(byName("first_name"));
    private SelenideElement checkOutLastName = $(byName("last_name"));
    private SelenideElement checkOutMobileNumber = $(byName("number"));
    private SelenideElement checkOutEmail = $(byName("email"));
    /// Purchase hotel booking page
    private SelenideElement totalTitle = $x("//span[contains(text(),'Your total is')]");
    private SelenideElement roomReservation = $x("//div[contains(text(),'Room Reservation')]");

    public void CheckCheckoutForm(){
       waitUntilElementIsDisplayed(checkOutFirstName,visible);
       checkOutFirstName.shouldBe(visible);
       checkOutLastName.shouldBe(visible);
       checkOutMobileNumber.shouldBe(visible);
       checkOutEmail.shouldBe(visible);
    }
    
    public void FillInCheckoutForm(){
        checkOutFirstName.sendKeys("John");
        checkOutLastName.sendKeys("Doe");
        checkOutMobileNumber.sendKeys("1188");
        checkOutEmail.sendKeys("alina.driksmane+"+ System.currentTimeMillis() +"@testdevlab.com");

    }

    public void CheckPurchasePage(){
        waitUntilElementIsDisplayed(totalTitle,visible);
        totalTitle.shouldBe(visible);
        roomReservation.shouldBe(visible);
    }

}
