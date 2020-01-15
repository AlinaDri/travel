package TravelAgencyTests;

import Pages.CheckoutPage;
import com.codeborne.selenide.Condition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.sleep;


public class BookingHotelSteps {
    private CheckoutPage pageElements = new CheckoutPage();

    @Given("I am in Home page")
    public void iAmInHomePage() {
        pageElements.NavigateToHomePage();
        pageElements.CheckHomePageElements();
    }

    @When("I set up destination as {string}")
    public void iSetUpDestinationAs(String destinationName) {
        pageElements.EnterDestination(destinationName);
    }

    @And("I select dates {int}-01-20 - {int}-01-20")
    public void iSelectDates(int checkInDateNr, int checkOutDateNr) {
        pageElements.EnterCheckinAndCheckoutDates(checkInDateNr, checkOutDateNr);
    }

    @And("I select {int} adults and {int} children")
    public void iSelectAdultsAndChildren(int adultCount, int childrenCount) {
        pageElements.EnterAdultAndChildAmount(adultCount, childrenCount);
    }

    @And("I click on {string} for first hotel in the list")
    public void iClickOnForFirstHotelInTheList(String detailsButton) {
        pageElements.getButtonByText(detailsButton).click();
    }

    @And("Details page is open for selected hotel")
    public void detailsPageIsOpenForSelectedHotel() {
        pageElements.CheckHotelDetails();
    }

    @And("I click on {string} for first available room")
    public void iClickOnForFirstAvailableRoom(String bookButton) {
        pageElements.getButtonByText(bookButton).scrollIntoView(false);
        pageElements.getButtonByText(bookButton).click();
    }

    @Then("Checkout page is displayed")
    public void checkoutPageIsDisplayed() {
        pageElements.CheckCheckoutForm();

    }

    @And("I enter valid booking information")
    public void iEnterValidBookingInformation() {
        pageElements.FillInCheckoutForm();
    }

    @And("Purchase hotel booking page is displayed")
    public void purchaseHotelBookingPageIsDisplayed() {
        pageElements.CheckPurchasePage();
    }

    @And("I click on Details for the cheapest hotel in the list with a rating above {int} stars")
    public void iClickOnDetailsForTheCheapestHotelInTheListWithARatingAboveStars(int minimumStars) {
        pageElements.getHotelRatingsAndPrice(3);
        pageElements.SelectBestOffer();
    }
}
