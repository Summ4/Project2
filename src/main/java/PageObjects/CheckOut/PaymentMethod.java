package PageObjects.CheckOut;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaymentMethod {

    public SelenideElement termsNConditionsCheckbox = $(By.xpath("//input[@type='checkbox' and @name='agree']"));

    public SelenideElement continueButton = $(By.id("button-payment-method"));

}
