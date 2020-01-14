package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Data
public class HomePage {

    private SelenideElement accountDropdown = $x("//div[@class='dropdown dropdown-login dropdown-tab']")    ;
    private SelenideElement accountDropdownSignUpButton = $(byText("Sign Up"));
    public SelenideElement getButtonByText(String text) {
        return $x("//button[contains(text(), '" + text + "')]");
    }
    public SelenideElement getItemByText(String text){
        return $x("//a[contains(text(), '"+text+"')]");
    }

    public void NavigateToSignUpPage() {
        accountDropdown.click();
        accountDropdownSignUpButton.click();
    }
}
