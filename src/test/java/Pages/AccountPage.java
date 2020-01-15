package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

@Data
public class AccountPage extends SignUpPage {

    public void CheckPersonalInformation(){
        getFirstName().shouldHave(Condition.value("John"));
        getLastName().shouldHave(Condition.value("Doe"));
        getMobileNumber().shouldHave(Condition.value("1188"));
        getEmail().shouldHave(Condition.value(getGeneratedEmail()));
    }
}
