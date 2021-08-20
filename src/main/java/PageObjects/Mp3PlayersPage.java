package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Mp3PlayersPage {

    public SelenideElement iPodTouchImg = $(By.xpath("//img[@title='iPod Touch']"));

    public SelenideElement afterHoverText = $(By.xpath("//img[@title='iPod Touch']"));

    public SelenideElement iPodTouch = $(By.xpath("//a[text()='iPod Touch']"));


}
