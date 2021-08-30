package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartWindow {

    public SelenideElement cartItemPrice = $(By.xpath("//tbody//td[@class='text-right'][last()]")),
            cartItemQuantiny = $(By.xpath("//td[contains(text(),'x ')]")),
            checkOut = $(By.xpath("//strong[text()=' Checkout']"));

}
