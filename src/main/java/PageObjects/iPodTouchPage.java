package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class iPodTouchPage {

    public SelenideElement addToCart = $(By.id("button-cart"));

    public SelenideElement shoppingCart = $(By.id("cart"));

    public SelenideElement itemQuantityElement = $(By.id("input-quantity"));

    public SelenideElement itemPrice = $(By.xpath("//h2[contains(text(),'$')]"));

}
