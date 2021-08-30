package PageObjects.CheckOut;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BillingDetailsSection {

    public SelenideElement fName = $(By.id("input-payment-firstname")),
            lName = $(By.id("input-payment-lastname")),
            address = $(By.id("input-payment-address-1")),
            city = $(By.id("input-payment-city")),
            postCode = $(By.id("input-payment-postcode")),
            country = $(By.id("input-payment-country")),
            region = $(By.id("input-payment-zone")),
            newAddressRadioBtn = $(By.xpath("//input[@name='payment_address' and @value='new']/parent::label")),
            continueButton = $(By.id("button-payment-address")),
            billingDetails = $(By.xpath("//a[text()='Step 2: Billing Details ']")),
            payment_new = $(By.xpath("//div[@id='payment-new' and @style='display: block;']"));


}
