package PageObjects.CheckOut;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BillingDetailsSection {

    public SelenideElement fName = $(By.id("input-payment-firstname"));

    public SelenideElement lName = $(By.id("input-payment-lastname"));

    public SelenideElement address = $(By.id("input-payment-address-1"));

    public SelenideElement city = $(By.id("input-payment-city"));

    public SelenideElement postCode = $(By.id("input-payment-postcode"));

    public SelenideElement country = $(By.id("input-payment-country"));

    public SelenideElement region = $(By.id("input-payment-zone"));

    public SelenideElement newAddressRadioBtn = $(By.xpath("//input[@name='payment_address' and @value='new']/parent::label"));

    public SelenideElement continueButton = $(By.id("button-payment-address"));

    public SelenideElement billingDetails = $(By.xpath("//a[text()='Step 2: Billing Details ']"));

    public SelenideElement payment_new = $(By.xpath("//div[@id='payment-new' and @style='display: block;']"));


}
