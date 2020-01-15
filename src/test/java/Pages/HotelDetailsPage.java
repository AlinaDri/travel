package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Data
public class HotelDetailsPage extends HomePage{

    private SelenideElement hotelRating = $x("//div[@class='rating-item rating-inline']");
    private SelenideElement bestOffer = $x("test");
    private SelenideElement bestOfferButton = $x("//button");

    public void getHotelRatingsAndPrice(int stars){
        double price = 10000.0;
        for(int i = 0; i < 20; i++ ){ // looks at first 20 hotels listed
            for(int j = stars; j < 6; j++){ // checks for ratings of at least 3 stars
                bestOffer = $x("//*[@data-stars='"+j+"']");
                double val = Double.parseDouble(bestOffer.getAttribute("data-price"));
                if(val < price) { //checks if offered price is lowest so far
                    price = val;
                    bestOffer = $x("//*[@data-price='"+price+"']");
                    bestOfferButton = $x("//*[@data-price='"+price+"']//button");
                }
            }
        }
    }

    public void SelectBestOffer(){
        bestOffer.scrollIntoView(false);
        bestOfferButton.click();
    }

    public void CheckHotelDetails(){
        hotelRating.isDisplayed();
    }

}
