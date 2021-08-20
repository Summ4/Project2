package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartWindow {

    public SelenideElement cartItemPrice = $(By.xpath("//tbody//td[@class='text-right'][last()]"));

    public SelenideElement cartItemQuantiny = $(By.xpath("//td[contains(text(),'x ')]"));

    public SelenideElement cartItemShipping = $(By.xpath("//tbody/tr[2]/td[2]"));

    public SelenideElement checkOut = $(By.xpath("//strong[text()=' Checkout']"));

}
