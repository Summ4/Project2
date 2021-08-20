package PageObjects.CheckOut;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DeliveryMethod {

    public SelenideElement continueButton = $(By.id("button-shipping-method"));
}
