package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class iPodTouchPage {

    public SelenideElement addToCart = $(By.id("button-cart")),
            shoppingCart = $(By.id("cart")),
            itemQuantityElement = $(By.id("input-quantity")),
            itemPrice = $(By.xpath("//h2[contains(text(),'$')]"));

}
